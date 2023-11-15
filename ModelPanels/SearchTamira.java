package ModelPanels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SearchTamira extends JPanel {

	/**
	 * Create the panel.
	 */
	public SearchTamira() {

		setBackground(new Color(255, 255, 255));
		setLayout(null);
		setBounds(0, 0, 662, 462);
		setLayout(null);
		
		//Copy from Search;
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 0, 662, 48);
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
		
		// Panelaar zohioigoo shaav;
		
		JPanel CSpanel = new JPanel();
		CSpanel.setBounds(36, 100, 340, 40);
		add(CSpanel);
		CSpanel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("КУ-ны тэнхим");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(48, 0, 233, 40);
		CSpanel.add(lblNewLabel_3);
		
		JPanel TSEIpanel = new JPanel();
		TSEIpanel.setBounds(36, 170, 340, 40);
		add(TSEIpanel);
		TSEIpanel.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("ЦЭИ-ийн тэнхим");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(47, 0, 233, 40);
		TSEIpanel.add(lblNewLabel_3_1);
		
		JPanel CHEMpanel = new JPanel();
		CHEMpanel.setBounds(36, 240, 340, 40);
		add(CHEMpanel);
		CHEMpanel.setLayout(null);
		
		JLabel lblNewLabel_3_2 = new JLabel("ХИ-ийн тэнхим");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_2.setBounds(47, 0, 233, 40);
		CHEMpanel.add(lblNewLabel_3_2);
		
		JPanel BARpanel = new JPanel();
		BARpanel.setBounds(36, 310, 340, 40);
		add(BARpanel);
		BARpanel.setLayout(null);
		
		JLabel lblNewLabel_3_3 = new JLabel("БДБИ-ийн тэнхим");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_3.setBounds(44, 0, 233, 40);
		BARpanel.add(lblNewLabel_3_3);
		
		JPanel MECHpanel = new JPanel();
		MECHpanel.setBounds(36, 380, 340, 40);
		add(MECHpanel);
		MECHpanel.setLayout(null);
		
		JLabel lblNewLabel_3_4 = new JLabel("МИ-ийн тэнхим");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_4.setBounds(44, 0, 233, 40);
		MECHpanel.add(lblNewLabel_3_4);
		
		CSpanel.addMouseListener(new PanelButtonMouseClicked(CSpanel));
		
		TSEIpanel.addMouseListener(new PanelButtonMouseClicked(TSEIpanel));
		
		CHEMpanel.addMouseListener(new PanelButtonMouseClicked(CHEMpanel));
		
		BARpanel.addMouseListener(new PanelButtonMouseClicked(BARpanel));
		
		MECHpanel.addMouseListener(new PanelButtonMouseClicked(MECHpanel));
		
		JLabel lblNewLabel_4 = new JLabel("Тэнхимүүд");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblNewLabel_4.setBounds(117, 52, 169, 38);
		add(lblNewLabel_4);
		
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
		
		public void mouseEntered(MouseEvent e) {
		
		pnl.setBackground(new Color(68,68,68));
		
		
		}

		
		public void mousePressed(MouseEvent e) {
		//list List= new list();
		//SearchTamira.show();
		
		pnl.setBackground(new Color(0,0,0));
		}

		
		public void mouseReleased(MouseEvent e) {
		pnl.setBackground(new Color(235,235,235));
		}

		
		public void mouseExited(MouseEvent e) {

		pnl.setBackground(new Color(235,235,235));

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			String user = null;
			list l=new list(user);
			l.show();
			
		}
	}
}
