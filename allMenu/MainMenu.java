package allMenu;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import Function.UserName;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.ComponentOrientation;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class MainMenu extends JFrame {
private JPanel contentPane;
private ModelPanels.ProflePanel profilePanel;
private ModelPanels.HomePanel homePanel;



/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
MainMenu mm = new MainMenu(null);
mm.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
*/
public MainMenu(String username) {
	
	
	
	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell 5415\\Desktop\\Tg\\nmct.png"));
	setTitle("MENU");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 800, 500);
//setExtendedState(JFrame.MAXIMIZED_BOTH);
contentPane = new JPanel();
contentPane.setBackground(new Color(255, 255, 255));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
profilePanel = new ModelPanels.ProflePanel(username);
profilePanel.setBounds(-53, 0, 725, 472);
homePanel = new ModelPanels.HomePanel();
homePanel.setBackground(new Color(245, 245, 245));
homePanel.setBounds(0, 0 ,662, 462);

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
lblHome.setBounds(54, 10, 24, 24);
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
lblNewLabel_1.setBounds(52, 10, 254, 20);
lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
JLabel lblNewLabel_2 = new JLabel("БАГШ БҮРТГЭЛИЙН СИСТЕМ");
lblNewLabel_2.setBounds(52, 29, 165, 13);

JPanel pnlProfile = new JPanel();
pnlProfile.setBounds(550, 0, 112, 52);
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
homePanel.setLayout(null);
homePanel.add(panel);
panel.setLayout(null);
panel.add(lblNewLabel);
panel.add(lblNewLabel_2);
panel.add(lblNewLabel_1);
panel.add(pnlProfile);
JLabel lblNewLabel_4 = new JLabel("Profile");
lblNewLabel_4.setBounds(38, 10, 64, 24);
pnlProfile.add(lblNewLabel_4);
JPanel panel_1 = new JPanel();
panel_1.setBounds(0, 52, 662, 36);
panel.add(panel_1);
panel_1.setLayout(null);
JLabel username69 = new JLabel(username);
username69.setBounds(118, -13, 177, 42);
panel_1.add(username69);
JLabel lblNewLabel_3 = new JLabel("Танд хүргэх мэдээ");
lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
lblNewLabel_3.setBounds(23, 81, 143, 20);
homePanel.add(lblNewLabel_3);
JLabel medee_zurag = new JLabel("");
medee_zurag.setBounds(419, 160, 187, 222);
homePanel.add(medee_zurag);
JLabel medee = new JLabel("");
medee.setBounds(23, 99, 346, 340);
homePanel.add(medee);

Connection connection2;
try {
	connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel", "root", "Tuugii0713");
	String query = "SELECT * FROM b_medeelel where b_code='"+username+"'";
	try (Statement statement = connection2.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            if(resultSet.next()) {
                String ner = resultSet.getString("b_ner");      
                JLabel username98 = new JLabel(ner);
                username98.setFont(new Font("Tahoma", Font.PLAIN, 17));
                username98.setBounds(133, 50, 203, 39);
                homePanel.add(username98);
                JLabel lblNewLabel_5 = new JLabel("Сайн байна уу");
                lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
                lblNewLabel_5.setBounds(20, 50, 132, 39);
                homePanel.add(lblNewLabel_5);
            }
        }
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


mainContentPanel.add(profilePanel);
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=null;
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel","root","Tuugii0713");
	java.sql.Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select*from medeelel");
	if(rs.next()) {
		medee.setText("<html>"+rs.getString(2)+"</html>");
		byte[]imagedata=rs.getBytes("medee_zurag");
		ImageIcon format = new ImageIcon(imagedata);
		medee_zurag.setIcon(format);
		
	}
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

public void menuClicked(JPanel panel) {
profilePanel.setVisible(false);
homePanel.setVisible(false);

panel.setVisible(true);
}

public class PanelButtonMouseClicked extends MouseAdapter{

JPanel pnl;
public PanelButtonMouseClicked(JPanel pnlHome) {
// TODO Auto-generated constructor stub
this.pnl=pnlHome;
}
public void PanelButtonMouseAdapter(JPanel panel) {
this.pnl= panel;
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
