package org.aikopo;
import java.io.*;
import java.sql.*;
import java.sql.CallableStatement;


public class DBController {
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String userid="c##madang";
	String pwd="1234";
	
	
	Connection con;
	
	public DBController()
	{
		try { /* 드라이버를 찾는 과정 */ 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			System.out.println ("드라이버 로드 성공"); 
		} catch(ClassNotFoundException e) { 
			e.printStackTrace(); 
		}
	}
	public boolean startConnection() {
        boolean ret = false;
        try {
            System.out.println("데이터베이스 연결 준비 ...");
            con = DriverManager.getConnection(url, userid, pwd);
            System.out.println("데이터베이스 연결 성공");
            ret = true;
        } catch (SQLException e) {
            e.printStackTrace();
            ret = false;
        }
        return ret;
    }
	
	public void ExetQry(String sql)
	{
		try 
		{
			Statement stmt = con.createStatement();
			stmt.execute(sql);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
