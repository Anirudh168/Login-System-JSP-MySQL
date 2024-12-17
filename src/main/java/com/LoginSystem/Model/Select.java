package com.LoginSystem.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.LoginSystem.Dao.Dao;

public class Select {
	public List<User> showData() throws ClassNotFoundException, SQLException
	{
		String sql = "select * from student";
		Dao dao = new Dao();
		Connection con = dao.get_Connection();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<User> list = new ArrayList<User>();
		while(rs.next())
		{
			User obj = new User();
			obj.setRoll(rs.getString("roll"));
			obj.setUser(rs.getString("user"));
			obj.setPass(rs.getString("pass"));
			obj.setCity(rs.getString("city"));
			list.add(obj);
		}
		return list;
	}
}
