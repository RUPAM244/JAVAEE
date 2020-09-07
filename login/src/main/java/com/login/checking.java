package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.regdao;

@WebServlet("/logo")
public class checking extends HttpServlet
{
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
	   String user= request.getParameter("uname");
	   String pass= request.getParameter("psw");
	   
	   
	   regdao dao=new regdao();
       
         if(dao.check(user, pass)) 
         {
        	 HttpSession session=request.getSession();
        	 session.setAttribute("USERS", user);
        	response.sendRedirect("welcome.jsp");
         }
         
         else
         {
        	 response.sendRedirect("log.jsp");
        	 
         }
	}
}
