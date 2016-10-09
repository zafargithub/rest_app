package com.stayoh.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	private static final String DRIVER_CLASS = "";
	private static final String USERNAME = "";
	private static final String URL = "";
	private static final String PASSWORD = "";
	private static final String TEST = "";
	
	static{
		try{
			Class.forName(DRIVER_CLASS);
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		Connection con = null;
		try{
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		return con; 
	}
	
	public static void closeDbResources(Connection con, PreparedStatement pstmt, ResultSet rs){
		try{
			if(con != null){
				con.close();
				con = null;
			}
			if(pstmt != null){
				pstmt.close();
				pstmt = null;
			}
			if(rs != null){
				rs.close();
				rs = null;
			}
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
}
