package com.LoginSystem.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.LoginSystem.Model.Insert;
import com.LoginSystem.Model.User;

/**
 * Servlet implementation class InsertController
 */
@WebServlet("/add")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roll = request.getParameter("roll");
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String city = request.getParameter("city");
		User obj = new User();
		obj.setRoll(roll);
		obj.setUser(user);
		obj.setPass(pass);
		obj.setCity(city);
		Insert ins = new Insert();
		try {
			ins.setData(obj);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("index.jsp");
	}

}
