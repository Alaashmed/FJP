package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin extends JFrame implements ActionListener {
	JTextField nameTextField;
	JPasswordField passwordField;
	JButton btnLogin;
	public Admin() {
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblName.setBounds(127, 109, 88, 50);
		getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPassword.setBounds(127, 208, 133, 50);
		getContentPane().add(lblPassword);
		
		btnLogin = new JButton("Log in");
		btnLogin.addActionListener(this);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnLogin.setBounds(271, 328, 157, 68);
		getContentPane().add(btnLogin);
		
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
		
		setVisible(true);
		setBounds(390, 180, 725,515);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnLogin) {
			String userText = nameTextField.getText();
			String pwd = new String (passwordField.getPassword());
			
			if(userText.equalsIgnoreCase("admin") && pwd.equalsIgnoreCase("admin123")) {
				dispose();
				AdminSection ad = new AdminSection();
				ad.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Please try again");
				nameTextField.setText("");
				passwordField.setText("");
			}
		}
		
	}
}
