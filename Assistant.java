package Project;

import java.util.ArrayList;
import java.util.List;

public class Assistant {
	static List<Assistant> assistantList = new ArrayList<Assistant>();
	private String name, pass, email, contact;
	int id = (int)Math.floor(Math.random()*100000);
	
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Assistant() {	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

}