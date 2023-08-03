package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AddAssistant extends JFrame implements ActionListener{
	JTextField nameTextField, emailTextField, contactTextField;
	JPasswordField passwordField;
	JButton btnBack, btnAddAssistant;
	int count =0;
	public AddAssistant() {
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblName.setBounds(92, 113, 152, 34);
		getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPassword.setBounds(92, 172, 152, 34);
		getContentPane().add(lblPassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblEmail.setBounds(92, 231, 152, 34);
		getContentPane().add(lblEmail);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblContactNo.setBounds(92, 292, 152, 34);
		getContentPane().add(lblContactNo);
		
		JLabel lblAddAssistant = new JLabel("Add Assistant");
		lblAddAssistant.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddAssistant.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblAddAssistant.setBounds(233, 37, 246, 40);
		getContentPane().add(lblAddAssistant);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		nameTextField.setBounds(279, 113, 274, 40);
		getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		emailTextField.setColumns(10);
		emailTextField.setBounds(279, 225, 274, 40);
		getContentPane().add(emailTextField);
		
		contactTextField = new JTextField();
		contactTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		contactTextField.setColumns(10);
		contactTextField.setBounds(279, 286, 274, 40);
		getContentPane().add(contactTextField);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		passwordField.setBounds(279, 169, 274, 37);
		getContentPane().add(passwordField);
		
		btnAddAssistant = new JButton("Add Assistant");
		btnAddAssistant.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnAddAssistant.setBounds(204, 366, 222, 58);
		getContentPane().add(btnAddAssistant);
		btnAddAssistant.addActionListener(this);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnBack.setBounds(560, 366, 117, 58);
		getContentPane().add(btnBack);
		btnBack.addActionListener(this);
		
		setVisible(true);
		setBounds(390, 180, 725,515);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnBack) {
			dispose();
			AdminSection ad = new AdminSection();
			ad.setVisible(true);
		}else if (e.getSource()== btnAddAssistant) {
			if (nameTextField.getText().isEmpty() || emailTextField.getText().isEmpty() || contactTextField.getText().isEmpty() || new String(passwordField.getPassword()).isEmpty()) {
				
				JOptionPane.showMessageDialog(null, "Sorry, unable to add Assistant");
			
			}else {
			
				Assistant assistant1 = new Assistant ();
				assistant1.setName(nameTextField.getText());
				assistant1.setPass(new String (passwordField.getPassword()));
				assistant1.setEmail(emailTextField.getText());
				assistant1.setContact(contactTextField.getText());
				
				
				Assistant.assistantList.add(assistant1);
				
				
				nameTextField.setText("");
				passwordField.setText("");
				emailTextField.setText("");
				contactTextField.setText("");
				JOptionPane.showMessageDialog(null, "Assistant has been added successfully");
				
				
			}
		}
	}
}
