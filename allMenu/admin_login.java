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
public class admin_login extends JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement ps=null;
protected static final String Statement = null;
private JPanel contentPane;
private JTextField a_user;
private JPasswordField a_pass;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
admin_login frame = new admin_login();
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
public admin_login() {
	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell 5415\\Desktop\\Tg\\nmct.png"));
	setTitle("Login");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 848, 567);
contentPane = new JPanel();
contentPane.setBackground(Color.WHITE);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblUserName = new JLabel("АДМИН НЭВТРЭХ НЭР");
lblUserName.setBounds(76, 242, 136, 24);
contentPane.add(lblUserName);

a_user = new JTextField();
a_user.setBackground(Color.LIGHT_GRAY);
a_user.setBounds(76, 267, 287, 41);
contentPane.add(a_user);
a_user.setColumns(10);

JLabel lblPass = new JLabel("АДМИН НУУЦ ҮГ");
lblPass.setBounds(76, 334, 117, 24);
contentPane.add(lblPass);

a_pass = new JPasswordField();
a_pass.setBackground(Color.LIGHT_GRAY);
a_pass.setBounds(76, 356, 287, 41);
contentPane.add(a_pass);

JButton btnLogin = new JButton("НЭВТРЭХ");
btnLogin.setBackground(Color.LIGHT_GRAY);
btnLogin.setBounds(164, 457, 117, 29);
contentPane.add(btnLogin);
JCheckBox Check = new JCheckBox("Show Password");
Check.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(Check.isSelected()) {
			a_pass.setEchoChar((char)0);
		}else {
			a_pass.setEchoChar('*');
		}
	}
});
Check.setBounds(264, 414, 99, 21);
contentPane.add(Check);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\nmct (1).png"));
lblNewLabel.setBounds(34, 105, 111, 100);
contentPane.add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\sur.png"));
lblNewLabel_1.setBounds(445, 0, 394, 558);
contentPane.add(lblNewLabel_1);
JLabel lblNewLabel_1_1 = new JLabel("ШИНЭ МОНГОЛ ");
lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
lblNewLabel_1_1.setBounds(135, 119, 200, 24);
contentPane.add(lblNewLabel_1_1);
JLabel lblNewLabel_2 = new JLabel("ТЕХНОЛОГИЙН КОЛЛЕЖ");
lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
lblNewLabel_2.setBounds(133, 141, 313, 30);
contentPane.add(lblNewLabel_2);
JLabel lblNewLabel_3_1 = new JLabel("БАГШИЙН БҮРТГЭЛИЙН СИСТЕМ");
lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
lblNewLabel_3_1.setBounds(135, 171, 273, 21);
contentPane.add(lblNewLabel_3_1);
JButton btnNewButton = new JButton("");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		FullModul fm=new FullModul();
		dispose();
		fm.show();
	}
});
btnNewButton.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\turn-back (1).png"));
btnNewButton.setBackground(Color.WHITE);
btnNewButton.setBounds(0, 0, 30, 30);
contentPane.add(btnNewButton);
btnLogin.addActionListener(new ActionListener() {
	
@SuppressWarnings("deprecation")
@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
String user = a_user.getText();
String pass = a_pass.getText();
try {	 
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=null;
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel","root","Tuugii0713");
	java.sql.Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from admin_user_login where a_user_name='"+user+"' and a_password='"+pass+"'");
	if(rs.next()) {
		admin_main am = new admin_main(user);
		dispose();
		am.show();
		}else {
			JOptionPane.showMessageDialog(null, "Sha");
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

