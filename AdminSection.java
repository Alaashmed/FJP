 package Project;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class AdminSection extends JFrame implements ActionListener{
	JButton addAssistant, viewAssistant, btnLogOut;

	public AdminSection() {
		getContentPane().setLayout(null);
		
		JLabel lbAdminSection = new JLabel("Admin Section");
		lbAdminSection.setHorizontalAlignment(SwingConstants.CENTER);
		lbAdminSection.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbAdminSection.setBounds(205, 49, 283, 53);
		getContentPane().add(lbAdminSection);
		
		addAssistant = new JButton("Add Assistant");
		addAssistant.setFont(new Font("Tahoma", Font.PLAIN, 28));
		addAssistant.setBounds(224, 144, 246, 53);
		getContentPane().add(addAssistant);
		addAssistant.addActionListener(this);
		
		viewAssistant = new JButton("View Assistant");
		viewAssistant.setFont(new Font("Tahoma", Font.PLAIN, 28));
		viewAssistant.setBounds(224, 229, 246, 53);
		getContentPane().add(viewAssistant);
		viewAssistant.addActionListener(this);
		
		btnLogOut = new JButton("Log out");
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnLogOut.setBounds(224, 319, 246, 53);
		getContentPane().add(btnLogOut);
		btnLogOut.addActionListener(this);
		 
		setVisible(true);
		setBounds(390, 180, 725,515);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== addAssistant) {
			dispose();
			AddAssistant ad = new AddAssistant();
			ad.setVisible(true);
			
		}else if (e.getSource()== viewAssistant) {
			dispose();
			ViewAssistant ad = new ViewAssistant();
			ad.setVisible(true);
			
		}else if (e.getSource()== btnLogOut) {
			dispose();
			StudentReport ad = new StudentReport();
			ad.setVisible(true);
		}
	}

}
