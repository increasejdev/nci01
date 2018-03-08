package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.os.login.datasource.DataSource;

import beans.Accounts;


@WebServlet("/Controller")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");	
			
		
		if(action == null) {
			if(request.getSession() != null) request.getSession().invalidate();
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			
		}
		else if(action.equals("login")) {
			request.setAttribute("email", "");
			request.setAttribute("password", "");
			request.setAttribute("vmessage", "");
			
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
				
		
		else request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String action = request.getParameter("action");			
		HashMap<String, String> rt = null;
		
		if(action.equals("dologin")) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			request.getSession().setAttribute("email", email);
			
			Accounts account = new Accounts(email, password);
			if(account.validate()) {				
								
				rt = DataSource.getInstance().showTables();
				
				request.getSession().setAttribute("table", rt);
				
				request.getSession().setAttribute("Accounts", DataSource.getInstance().UsersQuery());
				request.getSession().setAttribute("Rfc", DataSource.getInstance().RfcQuery());
				request.getSession().setAttribute("Codifier", DataSource.getInstance().CodifierQuery());
				request.getSession().setAttribute("Status", DataSource.getInstance().StatusQuery());
				request.getSession().setAttribute("Priority", DataSource.getInstance().PriorityQuery());
				request.getSession().setAttribute("Solution", DataSource.getInstance().SolutionQuery());
				request.getSession().setAttribute("Issue", DataSource.getInstance().IssueQuery());
				
				request.getRequestDispatcher("admin.jsp").forward(request, response);				
			}
			else {
				request.setAttribute("vmessage", account.getMessage());
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		}
	}
}
