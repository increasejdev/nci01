package org.os.login.datasource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import beans.Accounts;
import beans.Rfc;


public class DataSource {	
	
	private static DataSource instance; 
	private Statement statement;     	
	public Connection conn;	
	private static final String DATABASE_NAME = "heroku_b7a8cd9e24ff77b";
	
	private DataSource() {
		String DB_URL = "jdbc:mysql://eu-cdbr-west-02.cleardb.net?useUnicode=true&characterEncoding=utf-8";
		String DB_LOGIN = "b3f241c16c9fcf";
		String DB_PASSWORD = "8311fc8b";		
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver).newInstance();
			this.conn = (Connection)DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
			System.out.println("connection established");
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	
	public static synchronized DataSource getInstance() {
		if (instance == null) {
			instance = new DataSource();
		}
		
		return instance;
	}
	
       	
	public  Map<String, String> selectAll() {
		String sql = "SELECT email, password FROM " + DATABASE_NAME + ".Users";
		Map<String, String> users = new HashMap<>();
		
		try (
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				users.put(rs.getString("email"), rs.getString("password"));				
			}
						
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		
		return users;
		
	}
	
	private  String firstLetter(String str) {		
		String result = str.substring(0, 1).toUpperCase() + str.substring(1);		
		return result;
	}
	
	public HashMap<String, String> showTables() {	
		HashMap<String, String> objS = new HashMap<>();
		
		String icons[] = {"fa fa-database","fa fa-drivers-license-o","fa fa-edit","fa fa-film","fa fa-send-o","fa fa-sliders","fa fa-address-book-o"};
		int i = 0;
		
		try {	    			    
				DatabaseMetaData md = conn.getMetaData();
				ResultSet rs = md.getTables(DATABASE_NAME, null, "%", null);				
				while(rs.next()) {	
					objS.put(firstLetter(rs.getString(3)), icons[i]);					
					i++;
				}
		} catch(Exception ex) {ex.getMessage();}		
				
		return objS;
	}
	

	public ArrayList<Accounts> UsersQuery() {
		 String sql = "SELECT * FROM " + DATABASE_NAME + "." + "users";	
		 ArrayList<Accounts> users = new ArrayList<>();		
		try {
				statement = conn.createStatement();
				ResultSet rs = statement.executeQuery(sql); 			
			while (rs.next()) 						
				users.add(new Accounts(Integer.parseInt(rs.getString(1)),rs.getString(2), rs.getString(3)));	
			
						
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}		
		return users;
		}
	
	public ArrayList<Rfc> RfcQuery() {
		 String sql = "SELECT * FROM " + DATABASE_NAME + "." + "Rfc";	
		 ArrayList<Rfc> users = new ArrayList<>();		
		try {
				statement = conn.createStatement();
				ResultSet rs = statement.executeQuery(sql); 			
			while (rs.next()) 						
				users.add(new Rfc(Integer.parseInt(rs.getString(1)),rs.getString(2), Integer.parseInt(rs.getString(3))));	
			
						
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}		
		return users;
		}
	
	
	public static void main(String[] args) {
		ArrayList<Rfc> olya8 = new DataSource().RfcQuery();
		
		System.out.println(olya8);
		     
		
	}

	}

