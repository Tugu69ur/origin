package allMenu;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

//import Function.UserName;
import ModelPanels.Search;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.ComponentOrientation;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;

public class admin_main extends JFrame{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JPanel contentPane;
private ModelPanels.ProflePanel profilePanel;
private ModelPanels.HomePanel homePanel;
private ModelPanels.Update update;
private ModelPanels.SearchTamira search;
private ModelPanels.ListT list;
private JTextArea b_medeelel;


/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
admin_main mm = new admin_main(null);
mm.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
/**
* Create the frame.
 * @param user 
*/
private String path2 = null;
private JLabel b_medeelel_zurag;
public admin_main(String user) {
	


	
	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell 5415\\Desktop\\Tg\\nmct.png"));
	setTitle("MENU");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 800, 500);
//setExtendedState(JFrame.MAXIMIZED_BOTH);
contentPane = new JPanel();
contentPane.setBackground(new Color(255, 255, 255));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
profilePanel = new ModelPanels.ProflePanel(null);
profilePanel.setBounds(-53, 0, 725, 472);
homePanel = new ModelPanels.HomePanel();
homePanel.setBackground(new Color(245, 245, 245));
homePanel.setBounds(0, 0 ,662, 462);
update = new ModelPanels.Update();
update.setBounds(0, 0, 662, 462);
search = new ModelPanels.SearchTamira();
search.setBounds(0, 0, 662, 462);
list = new ModelPanels.ListT();
list.setBounds(0, 0, 662, 462);

setContentPane(contentPane);
contentPane.setLayout(null);

JPanel rowMenu = new JPanel();
rowMenu.setBackground(new Color(235, 235, 235));
rowMenu.setBounds(0, 0, 129, 472);
contentPane.add(rowMenu);

JPanel panelBtn =  new JPanel();
panelBtn.setBounds(0, 0, 129, 48);
panelBtn.setBackground(new Color(68, 68, 68));
panelBtn.setLayout(null);

JLabel lblbtn = new JLabel("\r\n");
lblbtn.setBounds(55, 10, 28, 24);
lblbtn.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\menu.png"));
lblbtn.setHorizontalAlignment(SwingConstants.CENTER);
panelBtn.add(lblbtn);
rowMenu.setLayout(null);

JPanel pnlHome = new JPanel();
pnlHome.setBounds(0, 47, 129, 48);
pnlHome.setBackground(new Color(235, 235, 235));
pnlHome.addMouseListener(new PanelButtonMouseClicked(pnlHome) {
@Override
public void mouseClicked(MouseEvent e) {
menuClicked(homePanel);
}
});

JLabel lblHome = new JLabel("");
lblHome.setBounds(54, 10, 30, 30);
lblHome.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\house (1).png"));
pnlHome.setLayout(null);
pnlHome.add(lblHome);
rowMenu.add(pnlHome);
rowMenu.add(panelBtn);
JPanel mainContentPanel = new JPanel();
mainContentPanel.setBackground(new Color(240, 254, 255));
mainContentPanel.setBounds(128, 0, 672, 472);
contentPane.add(mainContentPanel);
mainContentPanel.setLayout(null);
mainContentPanel.add(homePanel);
JPanel panel = new JPanel();
panel.setBounds(0, 0, 662, 52);
panel.setBackground(new Color(255, 255, 255));
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setBounds(6, 10, 40, 36);
lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\nmct (2).png"));
JLabel lblNewLabel_1 = new JLabel("ШИНЭ МОНГОЛ ТЕХНОЛОГИЙН КОЛЛЕЖ");
lblNewLabel_1.setBounds(46, 10, 254, 20);
lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
JLabel lblNewLabel_2 = new JLabel("БАГШ БҮРТГЭЛИЙН СИСТЕМ");
lblNewLabel_2.setBounds(46, 29, 254, 13);

JPanel pnlProfile = new JPanel();
pnlProfile.setBounds(532, 0, 130, 52);
pnlProfile.setBackground(new Color(255, 255, 255));
pnlProfile.addMouseListener(new PanelButtonMouseClicked(pnlProfile) {
@Override
public void mouseClicked(MouseEvent e) {
menuClicked(profilePanel);
}
});
pnlProfile.setLayout(null);

JLabel lblProfile = new JLabel("");
lblProfile.setBounds(10, 10, 24, 24);
lblProfile.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\user.png"));
pnlProfile.add(lblProfile);
JLabel username6 = new JLabel(user);
username6.setBounds(44, 10, 90, 24);
pnlProfile.add(username6);
homePanel.setLayout(null);
homePanel.add(panel);
panel.setLayout(null);
panel.add(lblNewLabel);
panel.add(lblNewLabel_2);
panel.add(lblNewLabel_1);
panel.add(pnlProfile);
JLabel lblNewLabel_3 = new JLabel("Багш нарт хүргэх мэдээлэл");
lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
lblNewLabel_3.setBounds(38, 102, 248, 21);
homePanel.add(lblNewLabel_3);
JLabel lblNewLabel_4 = new JLabel("Мэдээлэл");
lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
lblNewLabel_4.setBounds(205, 126, 81, 22);
homePanel.add(lblNewLabel_4);
JPanel panel_1 = new JPanel();
panel_1.setForeground(new Color(255, 255, 255));
panel_1.setBackground(new Color(255, 255, 255));
panel_1.setBounds(466, 158, 165, 154);
homePanel.add(panel_1);
panel_1.setLayout(null);
JLabel b_medeelel_zurag = new JLabel("\r\n");
b_medeelel_zurag.setForeground(new Color(255, 255, 255));
b_medeelel_zurag.setBounds(5, 0, 156, 155);
panel_1.add(b_medeelel_zurag);
JButton btnNewButton = new JButton("Зураг нэмэх");
btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
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
			b_medeelel_zurag.setIcon(icon);
			path2=path;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
});
btnNewButton.setBounds(466, 345, 165, 30);
homePanel.add(btnNewButton);
b_medeelel= new JTextArea();
b_medeelel.setBounds(38, 158, 403, 242);
homePanel.add(b_medeelel);
JButton btnNewButton_1 = new JButton("Баталгаажуулах");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Connection con=null;
		PreparedStatement pst=null;
		try {
			@SuppressWarnings("unused")
			String info = b_medeelel.getText();
			String query = ("update medeelel set medee=?,medee_zurag=? where medee_num='1'");
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel","root","Tuugii0713");
			pst= con.prepareStatement(query);
			pst.setString(1, b_medeelel.getText());
			FileInputStream is=new FileInputStream(new File(path2));
			pst.setBlob(2, is);
			pst.executeUpdate();
			b_medeelel_zurag.setIcon(null);
			//pst.executeUpdate();
			JOptionPane.showMessageDialog(null,"Мэдээ амжилттай бүртгэгдэлээ!");
			
		}catch(ClassNotFoundException e1) {
			System.out.println(e1);
		}
	catch (Exception e1) {
			e1.printStackTrace();
		}
	}
});
btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
btnNewButton_1.setBounds(236, 410, 205, 30);
homePanel.add(btnNewButton_1);
JLabel lblNewLabel_5 = new JLabel("Сайн байна уу "+user);
lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
lblNewLabel_5.setBounds(38, 62, 382, 30);
homePanel.add(lblNewLabel_5);
mainContentPanel.add(profilePanel);

