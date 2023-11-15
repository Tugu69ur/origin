package ModelPanels;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ProflePanel extends JPanel {
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

/**
* Create the panel
 * @param username 
*/
public ProflePanel(String username) {
setBackground(new Color(255, 255, 255));
setLayout(null);

setBounds(128,0,708,460);
setLayout(null);
JPanel panel = new JPanel();
panel.setBounds(72, 58, 99, 114);
add(panel);
panel.setLayout(null);
JLabel image = new JLabel("");
image.setBounds(0, 0, 99, 114);
panel.add(image);
JPanel panel_1 = new JPanel();
panel_1.setBounds(202, 58, 244, 114);
add(panel_1);
panel_1.setLayout(null);
JLabel b_ner = new JLabel("");
b_ner.setBounds(43, 53, 94, 13);
panel_1.add(b_ner);
JLabel lblNewLabel_3 = new JLabel("НЭР:");
lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
lblNewLabel_3.setBounds(10, 53, 45, 13);
panel_1.add(lblNewLabel_3);
JLabel b_ovog = new JLabel("");
b_ovog.setBounds(43, 30, 94, 13);
panel_1.add(b_ovog);
JLabel lblNewLabel_3_1 = new JLabel("ОВОГ:");
lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 10));
lblNewLabel_3_1.setBounds(10, 31, 45, 13);
panel_1.add(lblNewLabel_3_1);
JLabel b_urgiin_ovog = new JLabel("");
b_urgiin_ovog.setBounds(91, 10, 94, 13);
panel_1.add(b_urgiin_ovog);
JLabel рлйыб = new JLabel("УРГИЙН ОВОГ:");
рлйыб.setFont(new Font("Tahoma", Font.BOLD, 10));
рлйыб.setBounds(10, 10, 73, 13);
panel_1.add(рлйыб);
JLabel b_utasnii_dugaar = new JLabel("");
b_utasnii_dugaar.setBounds(110, 76, 94, 13);
panel_1.add(b_utasnii_dugaar);
JLabel lblNewLabel_3_2 = new JLabel("УТАСНЫ ДУГААР:");
lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 10));
lblNewLabel_3_2.setBounds(10, 76, 109, 13);
panel_1.add(lblNewLabel_3_2);
JLabel lblNewLabel_3_2_1 = new JLabel("ТСА УДИРДСАН ОЮУТНЫ ТОО:");
lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
lblNewLabel_3_2_1.setBounds(10, 99, 175, 13);
panel_1.add(lblNewLabel_3_2_1);
JLabel too = new JLabel("");
too.setBounds(181, 99, 33, 13);
panel_1.add(too);
JPanel panel_2 = new JPanel();
panel_2.setBounds(72, 195, 374, 114);
add(panel_2);
panel_2.setLayout(null);
JScrollPane scrollPane_2 = new JScrollPane();
scrollPane_2.setBounds(0, 0, 374, 114);
panel_2.add(scrollPane_2);
table_2 = new JTable();
table_2.setModel(new DefaultTableModel(
	new Object[][] {
	},
	new String[] {
		"ISBN", "\u041D\u043E\u043C\u044B\u043D \u043D\u044D\u0440", "\u0425\u044D\u0432\u043B\u04AF\u04AF\u043B\u0441\u044D\u043D \u043E\u043D"
	}
));
DefaultTableModel searchResultModel2 = (DefaultTableModel) table_2.getModel();
searchResultModel2.setRowCount(0);
Connection connection2;
try {
	connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel", "root", "Tuugii0713");
	String query = "SELECT * FROM hevluulsen_nom where b_code='"+username+"'";
	try (Statement statement = connection2.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                String isbn = resultSet.getString("isbn");
                String ner = resultSet.getString("nomiin_ner");
                Date date = resultSet.getDate("hevluulsen_on");
                
                searchResultModel2.addRow(new Object[]{isbn,ner,date});
            }
        }
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

scrollPane_2.setViewportView(table_2);
JPanel panel_3 = new JPanel();
panel_3.setBounds(473, 58, 213, 114);
add(panel_3);
panel_3.setLayout(null);
JScrollPane scrollPane_1 = new JScrollPane();
scrollPane_1.setBounds(0, 0, 213, 114);
panel_3.add(scrollPane_1);
table_1 = new JTable();
table_1.setModel(new DefaultTableModel(
	new Object[][] {
	},
	new String[] {
		"\u0428\u0430\u0433\u043D\u0430\u043B", "\u0425\u0443\u0433\u0430\u0446\u0430\u0430"
	}
));
DefaultTableModel searchResultModel1 = (DefaultTableModel) table_1.getModel();
searchResultModel1.setRowCount(0);
Connection connection1;
try {
	connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel", "root", "Tuugii0713");
	String query = "SELECT * FROM b_shagnal where b_code='"+username+"'";
	try (Statement statement = connection1.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                String shagnal = resultSet.getString("shagnal");
                Date hugatsaa = resultSet.getDate("hugatsaa");
                searchResultModel1.addRow(new Object[]{shagnal,hugatsaa});
            }
        }
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

