package ModelPanels;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

import Function.UserName;
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
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
import javax.swing.JTable;

public class list extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JPanel contentPane;
private ModelPanels.ProflePanel profilePanel;
private ModelPanels.HomePanel homePanel;
private ModelPanels.Update update;
private ModelPanels.Search search;
private JTable table;
private JTextField textField;


/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
list list = new list(null);
list.setVisible(true);
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

public list(String user) {
	
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
JLabel username6 = new JLabel();
username6.setBounds(44, 10, 90, 24);
pnlProfile.add(username6);
homePanel.setLayout(null);
homePanel.add(panel);
panel.setLayout(null);
panel.add(lblNewLabel);
panel.add(lblNewLabel_2);
panel.add(lblNewLabel_1);
panel.add(pnlProfile);
JScrollPane scrollPane = new JScrollPane();
scrollPane.setBounds(10, 86, 642, 264);
homePanel.add(scrollPane);
table = new JTable();
scrollPane.setViewportView(table);
table.setModel(new DefaultTableModel(
	new Object[][] {
	},
	new String[] {
		"\u0411\u0430\u0433\u0448\u0438\u0439\u043D \u043A\u043E\u0434", "\u0423\u0440\u0433\u0438\u0439\u043D \u043E\u0432\u043E\u0433", "\u041E\u0432\u043E\u0433", "\u041D\u044D\u0440", "\u0420\u0435\u0433\u0438\u0441\u0442\u044D\u0440\u0438\u0439\u043D \u0434\u0443\u0433\u0430\u0430\u0440", "\u0414\u0443\u0433\u0430\u0430\u0440", "\u0413\u044D\u0440\u0438\u0439\u043D \u0445\u0430\u044F\u0433", "\u0422\u044D\u043D\u0445\u0438\u043C \u043A\u043E\u0434"
	}
));
textField = new JTextField();
textField.setBounds(10, 57, 188, 19);
homePanel.add(textField);
textField.setColumns(10);
mainContentPanel.add(profilePanel);
textField.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String searchQuery = textField.getText().trim();

        // Check if the search query is empty
        if (searchQuery.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Хайлт хоосон байж болохгүй.");
        } else {
            performSearch(searchQuery);
        }
    }

    private void performSearch(String searchQuery) {
        DefaultTableModel searchResultModel = (DefaultTableModel) table.getModel();
        searchResultModel.setRowCount(0);

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel", "root", "Tuugii0713");

            if (searchQuery.equalsIgnoreCase("all")) {
                // Fetch all students
                String query = "SELECT * FROM b_medeelel";
                try (Statement statement = connection.createStatement();
                     ResultSet resultSet = statement.executeQuery(query)) {
                    while (resultSet.next()) {
                        String bcodeField = resultSet.getString("b_code");
                        String UovogField = resultSet.getString("b_urgiin_ovog");
                        String ovogField = resultSet.getString("b_ovog");
                        String nerField = resultSet.getString("b_ner");
                        String rd = resultSet.getString("b_rd");
                        String utas = resultSet.getString("b_utasnii_dugaar");
                        String ger = resultSet.getString("b_geriin_hayg");
                        String tenhim = resultSet.getString("b_tenhim_code");
                        searchResultModel.addRow(new Object[]{bcodeField, UovogField, ovogField, nerField, rd, utas,ger,tenhim});
                    }
                }
            } else {
                // Perform a regular search
                String query = "SELECT * FROM b_medeelel WHERE b_ner LIKE ?";

                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    String wildcardSearchQuery = "%" + searchQuery + "%";
                    preparedStatement.setString(1, wildcardSearchQuery);
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        while (resultSet.next()) {
                        	String bcodeField = resultSet.getString("b_code");
                            String UovogField = resultSet.getString("b_urgiin_ovog");
                            String ovogField = resultSet.getString("b_ovog");
                            String nerField = resultSet.getString("b_ner");
                            String rd = resultSet.getString("b_rd");
                            String utas = resultSet.getString("b_utasnii_dugaar");
                            String ger = resultSet.getString("b_geriin_hayg");
                            String tenhim = resultSet.getString("b_tenhim_code");
                            searchResultModel.addRow(new Object[]{bcodeField, UovogField, ovogField, nerField, rd, utas,ger,tenhim});
                        }
                    }
                }
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }


});




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
panelAdd_1.addMouseListener(new PanelButtonMouseClicked(panelAdd_1) {
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
search.setVisible(false);

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
