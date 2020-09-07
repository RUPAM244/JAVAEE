package com.dao;

import java.sql.*;

public class regdao 
{ 
         String url= "jdbc:mysql://localhost:3306/mysql";
 		 String uname= "root";
 		 String pa= "tiger";
 		 String query= "select Email,password from register where Email=? and password=? ";
 		 
 		 
 		 public boolean check(String user,String pass)
 	     {
 			 
    	 try
    	 { 
    	   Class.forName("com.mysql.jdbc.Driver");
    	   Connection con=DriverManager.getConnection(url, uname, pa);
    	   PreparedStatement ps=con.prepareStatement(query);
    	   
    	   ps.setString(1, user);
    	   ps.setString(2, pass);
    	   ResultSet rs=ps.executeQuery();
    	   
    	   if(rs.next())
    	   {
    	      return true;
    	   }
    	 }
    	 
    	
    	 catch(Exception e)
 	    {
 		  e.printStackTrace();
 	    }
    	 
    	 return false;
     }
}
