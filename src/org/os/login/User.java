package org.os.login;

public class User {
	
	private String name;
	private String password;
	
	public User() {
		
	}
	
	public User (String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String userId) {
		this.name = userId;
	}
	public String getPassword() {
		return password;
	}
	@Override
	public String toString() {
		return "User [user=" + name + "]";
	}
	
}
