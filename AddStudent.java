package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudent extends JFrame implements ActionListener{
	JTextField nameTextField;
	private JTextField facultyTextField;
	private JTextField courseTextField;
	private JTextField idTextField;
	private JTextField levelTextField;
	private JTextField classTextField;
	JButton btnAddStudent, btnBack;
	JComboBox comboBox;
	int counter = 0;

	public AddStudent() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Student");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(204, 10, 272, 47);
		getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblName.setBounds(64, 74, 172, 30);
		getContentPane().add(lblName);
		
		JLabel lblFaculty = new JLabel("Faculty");
		lblFaculty.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblFaculty.setBounds(64, 124, 172, 30);
		getContentPane().add(lblFaculty);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblCourse.setBounds(64, 173, 172, 30);
		getContentPane().add(lblCourse);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblId.setBounds(64, 224, 172, 30);
		getContentPane().add(lblId);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblLevel.setBounds(64, 276, 172, 30);
		getContentPane().add(lblLevel);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblClass.setBounds(64, 323, 172, 30);
		getContentPane().add(lblClass);
		
		JLabel lblLabtime = new JLabel("Lab Time");
		lblLabtime.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblLabtime.setBounds(64, 374, 172, 30);
		getContentPane().add(lblLabtime);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		nameTextField.setBounds(235, 82, 375, 30);
		getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		facultyTextField = new JTextField();
		facultyTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		facultyTextField.setColumns(10);
		facultyTextField.setBounds(235, 124, 375, 30);
		getContentPane().add(facultyTextField);
		
		courseTextField = new JTextField();
		courseTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		courseTextField.setColumns(10);
		courseTextField.setBounds(235, 173, 375, 30);
		getContentPane().add(courseTextField);
		
		idTextField = new JTextField();
		idTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		idTextField.setColumns(10);
		idTextField.setBounds(235, 224, 375, 30);
		getContentPane().add(idTextField);
		
		levelTextField = new JTextField();
		levelTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		levelTextField.setColumns(10);
		levelTextField.setBounds(235, 276, 375, 30);
		getContentPane().add(levelTextField);
		
		classTextField = new JTextField();
		classTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		classTextField.setColumns(10);
		classTextField.setBounds(235, 323, 375, 30);
		getContentPane().add(classTextField);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 28));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sunday 8:00 - 10:00", "Monday 10:00 - 12:00", "Wednesday 12:00 - 2:00", "Thuresday 2:00 - 4:00"} ));
		comboBox.setBounds(235, 374, 375, 56);
		getContentPane().add(comboBox);
				
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnBack.setBounds(528, 480, 143, 77);
		getContentPane().add(btnBack);
		btnBack.addActionListener(this);
		
		btnAddStudent = new JButton("AddStudent");
		btnAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnAddStudent.setBounds(148, 480, 321, 77);
		getContentPane().add(btnAddStudent);
		btnAddStudent.addActionListener(this);
		
		setBounds(390, 140, 725, 650);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnBack) {
			dispose();
			AssistantSection ad = new AssistantSection();
			ad.setVisible(true);
		}else if (e.getSource()==btnAddStudent) {
			if (nameTextField.getText().isEmpty() || facultyTextField.getText().isEmpty() || courseTextField.getText().isEmpty() || idTextField.getText().isEmpty() || levelTextField.getText().isEmpty() || classTextField.getText().isEmpty() ) {
				
				JOptionPane.showMessageDialog(null, "Sorry, unable to add Student");
			
			}else {
			
			Student student1 = new Student ();

			student1.setName(nameTextField.getText());
			student1.setFaculty(facultyTextField.getText());
			student1.setCourse(courseTextField.getText());
			student1.setId(idTextField.getText());
			student1.setLevel(levelTextField.getText());
			student1.setsClass(classTextField.getText());
			student1.setLabTime((String) comboBox.getSelectedItem());
			counter++;
			student1.setRollNo(counter);
			
			Student.studentList.add(student1);
			
			nameTextField.setText("");
			facultyTextField.setText("");
			courseTextField.setText("");
			idTextField.setText("");
			levelTextField.setText("");
			classTextField.setText("");
			
			JOptionPane.showMessageDialog(null, "Student has been added successfully");
			
		}
		}
	}
}

