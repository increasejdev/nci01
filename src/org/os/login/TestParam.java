package org.os.login;

import java.io.IOException;
import java.util.HashMap;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.os.login.datasource.DataSource;

@WebServlet("/TestParam")
public class TestParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestParam() {
        super();        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<String, HashMap<String,String>> pTable = new HashMap<>();	
		
		pTable.put("Issue", DataSource.getInstance().UniversalQuery("Issue"));
		pTable.put("Codifier", DataSource.getInstance().UniversalQuery("Codifier"));
		pTable.put("Status", DataSource.getInstance().UniversalQuery("Status"));
		pTable.put("Priority", DataSource.getInstance().UniversalQuery("Priority"));
		pTable.put("Solution", DataSource.getInstance().UniversalQuery("Solution"));
		pTable.put("Rfc", DataSource.getInstance().UniversalQuery("Rfc"));
		pTable.put("Users", DataSource.getInstance().UniversalQuery("Users"));
		
		HashMap<String, String> rt = DataSource.getInstance().showTables();	
		
		
		request.getSession().setAttribute("table", rt);
		request.setAttribute("tableParam", pTable);
		request.getRequestDispatcher("admin.jsp").forward(request, response);
	}

}