JPanel panelAdd = new JPanel();
panelAdd.setBackground(new Color(235, 235, 235));
panelAdd.setBounds(0, 96, 129, 48);
update.setBounds(0, 0, 672, 472);
mainContentPanel.add(update);
panelAdd.addMouseListener(new PanelButtonMouseClicked(panelAdd) {
	@Override
	public void mouseClicked(MouseEvent e) {
		menuClicked(update);
		
	}
});
rowMenu.add(panelAdd);
panelAdd.setLayout(null);
JLabel lblUpdate = new JLabel("");
lblUpdate.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\teamwork.png"));
lblUpdate.setBounds(52, 10, 30, 30);
panelAdd.add(lblUpdate);

//mainContentPanel.add(search);
JPanel panelSearch = new JPanel();
panelSearch.addMouseListener(new PanelButtonMouseClicked(panelSearch) {
	@Override
	public void mouseClicked(MouseEvent e) {

		menuClicked(search);
		
	}
});
panelSearch.setLayout(null);
panelSearch.setBackground(new Color(235, 235, 235));
panelSearch.setBounds(0, 143, 129, 48);
rowMenu.add(panelSearch);
mainContentPanel.add(search);





JLabel lblUpdate_1 = new JLabel("");
lblUpdate_1.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\magnifying-glass.png"));
lblUpdate_1.setBounds(57, 10, 30, 30);
panelSearch.add(lblUpdate_1);
//list
JPanel panelList = new JPanel();
panelList.setLayout(null);
panelList.setBackground(new Color(235, 235, 235));
panelList.setBounds(0, 190, 129, 48);
rowMenu.add(panelList);
panelList.addMouseListener( new PanelButtonMouseClicked(panelList) {
	public void mouseClicked(MouseEvent e) {
		menuClicked(list);
	}
});
mainContentPanel.add(list);

JLabel lblUpdate_2 = new JLabel("");
lblUpdate_2.setBounds(52, 10, 30, 30);
panelList.add(lblUpdate_2);
mainContentPanel.add(update);


}


/*private void setDefaultCloseOperation(int exitOnClose) {
	// TODO Auto-generated method stub
	
}

private void setTitle(String string) {
	// TODO Auto-generated method stub
	
}

private void setIconImage(Image image) {
	// TODO Auto-generated method stub
	
}
*/

public void menuClicked(JPanel panel) {
profilePanel.setVisible(false);
homePanel.setVisible(false);
update.setVisible(false);
search.setVisible(false);
list.setVisible(false);

panel.setVisible(true);
}

public class PanelButtonMouseClicked extends MouseAdapter{

JPanel pnl;
public PanelButtonMouseClicked(JPanel pnlHome) {
// TODO Auto-generated constructor stub
this.pnl=pnlHome;
}
public void PanelButtonMouseAdapter(JPanel panelAdd) {
this.pnl= panelAdd;
}
@Override
public void mouseEntered(MouseEvent e) {
pnl.setBackground(new Color(68,68,68));
}

@Override
public void mousePressed(MouseEvent e) {
pnl.setBackground(new Color(0,0,0));
}

@Override
public void mouseReleased(MouseEvent e) {
pnl.setBackground(new Color(235,235,235));
}

@Override
public void mouseExited(MouseEvent e) {

pnl.setBackground(new Color(235,235,235));

}

}
}
