package org.os.login;

import java.util.Map;
import org.os.login.datasource.DataSource;

public class LoginService {	
	User SuccessUser = new User();
		
	public boolean authenticate(String userId, String password) {
		 Map<String, String> Auth = DataSource.getInstance().selectAll();
		 
		boolean result = false;
		// TODO ѕрикрутить проверку по базе дл€ логинов
		
		for(Map.Entry<String, String> entry : Auth.entrySet()) {
			if (userId.equals(entry.getKey()) && password.equals(entry.getValue())) {
				result = true;
				SuccessUser.setName(entry.getKey());
			} else {
				result = false;
			}
		}
		return result;
		// mysql://b8xwsr0isw3a1zkm:sux3rx4pjxt4hij1@vlvlnl1grfzh34vj.chr7pe7iynqr.eu-west-1.rds.amazonaws.com:3306/w4gaxmhawf08wsxa
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
