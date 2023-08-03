package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteStudent extends JFrame implements  ActionListener{
	JTextField rollNoTextField;
	JButton btnBack, btnDeleteStudent;
	public DeleteStudent() {
		getContentPane().setLayout(null);
		
		JLabel lblDeleteStudent = new JLabel("Delete Student");
		lblDeleteStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteStudent.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblDeleteStudent.setBounds(169, 58, 350, 77);
		getContentPane().add(lblDeleteStudent);
		
		JLabel lblRollNo = new JLabel("Roll No");
		lblRollNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblRollNo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRollNo.setBounds(62, 176, 186, 89);
		getContentPane().add(lblRollNo);
		
		rollNoTextField = new JTextField();
		rollNoTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		rollNoTextField.setBounds(269, 199, 326, 60);
		getContentPane().add(rollNoTextField);
		rollNoTextField.setColumns(10);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnBack.setBounds(525, 347, 143, 77);
		getContentPane().add(btnBack);
		btnBack.addActionListener(this);
		
		btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnDeleteStudent.setBounds(147, 347, 321, 77);
		getContentPane().add(btnDeleteStudent);
		btnDeleteStudent.addActionListener(this);
		
		setVisible(true);
        setBounds(390, 180, 725, 515);

		// TODO Auto-generated constructor stub
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnBack) {
		dispose();
		AssistantSection ad = new AssistantSection();
		ad.setVisible(true);
		}else if (e.getSource()== btnDeleteStudent) {
			for (int i =0; i< Student.studentList.size(); i++) {
				if(Integer.parseInt(rollNoTextField.getText().trim()) == Student.studentList.get(i).getRollNo()) {
					Student.studentList.remove(i);
					JOptionPane.showMessageDialog(null, "Student has been removed Successfully");

				}else {
					JOptionPane.showMessageDialog(null, "Student Not Found");
				}
				rollNoTextField.setText("");
			}
			
			
		}
	}
	

}
