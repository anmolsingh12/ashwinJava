package Model;

public class User {
	
	private int id;
	private String password;
	private int contactId;
	private String name;
	private String email;
	private String phone;
	
public User(int id, String password, int contactId, String name, String email, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.contactId = contactId;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}


public User ()
{
	super();
}

public User (int id , String pass )
{
this.id = id ; 
this.password = pass;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getContactId() {
	return contactId;
}
public void setContactId(int contactId) {
	this.contactId = contactId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}




}
