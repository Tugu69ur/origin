package allMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FullModul extends JFrame {

private JPanel contentPane;

private JFrame frame;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
FullModul frame = new FullModul();
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

public FullModul() {
	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell 5415\\Desktop\\Tg\\nmct.png"));
setTitle("FullModul");
setBackground(new Color(238, 238, 238));
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//setDefaultCloseOperation(JFrame.MAXIMIZED_BOTH);
setBounds(100, 100, 869, 556);
contentPane = new JPanel();
contentPane.setBackground(new Color(255, 255, 255));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);

JLabel lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\nmct (1).png"));

JButton btnStudent = new JButton("");
btnStudent.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
btnStudent.setBackground(new Color(255, 255, 255));
ImageIcon malgai=new ImageIcon(this.getClass().getResource("/hat.png"));
btnStudent.setIcon(malgai);

JButton btnLibrary = new JButton("");
btnLibrary.setBackground(new Color(255, 255, 255));
ImageIcon nom =new ImageIcon(this.getClass().getResource("/open-book.png"));
btnLibrary.setIcon(nom);

JButton btnOther = new JButton("");
btnOther.setBackground(new Color(255, 255, 255));
btnOther.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		admin_login aln = new admin_login();
		dispose();
		aln.show();	
	}
});
ImageIcon dh =new ImageIcon(this.getClass().getResource("/document (1).png"));
btnOther.setIcon(dh);

JButton btnTeacher = new JButton("");
btnTeacher.setBackground(new Color(255, 255, 255));
btnTeacher.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
Login ln = new Login();
dispose();
ln.show();

}

});
ImageIcon zbh=new ImageIcon(this.getClass().getResource("/teacher (1).png"));
btnTeacher.setIcon(zbh);
JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\sur.png"));
JLabel lblNewLabel_1_1 = new JLabel("ШИНЭ МОНГОЛ ");
lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
JLabel lblNewLabel_2 = new JLabel("ТЕХНОЛОГИЙН КОЛЛЕЖ");
lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
JLabel lblNewLabel_3 = new JLabel("ЦОГЦ МОДУЛЬ");
lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
GroupLayout gl_contentPane = new GroupLayout(contentPane);
gl_contentPane.setHorizontalGroup(
	gl_contentPane.createParallelGroup(Alignment.LEADING)
		.addGroup(gl_contentPane.createSequentialGroup()
			.addGap(25)
			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(95)
					.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(100))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(295))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(93)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(95)
					.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(186))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(45)
					.addComponent(btnTeacher, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(56)
					.addComponent(btnStudent, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(69))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(45)
					.addComponent(btnLibrary, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(56)
					.addComponent(btnOther, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(69)))
			.addGap(47)
			.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
);
gl_contentPane.setVerticalGroup(
	gl_contentPane.createParallelGroup(Alignment.LEADING)
		.addGroup(gl_contentPane.createSequentialGroup()
			.addGap(55)
			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(68))
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(54)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(41))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(89)
					.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)))
			.addGap(35)
			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(btnTeacher, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
				.addComponent(btnStudent, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
			.addGap(34)
			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(btnLibrary, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
				.addComponent(btnOther, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
			.addGap(44))
		.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
			.addContainerGap()
			.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
);
contentPane.setLayout(gl_contentPane);
}
}
