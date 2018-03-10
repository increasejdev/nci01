package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import beans.Book;
import DAO.BookDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tables")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;   
	private BookDAO bookDAO;
	String action = "list";
	
	public void init() {
		bookDAO = new BookDAO();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		action = request.getParameter("action");			

		try {
			switch (action) {
			case "new":
				showNewForm(request, response);
				break;
			case "insert":
				insertBook(request, response);
				break;
			case "delete":
				deleteBook(request, response);
				break;
			case "edit":
				showEditForm(request, response);
				break;			
			case "list":
				listBook(request, response);
				break;
			default:
				listBook(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
				
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		action = request.getParameter("action");
		
		
		try {
			switch (action) {			
			case "insert":
				insertBook(request, response);
				break;
			case "update":
				updateBook(request, response);
				break;
			default:
				listBook(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
	
	private void listBook(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Book> listBook = bookDAO.listAllBooks();
		request.setAttribute("Book", listBook);		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/menu?name=Book");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/CRUD/BookForm.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Book existingBook = bookDAO.getBook(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/CRUD/BookForm.jsp");
		request.setAttribute("book", existingBook);
		dispatcher.forward(request, response);

	}

	private void insertBook(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String title = request.getParameter("title");		
		String author = request.getParameter("author");		
		int price = Integer.parseInt(request.getParameter("price"));	
		
		Book newBook = new Book(title, author, price);
		bookDAO.insertBook(newBook);
		response.sendRedirect("/ticket/tables?action=list");
	}

	private void updateBook(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		int price = Integer.parseInt(request.getParameter("price"));

		Book book = new Book(id, title, author, price);
		bookDAO.updateBook(book);
		response.sendRedirect("/ticket/tables?action=list");
	}

	private void deleteBook(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		Book book = new Book(id);
		bookDAO.deleteBook(book);
		response.sendRedirect("/ticket/tables?action=list");

	}


}
