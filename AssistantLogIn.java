package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AssistantLogIn extends JFrame implements ActionListener {
	JLabel lblAssistantLogin;
	JTextField nameTextField;
	JPasswordField passwordField;
	JButton btnLogin;
	private JButton btnBack;
	
	public AssistantLogIn() {
		getContentPane().setLayout(null);
		
		lblAssistantLogin = new JLabel("Assistant Login");
		lblAssistantLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssistantLogin.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblAssistantLogin.setBounds(168, 31, 335, 50);
		getContentPane().add(lblAssistantLogin);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblName.setBounds(127, 109, 88, 50);
		getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPassword.setBounds(127, 208, 133, 50);
		getContentPane().add(lblPassword);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		nameTextField.setBounds(317, 117, 228, 50);
		getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		passwordField.setColumns(10);
		passwordField.setBounds(317, 216, 228, 50);
		getContentPane().add(passwordField);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnBack.setBounds(544, 328, 114, 68);
		getContentPane().add(btnBack);
		btnBack.addActionListener(this);

		
		btnLogin = new JButton("Log in");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnLogin.setBounds(271, 328, 157, 68);
		getContentPane().add(btnLogin);
		btnLogin.addActionListener(this);

		setVisible(true);
		setBounds(390, 180, 725,515);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnLogin) {
			String userText = nameTextField.getText();
			String pwd = new String (passwordField.getPassword());
			for (int i =0; i< Assistant.assistantList.size(); i++) {
				if(userText.equalsIgnoreCase(Assistant.assistantList.get(i).getName()) && pwd.equalsIgnoreCase(Assistant.assistantList.get(i).getPass())) {
					dispose();
					AssistantSection ad = new AssistantSection();
					ad.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "Please try again", "Login Error", JOptionPane.ERROR_MESSAGE);
					nameTextField.setText("");
					passwordField.setText("");
				} 
			}
		
		}else if (e.getSource()==btnBack) {
			dispose();
			StudentReport ad = new StudentReport();
			ad.setVisible(true);
		}
		
	}

}
