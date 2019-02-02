package com.uit.conn;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class OracleConnUtils {
	public static Connection getOracleConnection()
	           throws ClassNotFoundException, SQLException {
	        
	       String hostName = "localhost";
	       String sid = "JavaDeploy";
	       String userName = "root";
	       String password = "12345";
	  
	       return getOracleConnection(hostName, sid, userName, password);
	   }
	  
	   public static Connection getOracleConnection(String hostName, String sid,
	           String userName, String password) throws ClassNotFoundException,
	           SQLException {
	   
	       Class.forName("oracle.jdbc.driver.OracleDriver");
	  
	       String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
	  
	       Connection conn = (Connection) DriverManager.getConnection(connectionURL, userName,password);
	       return conn;
	   }
}
