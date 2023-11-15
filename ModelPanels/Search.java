package ModelPanels;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

import Function.UserName;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
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
import java.awt.List;

import javax.swing.JTextField;
import java.awt.ComponentOrientation;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JTable;

public class Search extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JPanel contentPane;
private ModelPanels.ProflePanel profilePanel;
private ModelPanels.HomePanel homePanel;
private ModelPanels.Update update;


/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Search ss = new Search(null);
ss.setVisible(true);
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
public Search(String user) {
	
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
JButton btnNewButton = new JButton("  Компьютерийн ухааны тэнхим ");
btnNewButton.addActionListener(e -> {
	list List=new list(user);
	dispose();
	List.show();
});
btnNewButton.setBounds(40, 82, 309, 35);
homePanel.add(btnNewButton);
JButton btnNewButton_1 = new JButton("   Цахилгаан электроникийн инженерийн тэнхим");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
btnNewButton_1.setBounds(40, 132, 309, 35);
homePanel.add(btnNewButton_1);
JButton btnNewButton_2 = new JButton("   Механикийн инженерийн тэнхим\r\n");
btnNewButton_2.setBounds(40, 182, 309, 35);
homePanel.add(btnNewButton_2);
JButton btnNewButton_3 = new JButton("   Барилга дэд бүтэц инженерийн тэнхим");
btnNewButton_3.setBounds(40, 232, 309, 35);
homePanel.add(btnNewButton_3);
JButton btnNewButton_4 = new JButton("   Химийн инженерийн тэнхим");
btnNewButton_4.setBounds(40, 282, 309, 35);
homePanel.add(btnNewButton_4);
JButton btnNewButton_5 = new JButton("   Ерөнхий эрдмийн тэнхим");
btnNewButton_5.setBounds(40, 332, 309, 35);
homePanel.add(btnNewButton_5);
JButton btnNewButton_6 = new JButton("   Хэлний тэнхим");
btnNewButton_6.setBounds(40, 382, 309, 35);
homePanel.add(btnNewButton_6);
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
JPanel panelAdd_1 = new JPanel();
panelAdd_1.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {	
		
	}
});
panelAdd_1.setLayout(null);
panelAdd_1.setBackground(new Color(235, 235, 235));
panelAdd_1.setBounds(0, 143, 129, 48);
rowMenu.add(panelAdd_1);
JLabel lblUpdate_1 = new JLabel("");
lblUpdate_1.setIcon(new ImageIcon("C:\\Users\\Dell 5415\\Downloads\\magnifying-glass.png"));
lblUpdate_1.setBounds(57, 10, 30, 30);
panelAdd_1.add(lblUpdate_1);
mainContentPanel.add(update);

}

public void menuClicked(JPanel panel) {
profilePanel.setVisible(false);
homePanel.setVisible(false);
update.setVisible(false);



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
