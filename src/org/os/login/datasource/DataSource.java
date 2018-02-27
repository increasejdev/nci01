package org.os.login.datasource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class DataSource {
	Connection conn = null;	
	private static final String DB_URL = "jdbc:mysql://eu-cdbr-west-02.cleardb.net?useUnicode=true&characterEncoding=utf-8";
	private static final String DB_LOGIN = "b3f241c16c9fcf";
	private static final String DB_PASSWORD = "8311fc8b";
	private static final String DATABASE_NAME = "heroku_b7a8cd9e24ff77b";
	
	private Connection connect(){
		try {
			conn = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
		} catch (SQLException e) {				
			e.printStackTrace();
		}
		System.out.println("connection established");
		return conn;
	}
	
	public Map<String, String> selectAll() {
		String sql = "SELECT user, password FROM " + DATABASE_NAME + ".Users";
		Map<String, String> users = new HashMap<>();
		
		try (Connection conn = this.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				users.put(rs.getString("user"), rs.getString("password"));				
			}
						
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		
		return users;
		
	}
	
	public void showTables() {		
		try {
			    Connection conn = this.connect();		
				DatabaseMetaData md = conn.getMetaData();
				ResultSet rs = md.getTables(DATABASE_NAME, null, "%", null);
				while (rs.next()) {
					System.out.println(rs.getString(3));				
				}
		} catch(Exception ex) {ex.getMessage();}		
						
		
	}
		
	
	
	public static void main(String[] args) {
		new DataSource().showTables();
	}
	

}
