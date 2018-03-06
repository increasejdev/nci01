package controller;

import java.io.IOException;
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
		HashMap<String, HashMap<String,String>> pTable = new HashMap<>();
		HashMap<String, String> rt = null;
		
		if(action.equals("dologin")) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			request.setAttribute("email", email);
			
			Accounts account = new Accounts(email, password);
			if(account.validate()) {				
				
				pTable.put("Issue", DataSource.getInstance().UniversalQuery("Issue"));
				pTable.put("Codifier", DataSource.getInstance().UniversalQuery("Codifier"));
				pTable.put("Status", DataSource.getInstance().UniversalQuery("Status"));
				pTable.put("Priority", DataSource.getInstance().UniversalQuery("Priority"));
				pTable.put("Solution", DataSource.getInstance().UniversalQuery("Solution"));
				pTable.put("Rfc", DataSource.getInstance().UniversalQuery("Rfc"));
				pTable.put("Users", DataSource.getInstance().UniversalQuery("Users"));
				
				rt = DataSource.getInstance().showTables();
				
				request.getServletContext().setAttribute("table", rt);
				request.setAttribute("tableParam", pTable);
				request.getRequestDispatcher("admin.jsp").forward(request, response);				
			}
			else {
				request.setAttribute("vmessage", account.getMessage());
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		}
	}
}
