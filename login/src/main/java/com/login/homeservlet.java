package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.babu.bean;
import com.dao.logindao;

@WebServlet("/home")
public class homeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		{
			String fname =request.getParameter("firstname");
			String lname =request.getParameter("lastname");
			String cour =request.getParameter("course");
			String phone =request.getParameter("phone");
			String email =request.getParameter("email");
			String pas =request.getParameter("pass");
			
			
			bean b= new bean(fname,lname,cour,phone,email,pas);
			
			
			logindao log = new logindao();
			log.fd(b);
			
			RequestDispatcher rd=request.getRequestDispatcher("/log.jsp");
			rd.forward(request, response);
			
		}
		
	}

	

}
