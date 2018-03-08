package org.os.login;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.os.login.datasource.DataSource;


@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		
		String userId, password;
		LoginService loginService = new LoginService();
		
		userId = request.getParameter("user");
		password = request.getParameter("password");	
		
	
		boolean result = loginService.authenticate(userId, password);
		if(result) {
			User user = loginService.getUserDetails(userId);
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
			dispatcher.forward(request, response);
			return;
		} else {
			response.sendRedirect("login.jsp");
			return;
		}
			
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//ArrayList<String> arr = DataSource.getInstance().showTables();	
//		request.setAttribute("table1", arr);
//		request.getRequestDispatcher("admin.jsp").forward(request, response);
//		
	}

}