scrollPane_1.setViewportView(table_1);
JPanel panel_4 = new JPanel();
panel_4.setLayout(null);
panel_4.setBackground(Color.WHITE);
panel_4.setBounds(50, 10, 636, 48);
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
JPanel updatePanel = new JPanel();
updatePanel.setBounds(473, 195, 206, 237);
add(updatePanel);
JScrollPane scrollPane = new JScrollPane();
table = new JTable();
scrollPane.setViewportView(table);
table.setModel(new DefaultTableModel(
	new Object[][] {
		
	},
	new String[] {
		"\u0427\u0438\u0433\u043B\u044D\u043B", "\u0421\u044D\u0434\u044D\u0432", "\u0410\u0433\u0443\u0443\u043B\u0433\u0430", "\u041D\u04E9\u043B\u04E9\u04E9"
	}
));
GroupLayout gl_updatePanel = new GroupLayout(updatePanel);
gl_updatePanel.setHorizontalGroup(
	gl_updatePanel.createParallelGroup(Alignment.LEADING)
		.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
);
gl_updatePanel.setVerticalGroup(
	gl_updatePanel.createParallelGroup(Alignment.LEADING)
		.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
);
updatePanel.setLayout(gl_updatePanel);
JPanel panel_5 = new JPanel();
panel_5.setBounds(72, 309, 374, 123);
add(panel_5);
panel_5.setLayout(null);
JScrollPane scrollPane_3 = new JScrollPane();
scrollPane_3.setBounds(0, 0, 374, 123);
panel_5.add(scrollPane_3);



table_3 = new JTable();
table_3.setModel(new DefaultTableModel(
	new Object[][] {
	},
	new String[] {
		"\u0425\u04E9\u0442\u04E9\u043B\u0431\u04E9\u0440\u0438\u0439\u043D \u043D\u044D\u0440", "\u0425\u0443\u0433\u0430\u0446\u0430\u0430", "\u041E\u0440\u043E\u043B\u0446\u0441\u043E\u043D \u0431\u0430\u0439\u0434\u0430\u043B"
	}
));
DefaultTableModel searchResultModel = (DefaultTableModel) table_3.getModel();
searchResultModel.setRowCount(0);
Connection connection3;
try {
	connection3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel", "root", "Tuugii0713");
	String query = "SELECT * FROM hutulburt where b_code='"+username+"'";
	try (Statement statement = connection3.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                String h_ner = resultSet.getString("hutulburiin_ner");
                Date h_date = resultSet.getDate("date_");
                String or = resultSet.getString("orolts");
                
                searchResultModel.addRow(new Object[]{h_ner,h_date,or});
            }
        }
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

scrollPane_3.setViewportView(table_3);
	DefaultTableModel searchResultModel11 = (DefaultTableModel) table.getModel();
	searchResultModel11.setRowCount(0);
    Connection connection;
	try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel", "root", "Tuugii0713");
		String query = "SELECT * FROM erdem_shinjilgee where b_code='"+username+"'";
		try (Statement statement = connection.createStatement();
	             ResultSet resultSet = statement.executeQuery(query)) {
	            while (resultSet.next()) {
	                String ciglel = resultSet.getString("ciglel");
	                String sedev = resultSet.getString("sedev");
	                String aguulga = resultSet.getString("aguulga");
	                String nuluu = resultSet.getString("nuluu");
	                searchResultModel11.addRow(new Object[]{ciglel,sedev,aguulga,nuluu});
	            }
	        }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    	
    	
    

setVisible(true);
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=null;
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshiin_medeelel","root","Tuugii0713");
	java.sql.Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from b_medeelel where username='"+username+"'");
	if(rs.next()) {
		b_ner.setText(rs.getString(4));
		b_code.setText(rs.getString(1));
		b_urgiin_ovog.setText(rs.getString(2));
		b_utasnii_dugaar.setText(rs.getString(6));
		b_ovog.setText(rs.getString(3));
		too.setText(rs.getString(10));
		byte[]imagedata=rs.getBytes("b_image_id");
		ImageIcon format = new ImageIcon(imagedata);
		image.setIcon(format);
		
	}
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}

