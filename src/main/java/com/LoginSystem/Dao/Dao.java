package com.LoginSystem.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Dao {
	public Connection get_Connection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ani";
		String user = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url,user,pass);
		return con;
		
	}
}
