package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class DatabaseConnectivity {

	static String mysqlDriver="com.mysql.jdbc.Driver";
	static String mysqlURL = "jdbc:mysql://localhost:3306/selenium";
	static String username ="root";
	String password="Reema@1994";
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;

	@Test
	public void setDataBaseConnection() throws ClassNotFoundException, SQLException, InterruptedException {
		try {
			Class.forName(mysqlDriver);
			conn = DriverManager.getConnection(mysqlURL, username, password);
			InsertToDB();
			
			
			
			stmt = conn.createStatement();
			//updateQuery();
			//deleteQuery();
			rs = stmt.executeQuery("select * from employee");
			System.out.println(rs);

			while (rs.next()) {
				String code = rs.getString("emp_code");
				System.out.println(code);

				String name = rs.getString("emp_name");
				System.out.println(name);
				
				String desgination = rs.getString("emp_designation");
				System.out.println(desgination);
			}

			conn.close();
		} catch (Exception e) {
			System.out.println("Got an exception!");
			System.out.println(e.getMessage());
		}

	}

	public static void InsertToDB() {
		try {
			
			for(int i=0;i<3;i++){
			// the mysql insert statement
			 String query = "Insert into employee(emp_code,emp_name,emp_designation) values(?,?,?)";
			 
			 /*String query = "INSERT All into employee (emp_code,emp_name,emp_designation) VALUES ('101','Paul Singh','automation')"
			 		+ "into employee (emp_code,emp_name,emp_designation) VALUES ('102','Ken Myer','trainee')"
			 		+ "into employee (emp_code,emp_name,emp_designation) VALUES ('103','Jack Evans','manual')"
			 		+ "into employee (emp_code,emp_name,emp_designation) VALUES ('104','Reed Koch','developer')"
			 		+ "select * from dual";*/
			 		
	
			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setString(1, "101");
			preparedStmt.setString(2, "deepak");
			preparedStmt.setString(3, "automation");
			
			preparedStmt.setString(1, "102");
			preparedStmt.setString(2, "deepaksaini");
			preparedStmt.setString(3, "automation tester");
			
			preparedStmt.setString(1, "103");
			preparedStmt.setString(2, "deepaksaini12345");
			preparedStmt.setString(3, "manual");
			
			preparedStmt.setString(1, "104");
			preparedStmt.setString(2, "saini12345");
			preparedStmt.setString(3, "manual tester");


			// execute the preparedstatement
			  preparedStmt.execute();
			 //stmt.executeUpdate(query);
		}
		} catch (Exception e) {
			System.out.println("Got an exception!");
			System.out.println(e.getMessage());
		}
	}

	// Script to update the data in the Database – Database Testing:

	public static void updateQuery() throws ClassNotFoundException, SQLException {
		String updatequery = "UPDATE employee SET emp_name= 'deepaksaini1234' where emp_code = 1 ";
		stmt.executeUpdate(updatequery);
	}

	// Script to delete the data in the Database – Database Testing:

	public static void deleteQuery() throws SQLException, ClassNotFoundException {
		String query = "DELETE from employee;";
		stmt.executeUpdate(query);
	}
}
