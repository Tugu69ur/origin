package allMenu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class ForgetPassword extends JFrame {

private JPanel contentPane;
private JTextField textField;
private JPasswordField passwordField;
private JPasswordField passwordField_1;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
ForgetPassword frame = new ForgetPassword();
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
public ForgetPassword() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 716, 458);
contentPane = new JPanel();
contentPane.setBackground(Color.WHITE);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JPanel panel = new JPanel();
panel.setBounds(350, -16, 378, 446);
contentPane.add(panel);

JPanel panel_1 = new JPanel();
panel_1.setBounds(56, 19, 218, 63);
contentPane.add(panel_1);

JLabel lblNewLabel = new JLabel("Username");
lblNewLabel.setBounds(35, 112, 106, 22);
contentPane.add(lblNewLabel);

textField = new JTextField();
textField.setBackground(Color.LIGHT_GRAY);
textField.setBounds(45, 135, 247, 37);
contentPane.add(textField);
textField.setColumns(10);

JLabel lblNewLabel_1 = new JLabel("New Password");
lblNewLabel_1.setBounds(35, 184, 104, 22);
contentPane.add(lblNewLabel_1);

JLabel lblNewLabel_2 = new JLabel("Repeat Password");
lblNewLabel_2.setBounds(35, 256, 106, 16);
contentPane.add(lblNewLabel_2);

passwordField = new JPasswordField();
passwordField.setBackground(Color.LIGHT_GRAY);
passwordField.setBounds(45, 207, 247, 37);
contentPane.add(passwordField);

passwordField_1 = new JPasswordField();
passwordField_1.setBackground(Color.LIGHT_GRAY);
passwordField_1.setBounds(45, 294, 247, 37);
contentPane.add(passwordField_1);

JButton btnConfirm = new JButton("Confirm");
btnConfirm.setBounds(55, 343, 117, 29);
contentPane.add(btnConfirm);

JLabel lblFail = new JLabel();
lblFail.setBounds(184, 348, 123, 46);
contentPane.add(lblFail);

btnConfirm.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
Login ln = new Login();
String pass_1 = passwordField.getName();
String pass_2 = passwordField_1.getName();

if(pass_1.equals("PIZDA") == pass_2.equals("PIZDA")) {
ln.show();
}
else {
lblFail.setText("failed");
}


}

});

}
}
