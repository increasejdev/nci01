package org.os.login;

import java.util.Map;
import org.os.login.datasource.DataSource;

public class LoginService {	
	User SuccessUser = new User();
		
	public boolean authenticate(String userId, String password) {
		 Map<String, String> Auth = new DataSource().selectAll();
		 
		boolean result = false;
		
		for(Map.Entry<String, String> entry : Auth.entrySet()) {
			if (userId.equals(entry.getKey()) && password.equals(entry.getValue())) {
				result = true;
				SuccessUser.setUserName(entry.getKey());
			} else {
				result = false;
			}
		}
		return result;
	}

	public User getUserDetails(String userId) {	
		
		return SuccessUser;
	}
	
//	public static void main (String[] args) {
//		LoginService ls = new LoginService();
//		System.out.print(ls.authenticate("Olya", "Pa$$w0rd"));
//		System.out.println(ls.getUserDetails("Olya"));
//	}

	
}
