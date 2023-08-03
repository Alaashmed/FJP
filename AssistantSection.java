package Project;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AssistantSection extends JFrame implements ActionListener{
	JButton btnLogOut, btnDeleteStudent, btnEditStudent, btnViewStudent, btnAddStudent;
	
	public AssistantSection() {
		getContentPane().setLayout(null);
		
		JLabel lblAssistantSection = new JLabel("Assistant Section");
		lblAssistantSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssistantSection.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblAssistantSection.setBounds(200, 37, 323, 78);
		getContentPane().add(lblAssistantSection);
		
		btnAddStudent = new JButton("Add Student");
		btnAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnAddStudent.setBounds(72, 156, 229, 59);
		getContentPane().add(btnAddStudent);
		btnAddStudent.addActionListener(this);
		
		btnViewStudent = new JButton("View Student");
		btnViewStudent.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnViewStudent.setBounds(375, 156, 229, 59);
		getContentPane().add(btnViewStudent);
		btnViewStudent.addActionListener(this);
		
		btnEditStudent = new JButton("Edit Student");
		btnEditStudent.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnEditStudent.setBounds(72, 270, 229, 59);
		getContentPane().add(btnEditStudent);
		btnEditStudent.addActionListener(this);
		
		btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnDeleteStudent.setBounds(375, 270, 229, 59);
		getContentPane().add(btnDeleteStudent);
		btnDeleteStudent.addActionListener(this);
		
		btnLogOut = new JButton("Log Out");
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnLogOut.setBounds(228, 378, 229, 59);
		getContentPane().add(btnLogOut);
		btnLogOut.addActionListener(this);

		setBounds(390, 180, 725, 515);
		setVisible(true);
		 
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnLogOut) {
			dispose();
			StudentReport ad = new StudentReport();
			ad.setVisible(true);
		}else if (e.getSource()== btnAddStudent) {
			dispose();
			AddStudent ad = new AddStudent();
			ad.setVisible(true);
		}else if (e.getSource()== btnViewStudent) {
			dispose();
			ViewStudent ad = new ViewStudent();
			ad.setVisible(true);
		}else if (e.getSource()== btnEditStudent) {
			dispose();
			UpdateStudent ad = new UpdateStudent();
			ad.setVisible(true);
		}
		else if (e.getSource()== btnDeleteStudent) {
			dispose();
			DeleteStudent ad = new DeleteStudent();
			ad.setVisible(true);
		}
		
		
	}
	public static void main(String args[]) {
		new AssistantSection();
	}
}
