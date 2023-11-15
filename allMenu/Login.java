package allMenu;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import Function.UserName;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.sql.*;
import java.awt.Checkbox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
public class Login extends JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement ps=null;
protected static final String Statement = null;
private JPanel contentPane;
private JTextField textField;
private JPasswordField passwordField;

/**
* Launch the application.
*/
public static void main(String[] args) {

EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Login frame = new Login();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
*/
public Login() {	
	//UserName un = new UserName();
	
	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell 5415\\Desktop\\Tg\\nmct.png"));
	setTitle("Login");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 871, 592);
contentPane = new JPanel();
contentPane.setBackground(Color.WHITE);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblUserName = new JLabel("НЭВТРЭХ НЭР");
lblUserName.setBounds(76, 237, 95, 24);
contentPane.add(lblUserName);

textField = new JTextField();
textField.setBackground(Color.LIGHT_GRAY);
textField.setBounds(76, 262, 287, 41);
contentPane.add(textField);
textField.setColumns(10);

JLabel lblPass = new JLabel("НУУЦ ҮГ");
lblPass.setBounds(76, 324, 95, 24);
contentPane.add(lblPass);

passwordField = new JPasswordField();
passwordField.setBackground(Color.LIGHT_GRAY);
passwordField.setBounds(76, 346, 287, 41);
contentPane.add(passwordField);

JButton btnLogin = new JButton("НЭВТРЭХ");
btnLogin.setBackground(Color.LIGHT_GRAY);
btnLogin.setBounds(76, 446, 117, 29);
contentPane.add(btnLogin);

JButton btnSignup = new JButton("БҮРТГҮҮЛЭХ");
btnSignup.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {	
	Register rg = new Register();
	rg.show();
}
});
btnSignup.setBackground(Color.LIGHT_GRAY);
btnSignup.setBounds(246, 446, 117, 29);
contentPane.add(btnSignup);

JButton btnForgetPass = new JButton("НУУЦ ҮГ МАРТСАН");
btnForgetPass.setBackground(Color.LIGHT_GRAY);
btnForgetPass.setBounds(144, 497, 145, 29);
contentPane.add(btnForgetPass);


btnForgetPass.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
ForgetPassword fp = new ForgetPassword();
fp.show();

}

});
JCheckBox Check = new JCheckBox("Show Password");
Check.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(Check.isSelected()) {
			passwordField.setEchoChar((char)0);
		}else {
			passwordField.setEchoChar('*');
		}
	}
});
Check.setBounds(252, 407, 111, 21);
contentPane.add(Check);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\nmct (1).png"));
lblNewLabel.setBounds(34, 85, 111, 100);
contentPane.add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("ШИНЭ МОНГОЛ ");
lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
lblNewLabel_1.setBounds(144, 97, 206, 24);
contentPane.add(lblNewLabel_1);
JLabel lblNewLabel_2 = new JLabel("ТЕХНОЛОГИЙН КОЛЛЕЖ");
lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
lblNewLabel_2.setBounds(142, 123, 294, 24);
contentPane.add(lblNewLabel_2);
JLabel lblNewLabel_3 = new JLabel("");
lblNewLabel_3.setVerticalAlignment(SwingConstants.BOTTOM);
lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\sur.png"));
lblNewLabel_3.setBounds(468, 10, 402, 545);
contentPane.add(lblNewLabel_3);
JLabel lblNewLabel_3_1 = new JLabel("БАГШИЙН БҮРТГЭЛИЙН СИСТЕМ");
lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
lblNewLabel_3_1.setBounds(144, 152, 273, 21);
contentPane.add(lblNewLabel_3_1);
JButton btnNewButton = new JButton("");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		FullModul fm=new FullModul();
		dispose();
		fm.show();
	}
});
btnNewButton.setBackground(new Color(255, 255, 255));
btnNewButton.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\turn-back (1).png"));
btnNewButton.setBounds(0, 0, 30, 30);
contentPane.add(btnNewButton);
btnLogin.addActionListener(new ActionListener() {
	
@SuppressWarnings("deprecation")
@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stubT

String user = textField.getText();
String pass = passwordField.getText();
 ///user = textField.getText();
 //pass = passwordField.getText();
try {	 
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=null;
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel","root","Tuugii0713");
	java.sql.Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select username from b_medeelel where username='"+user+"' and password_='"+pass+"'");
	if(rs.next()) {
		dispose();
		 String username=textField.getText();
		 String password=passwordField.getText();
		 MainMenu mm = new MainMenu(username);
		 mm.show();
		 }else {
			JOptionPane.showMessageDialog(null, "НЭВТРЭХ НЭР ЭСВЭЛ НУУЦ ҮГ БУРУУ БАЙНА.");
		}
	}catch(ClassNotFoundException e1) {
		System.out.println(e1);
	}
catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
});
} 
}
