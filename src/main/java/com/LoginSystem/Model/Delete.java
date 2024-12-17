package com.LoginSystem.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.LoginSystem.Dao.Dao;

public class Delete {
	public void removeData(String roll) throws ClassNotFoundException, SQLException
	{
		Dao dao = new Dao();
		Connection con = dao.get_Connection();
		String sql = "delete from student where roll=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, roll);
		ps.executeUpdate();
	}
}
