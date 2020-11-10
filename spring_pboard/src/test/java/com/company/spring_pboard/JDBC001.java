package com.company.spring_pboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class JDBC001 {
	
	@Test
	public void jdbc() throws ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db0?useSSL=false", "root", "1234");
			if(conn!=null) {System.out.println("SPRING005-JDBC 연동성공");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
