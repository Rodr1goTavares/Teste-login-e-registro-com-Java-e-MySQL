package br.com.crud.database;

public class AccountModel {
	private int id;
	private String user;
	private String email;
	
	public void setId(int id) {
		this.id = id;
	}	
	public int getId() {
		return this.id;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	public String getUser() {
		return this.user;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void showUser() {
		System.out.println("Id: " + this.id + "\nUser:  " + this.user + "\nEmail:  " + this.email);
	}
}
