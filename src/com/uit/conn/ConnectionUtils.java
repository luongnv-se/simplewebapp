package com.uit.conn;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionUtils {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		return MySQLConnUtils.getMySQLConnection();
      //return OracleConnUtils.getOracleConnection();
       
      //return OracleConnUtils.getOracleConnection();
      
      //return SQLServerConnUtils_JTDS.getSQLServerConnection_JTDS();
      // return SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
      // return PostGresConnUtils.getPostGresConnection();
  }
   
  public static void closeQuietly(Connection conn) {
      try {
          conn.close();
      } catch (Exception e) {
      }
  }

  public static void rollbackQuietly(Connection conn) {
      try {
          conn.rollback();
      } catch (Exception e) {
      }
  }
}
