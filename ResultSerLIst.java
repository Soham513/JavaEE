package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSerLIst {
	public static void main(String[] args) throws SQLException {
		
		Connection connnection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/JDBC_Practise","root","root@root");
		Statement statement = connnection.createStatement();
		//statement.executeUpdate("create table Emp_details(Emp_id int(10),Emp_name varchar(10),Emp_salary int(10))");
		//statement.executeUpdate("INSERT INTO Emp_details\r\n"
			//	+ "VALUES (23, 'raju', 125)");
		System.out.println("done");
		ResultSet rs = statement.executeQuery("select * from Emp_details");
		//rs.next();
		//String output = rs.getString("Emp_name");
		//nt op = rs.getInt(1);
		//System.out.println( op +" " + output);
			while(rs.next()) {
				String name = rs.getString("Emp_name");
				System.out.println(name);
			}
			
		
		statement.close();
		connnection.close();
			
	}
}
