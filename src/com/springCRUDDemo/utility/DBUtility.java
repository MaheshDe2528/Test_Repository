package com.springCRUDDemo.utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {

	private static Connection conn = null;
	
	public static Connection getConnection()
	{
		if(null != conn)
		{
			return conn;
		}
		else
		{
			try{
				Properties  prop = new Properties ();
				InputStream input = DBUtility.class.getClassLoader().getResourceAsStream("/conf/appsettings");
				if(null != input)
				{
					prop.load(input);
					System.out.println("loading JDBC driver");
					Class.forName(prop.getProperty("DB.JDBC.Driver"));
					String Url = prop.getProperty("DB.url");
					conn = DriverManager.getConnection(Url, prop.getProperty("user.name"), prop.getProperty("user.pwd"));
				}
				
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			catch(FileNotFoundException fnfe)
			{
				fnfe.printStackTrace();
			}
			catch(IOException ie)
			{
				ie.printStackTrace();
			}
		}
		return conn;
	}
}
