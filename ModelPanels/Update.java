package ModelPanels;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import allMenu.Register;
import javax.swing.JSlider;

public class Update extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane1;
	private JTextField rName;
	private JTextField rLastName;
	private JTextField rMiddleName;
	private JTextField rRD;
	private JTextField rPhoneNumber;
	private JTextField rAddress;
	private JTextField rBCode;
	private JTextField rTCode;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	/**
	 * Create the panel.
	 */
	private String path2 =null;
	private JLabel lblPhoto;
	public Update() {		
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
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
					String query=("insert into b_medeelel(b_code,b_urgiin_ovog,b_ovog,b_ner,b_rd,b_utasnii_dugaar,b_geriin_hayg,b_tenhim_code,b_image_id)values(?,?,?,?,?,?,?,?,?)");
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
		setBackground(new Color(255, 255, 255));
		setLayout(null);

		setBounds(128,0,640,435);
		setLayout(null);
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 0, 636, 48);
		add(panel_4);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\nmct (2).png"));
		lblNewLabel.setBounds(5, 5, 38, 36);
		panel_4.add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("ШИНЭ МОНГОЛ ТЕХНОЛОГИЙН КОЛЛЕЖ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(43, 5, 274, 20);
		panel_4.add(lblNewLabel_1);
		JLabel lblNewLabel_2 = new JLabel("БАГШ БҮРТГЭЛИЙН СИСТЕМ");
		lblNewLabel_2.setBounds(43, 20, 188, 13);
		panel_4.add(lblNewLabel_2);
		JLabel b_code = new JLabel("");
		b_code.setBounds(519, 11, 99, 25);
		panel_4.add(b_code);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(15, 133, 185, 40);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(15, 199, 185, 40);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(15, 265, 185, 40);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(15, 335, 185, 40);
		add(textField_3);
		
		JLabel lblNewLabel_6 = new JLabel("Нэр");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(15, 116, 25, 17);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_1_1 = new JLabel("Овог\r\n");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(15, 183, 31, 17);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ургийн овог\r\n");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(15, 249, 79, 17);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("РД\r\n");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(20, 315, 18, 17);
		add(lblNewLabel_3_1);
	
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConfirm.setBounds(25, 385, 142, 40);
		add(btnConfirm);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(230, 133, 185, 40);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(230, 199, 185, 40);
		add(textField_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("Утасны дугаар\r\n");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(230, 116, 103, 17);
		add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Гэрийн хаяг\r\n");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5_1.setBounds(230, 183, 78, 17);
		add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Багшийн код");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6_1.setBounds(230, 249, 85, 17);
		add(lblNewLabel_6_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setBounds(230, 265, 185, 40);
		add(textField_6);
		
		JLabel lblNewLabel_7_1 = new JLabel("Тэнхимийн код");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7_1.setBounds(230, 315, 100, 17);
		add(lblNewLabel_7_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBackground(Color.LIGHT_GRAY);
		textField_7.setBounds(230, 335, 185, 40);
		add(textField_7);
		
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
		
					String query=("update b_medeelel set b_ner=?,b_ovog=?,b_urgiin_ovog=?,b_rd=?,b_tenhim_code=?,b_utasnii_dugaar=?,b_geriin_hayg=? b_image_id=? where b_code=?");
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
					FileInputStream is=new FileInputStream(new File(path2));
					pst.setBlob(9, is);
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
		btnUpdate.setBounds(250, 385, 142, 40);
		add(btnUpdate);
		
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
		btnDelete.setBounds(461, 385, 142, 40);
		add(btnDelete);
		
		JButton btnNewButton = new JButton("UPLOAD\r\n");
		
		/*btnNewButton.addActionListener(new ActionListener() {
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
		});*/
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					JFileChooser chooser=new JFileChooser();	
					chooser.showOpenDialog(null);
					File f = chooser.getSelectedFile();
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
		btnNewButton.setBounds(461, 310, 142, 31);
		add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel.setBounds(461, 122, 142, 178);
		add(panel);
		
		JLabel photo = new JLabel("New label");
		photo.setBounds(465, 124, 134, 172);
		add(photo);
		
		JLabel lblNewLabel_8_1 = new JLabel("Багшийн мэдээлэл\r\n");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_8_1.setBounds(115, 63, 200, 25);
		add(lblNewLabel_8_1);
		setVisible(true);
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell 5415\\Desktop\\Tg\\nmct.png"));
		setTitle("Update");
		setBounds(100, 100, 882, 562);
		contentPane1 = new JPanel();
		contentPane1.setBackground(Color.WHITE);
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		rName = new JTextField();


		rName.setBackground(Color.LIGHT_GRAY);
		rName.setBounds(63, 131, 240, 40);
		contentPane1.add(rName);
		rName.setColumns(10);
		
		rLastName = new JTextField();


		rLastName.setColumns(10);
		rLastName.setBackground(Color.LIGHT_GRAY);
		rLastName.setBounds(63, 218, 240, 40);
		contentPane1.add(rLastName);
		
		rMiddleName = new JTextField();


		rMiddleName.setColumns(10);
		rMiddleName.setBackground(Color.LIGHT_GRAY);
		rMiddleName.setBounds(63, 307, 240, 40);
		contentPane1.add(rMiddleName);
		
		rRD = new JTextField();


		rRD.setColumns(10);
		rRD.setBackground(Color.LIGHT_GRAY);
		rRD.setBounds(63, 386, 240, 40);
		contentPane1.add(rRD);
		
		
		
	}
private void setContentPane(JPanel contentPane12) {
		// TODO Auto-generated method stub
		
	}
private void setTitle(String string) {
		// TODO Auto-generated method stub
		
	}
private void setIconImage(Image image) {
		// TODO Auto-generated method stub
		
	}
}


