package com.dao;

import com.babu.bean;


import java.sql.*;

public class logindao 
{
			
			
   public void fd(bean f) 
   
  {
	   
	   String fistname= f.getName();
	   String lastname= f.getLname();
	   String course = f.getCour();
	   String phone = f.getPhone();
	   String Email = f.getEmail();
	   String password = f.getPas();
	   
	   
	   
	    String url= "jdbc:mysql://localhost:3306/mysql";
		String uname= "root";
		String pass= "tiger";
		String query= "insert into register(fistname,lastname,course,phone,Email,password) values(?,?,?,?,?,?)";
	   
	    try 
	    {
	    Class.forName("com.mysql.jdbc.Driver");
	    java.sql.Connection con = DriverManager.getConnection(url,uname,pass);
	    PreparedStatement ps= con.prepareStatement(query);
	  
	    
	    ps.setString(1, fistname);
	    ps.setString(2, lastname);
	    ps.setString(3,  course);
	    ps.setString(4, phone);
	    ps.setString(5, Email);
	    ps.setString(6, password);
	    
	    ps.executeUpdate();
	    
	    }
	    
	  catch(Exception e)
	    {
		  e.printStackTrace();
	    }
  } 
}
