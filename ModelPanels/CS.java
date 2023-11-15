package ModelPanels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CS extends JPanel {

	/**
	 * Create the panel.
	 */
	public CS() {

		setBackground(new Color(255, 255, 255));
		setLayout(null);

		setBounds(128,0,640,435);
		setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 0, 646, 48);
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
		
		//kl;lkjfdsdfghjkl
		
	}

}
