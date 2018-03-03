package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.os.login.User;

/**
 * Servlet implementation class PassObject
 */
@WebServlet("/PassObject")
public class PassObject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassObject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user1 = new User("Bob", "1");
		User user2 = new User("Mike", "2");
		User user3 = new User("Sue", "3");
		
		request.setAttribute("user1", user1);
		request.getSession().setAttribute("user2", user2);
		request.getServletContext().setAttribute("user3", user3);
		
		request.setAttribute("link", "<a href='yandex.ru'>Yandex</a>");
		
		request.getRequestDispatcher("jstl1.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
