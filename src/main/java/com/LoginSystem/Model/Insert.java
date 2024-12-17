package com.LoginSystem.Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.LoginSystem.Dao.Dao;

public class Insert {
	public void setData(User obj) throws ClassNotFoundException, SQLException
	{
		Dao dao = new Dao();
		Connection con = dao.get_Connection();
		String sql = "insert into student(roll,user,pass,city) values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, obj.getRoll());
		ps.setString(2, obj.getUser());
		ps.setString(3, obj.getPass());
		ps.setString(4, obj.getCity());
		ps.executeUpdate();
	}
}
