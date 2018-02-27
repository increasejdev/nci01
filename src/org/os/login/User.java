package org.os.login;

public class User {
	
	private String user;
	private String password;
	
	
	public String getUserName() {
		return user;
	}
	public void setUserName(String userId) {
		this.user = userId;
	}
	public String getPassword() {
		return password;
	}
	@Override
	public String toString() {
		return "User [user=" + user + "]";
	}
	
}
