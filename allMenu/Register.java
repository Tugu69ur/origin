package allMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField rName;
	private JTextField rLastName;
	private JTextField rMiddleName;
	private JTextField rRD;
	private JLabel lblNewLabel_3;
	private JTextField rPhoneNumber;
	private JTextField rAddress;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField rBCode;
	private JLabel lblNewLabel_7;
	private JTextField rTCode;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private String path2 = null;
	private JLabel lblPhoto;
	/**
	 * Create the frame.
	 */
	public Register() {
	
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell 5415\\Desktop\\Tg\\nmct.png"));
		setTitle("REGISTER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 882, 562);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rName = new JTextField();


		rName.setBackground(Color.LIGHT_GRAY);
		rName.setBounds(63, 131, 240, 40);
		contentPane.add(rName);
		rName.setColumns(10);
		
		rLastName = new JTextField();


		rLastName.setColumns(10);
		rLastName.setBackground(Color.LIGHT_GRAY);
		rLastName.setBounds(63, 218, 240, 40);
		contentPane.add(rLastName);
		
		rMiddleName = new JTextField();


		rMiddleName.setColumns(10);
		rMiddleName.setBackground(Color.LIGHT_GRAY);
		rMiddleName.setBounds(63, 307, 240, 40);
		contentPane.add(rMiddleName);
		
		rRD = new JTextField();


		rRD.setColumns(10);
		rRD.setBackground(Color.LIGHT_GRAY);
		rRD.setBounds(63, 386, 240, 40);
		contentPane.add(rRD);
		
		JLabel lblNewLabel = new JLabel("Нэр");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(63, 80, 142, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Овог\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(63, 170, 142, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ургийн овог\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(63, 257, 142, 40);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("РД\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(63, 346, 142, 40);
		contentPane.add(lblNewLabel_3);
		
		rPhoneNumber = new JTextField();


		rPhoneNumber.setColumns(10);
		rPhoneNumber.setBackground(Color.LIGHT_GRAY);
		rPhoneNumber.setBounds(358, 131, 240, 40);
		contentPane.add(rPhoneNumber);
		
		rAddress = new JTextField();


		rAddress.setColumns(10);
		rAddress.setBackground(Color.LIGHT_GRAY);
		rAddress.setBounds(358, 218, 240, 40);
		contentPane.add(rAddress);
		
		lblNewLabel_4 = new JLabel("Утасны дугаар\r\n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(348, 80, 142, 40);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Гэрийн хаяг\r\n");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(348, 170, 142, 40);
		contentPane.add(lblNewLabel_5);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConfirm.setBounds(63, 453, 142, 40);
		contentPane.add(btnConfirm);
		
		JLabel lblNewLabel_6 = new JLabel("Багшийн код");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(348, 266, 142, 31);
		contentPane.add(lblNewLabel_6);
		
		rBCode = new JTextField();


		rBCode.setBackground(Color.LIGHT_GRAY);
		rBCode.setBounds(358, 307, 240, 40);
		contentPane.add(rBCode);
		rBCode.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Тэнхимийн код");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(348, 351, 142, 31);
		contentPane.add(lblNewLabel_7);
		
		rTCode = new JTextField();


		rTCode.setColumns(10);
		rTCode.setBackground(Color.LIGHT_GRAY);
		rTCode.setBounds(358, 386, 240, 40);
		contentPane.add(rTCode);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {	 
					String bCode = rBCode.getText();
					String query=("delete from b_medeelel where b_code=?");
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel","root","Tuugii0713");
					PreparedStatement pst = con.prepareStatement(query);
					pst.setString(1,bCode);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Delete Succesfully");
					}catch(ClassNotFoundException e1) {
						System.out.println(e1);
					}
				catch (Exception e1) {
						e1.printStackTrace();
					}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDelete.setBounds(646, 453, 142, 40);
		contentPane.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {	 
					String userName = rName.getText();
					String lastName = rLastName.getText();
					String middleName= rMiddleName.getText();
					String RD = rRD.getText();
					String phoneNum = rPhoneNumber.getText();
					String address = rAddress.getText();
					String bCode = rBCode.getText();
					String rtCode = rTCode.getText();
					String query=("update b_medeelel set b_ner=?,b_ovog=?,b_urgiin_ovog=?,b_rd=?,b_tenhim=?,b_utasnii_dugaar=?,b_geriin_hayg=? b_image_id=? where b_code=?");
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel","root","Tuugii0713");
					PreparedStatement pst = con.prepareStatement(query);
					pst.setString(1,userName);
					pst.setString(2,lastName);
					pst.setString(3,middleName);
					pst.setString(4,RD);
					pst.setString(5,rtCode);
					pst.setString(6,phoneNum);
					pst.setString(7,address);
					pst.setString(8,bCode);
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Update Succesfully");
					}catch(ClassNotFoundException e1) {
						System.out.println(e1);
					}
				catch (Exception e1) {
						e1.printStackTrace();
					}
			}
		});

		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUpdate.setBounds(358, 453, 142, 40);
		contentPane.add(btnUpdate);
		
		lblNewLabel_8 = new JLabel("Багшийн мэдээлэл\r\n");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_8.setBounds(63, 61, 267, 24);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("БҮРТГҮҮЛЭХ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_9.setBounds(39, 27, 267, 24);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("UPLOAD\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JFileChooser chooser=new JFileChooser();	
			chooser.showOpenDialog(null);
			File f=chooser.getSelectedFile();
			String path=f.getAbsolutePath();
			try {
				BufferedImage bi=ImageIO.read(new File(path));
				Image img=bi.getScaledInstance(159, 198, Image.SCALE_SMOOTH);
				ImageIcon icon= new ImageIcon(img);
				lblPhoto.setIcon(icon); 
				path2 =path;
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
					}
		});
		btnNewButton.setBounds(646, 353, 142, 31);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBounds(646, 127, 142, 178);
		contentPane.add(panel);
		panel.setLayout(null);
		lblPhoto = new JLabel("New label");
		lblPhoto.setBounds(652, 137, 132, 168);
		contentPane.add(lblPhoto);
		btnConfirm.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent e) {
				Connection con=null;
				PreparedStatement pst=null;
				try {	 
					String userName = rName.getText();
					String lastName = rLastName.getText();
					String middleName= rMiddleName.getText();
					String RD = rRD.getText();
					String phoneNum = rPhoneNumber.getText();
					String address = rAddress.getText();
					String bCode = rBCode.getText();
					String rtCode = rTCode.getText();
					String query=("insert into b_medeelel(b_code,b_urgiin_ovog,b_ovog,b_ner,b_rd,b_utasnii_dugaar,b_geriin_hayg,b_tenhim,b_image_id)values(?,?,?,?,?,?,?,?,?)");
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel","root","Tuugii0713");
					pst= con.prepareStatement(query);
					pst.setString(1,rBCode.getText());
					pst.setString(2,rMiddleName.getText());
					pst.setString(3,rLastName.getText());
					pst.setString(4,rName.getText());
					pst.setString(5,rRD.getText());
					pst.setString(6,rPhoneNumber.getText());
					pst.setString(7,rAddress.getText());
					pst.setString(8,rTCode.getText());
					FileInputStream is=new FileInputStream(new File(path2));
					pst.setBlob(9, is);
					
					pst.executeUpdate();
					lblPhoto.setIcon(null);
					JOptionPane.showMessageDialog(null,"Registration Succesfully");
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
