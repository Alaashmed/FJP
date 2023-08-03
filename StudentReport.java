package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentReport extends JFrame implements ActionListener {
	JPanel panel;
	JButton adminBtn, assistantBtn;
	
	public StudentReport() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(390, 180, 725, 515);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(panel);
		panel.setLayout(null);
		
		adminBtn = new JButton("Admin Login");
		adminBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		adminBtn.setBounds(236, 165, 222, 55);
		panel.add(adminBtn);
		adminBtn.addActionListener(this);
		
		JLabel student_label = new JLabel("Student Report");
		student_label.setBounds(248, 70, 222, 55);
		student_label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(student_label);
		
		assistantBtn = new JButton("Assistant Login");
		assistantBtn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		assistantBtn.setBounds(236, 267, 222, 55);
		panel.add(assistantBtn);
		assistantBtn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== adminBtn) {
			dispose();
			Admin ad = new Admin();
			ad.setVisible(true);
				
		}else if (e.getSource()== assistantBtn) {
			dispose();
			AssistantLogIn ad = new AssistantLogIn();
			ad.setVisible(true);
		}
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentReport frame = new StudentReport();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
