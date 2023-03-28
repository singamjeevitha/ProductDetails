package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDetails
		{
        Connection con=null;
		Statement s=null;
		PreparedStatement ps=null;
		
		public static String url="jdbc:mysql://localhost:3306/jdbc";
		public static String username="root";
		public static String password="admin";

		    public void creating()
			{
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					con=DriverManager.getConnection(url,username,password);
					
					s=con.createStatement();
					
					s.executeUpdate("create table product(productname varchar(200), productprice varchar(50)"
							+ "productcode int,modelnumber varchar(100),productcategory varchar(1000),productdescription varchar(1000))");
					
					
				} 
				 catch (ClassNotFoundException e)
				{
						e.printStackTrace();
					}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				finally
				{
					 try 
					 {
				       if(s!=null)
						{
						s.close();
						}
						if(con!=null)
						{
						con.close();
						}
						
					} 
					 catch (SQLException e) 
					 {
						e.printStackTrace();
					}
						
				}
		}


		public void inserting(String pname,String pprice,int pcode,String mnumber,String pcategory,String pdescription) throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url,username,password);
			
			ps=con.prepareStatement("insert into product(productname,productprice,productcode,modelnumber,productcategory,productdescription) values(?,?,?,?,?,?)");
			ps.setString(1, pname);
			ps.setString(2, pprice);
			ps.setInt(3, pcode);
			ps.setString(4,mnumber);
			ps.setString(5, pcategory);
			ps.setString(6, pdescription);
			
			ps.executeUpdate();
			
			ps.close();
			con.close();
			
			}


	}


