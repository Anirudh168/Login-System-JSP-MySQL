package com.LoginSystem.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.LoginSystem.Dao.Dao;

public class Update {
	public void editData(User obj) throws ClassNotFoundException, SQLException
	{
		Dao dao = new Dao();
		Connection con = dao.get_Connection();
		String sql = "update student set user=?,pass=?,city=? where roll=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(4, obj.getRoll());
		ps.setString(1, obj.getUser());
		ps.setString(2, obj.getPass());
		ps.setString(3, obj.getCity());
		ps.executeUpdate();
	}
	public User selectData(String roll) throws ClassNotFoundException, SQLException
	{
		Dao dao = new Dao();
		Connection con = dao.get_Connection();
		String sql = "select * from student where roll=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, roll);
		ResultSet rs = ps.executeQuery();
		User obj = new User();
		while(rs.next())
		{
			obj.setRoll(rs.getString("roll"));
			obj.setUser(rs.getString("user"));
			obj.setPass(rs.getString("pass"));
			obj.setCity(rs.getString("city"));
		}
		return obj;
	}
}
