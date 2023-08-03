package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateStudent extends JFrame implements ActionListener {
	JTextField nameTextField, facultyTextField, courseTextField, idTextField,levelTextField, classTextField, rollNoTextField;
	JButton btnUpdateStudent, btnBack, btnLoadRecord ;
	JComboBox comboBox;
	
	public UpdateStudent() {
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblName.setBounds(64, 97, 172, 30);
		getContentPane().add(lblName);
		
		JLabel lblFaculty = new JLabel("Faculty");
		lblFaculty.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblFaculty.setBounds(64, 137, 172, 30);
		getContentPane().add(lblFaculty);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblCourse.setBounds(64, 177, 172, 30);
		getContentPane().add(lblCourse);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblId.setBounds(64, 217, 172, 30);
		getContentPane().add(lblId);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblLevel.setBounds(64, 257, 172, 30);
		getContentPane().add(lblLevel);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblClass.setBounds(64, 302, 172, 30);
		getContentPane().add(lblClass);
		
		JLabel lblLabtime = new JLabel("Lab Time");
		lblLabtime.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblLabtime.setBounds(64, 363, 172, 30);
		getContentPane().add(lblLabtime);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		nameTextField.setBounds(235, 97, 375, 30);
		getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		facultyTextField = new JTextField();
		facultyTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		facultyTextField.setColumns(10);
		facultyTextField.setBounds(235, 137, 375, 30);
		getContentPane().add(facultyTextField);
		
		courseTextField = new JTextField();
		courseTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		courseTextField.setColumns(10);
		courseTextField.setBounds(235, 177, 375, 30);
		getContentPane().add(courseTextField);
		
		idTextField = new JTextField();
		idTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		idTextField.setColumns(10);
		idTextField.setBounds(235, 217, 375, 30);
		getContentPane().add(idTextField);
		
		levelTextField = new JTextField();
		levelTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		levelTextField.setColumns(10);
		levelTextField.setBounds(235, 257, 375, 30);
		getContentPane().add(levelTextField);
		
		classTextField = new JTextField();
		classTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		classTextField.setColumns(10);
		classTextField.setBounds(235, 302, 375, 30);
		getContentPane().add(classTextField);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 28));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sunday 8:00 - 10:00", "Monday 10:00 - 12:00", "Wednesday 12:00 - 2:00", "Thuresday 2:00 - 4:00"} ));
		comboBox.setBounds(235, 360, 375, 56);
		getContentPane().add(comboBox);
				
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnBack.setBounds(528, 480, 143, 77);
		getContentPane().add(btnBack);
		btnBack.addActionListener(this);
		
		btnUpdateStudent = new JButton("Update Student");
		btnUpdateStudent.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnUpdateStudent.setBounds(148, 480, 321, 77);
		getContentPane().add(btnUpdateStudent);
		btnUpdateStudent.addActionListener(this);
		
		JLabel lblRollNo = new JLabel("Roll No");
		lblRollNo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblRollNo.setBounds(64, 22, 172, 30);
		getContentPane().add(lblRollNo);
		
		rollNoTextField = new JTextField();
		rollNoTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		rollNoTextField.setColumns(10);
		rollNoTextField.setBounds(235, 22, 252, 30);
		getContentPane().add(rollNoTextField);
		
		btnLoadRecord = new JButton("load Record");
		btnLoadRecord.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnLoadRecord.setBounds(514, 16, 172, 43);
		getContentPane().add(btnLoadRecord);
		btnLoadRecord.addActionListener(this);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.blue);
		separator.setBounds(25, 69, 650, 1);
		getContentPane().add(separator);
		
		setBounds(390, 140, 725, 650);
		// TODO Auto-generated constructor stub
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnBack) {
			dispose();
			AssistantSection ad = new AssistantSection();
			ad.setVisible(true);
		}else if (e.getSource()==btnLoadRecord) {
			for (int i =0; i< Student.studentList.size(); i++) {
				if(Integer.parseInt(rollNoTextField.getText().trim()) == Student.studentList.get(i).getRollNo()) {
					nameTextField.setText(Student.studentList.get(i).getName());
					facultyTextField.setText(Student.studentList.get(i).getFaculty());
					courseTextField.setText(Student.studentList.get(i).getCourse());
					idTextField.setText(Student.studentList.get(i).getId());
					levelTextField.setText(Student.studentList.get(i).getLevel());
					classTextField.setText(Student.studentList.get(i).getsClass());
					comboBox.setSelectedItem(Student.studentList.get(i).getLabTime());
				}else {
					JOptionPane.showMessageDialog(null, "Student Not Found");
					rollNoTextField.setText("");

				}
			}
			
			
		}else if (e.getSource()==btnUpdateStudent) {
			if (nameTextField.getText().isEmpty() || facultyTextField.getText().isEmpty() || courseTextField.getText().isEmpty() || idTextField.getText().isEmpty() || levelTextField.getText().isEmpty() || classTextField.getText().isEmpty() ) {
				
				JOptionPane.showMessageDialog(null, "Sorry, unable to update Student");
			
			}else {
				for (int i =0; i< Student.studentList.size(); i++) {
					if(Integer.parseInt(rollNoTextField.getText().trim()) == Student.studentList.get(i).getRollNo()) {
						Student.studentList.get(i).setName(nameTextField.getText());
						Student.studentList.get(i).setFaculty(facultyTextField.getText());
						Student.studentList.get(i).setCourse(courseTextField.getText());
						Student.studentList.get(i).setId(idTextField.getText());
						Student.studentList.get(i).setLevel(levelTextField.getText());
						Student.studentList.get(i).setsClass(classTextField.getText());
						Student.studentList.get(i).setLabTime((String) comboBox.getSelectedItem());

					}
				}
			nameTextField.setText("");
			facultyTextField.setText("");
			courseTextField.setText("");
			idTextField.setText("");
			levelTextField.setText("");
			classTextField.setText("");
			
			JOptionPane.showMessageDialog(null, "Student has been updateded successfully");
			
		}
		}
	}
}
