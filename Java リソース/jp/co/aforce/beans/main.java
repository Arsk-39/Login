package jp.co.aforce.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
	public main(String[] args) {
	      Connection con = null;
	       try {
	         con = DriverManager.getConnection("jdbc:mysql://localhost/login_db", "root", "Seiuti2010");
	         Statement st = con.createStatement();
	         String sql = "select * from users;";
	         ResultSet result = st.executeQuery(sql);
	 
	         while(result.next()) {
	           int id = result.getInt("user_id");
	           String name = result.getString("name");
	           System.out.println("id: " + id);
	           System.out.println("name: " + name);
	         }
	         if(con != null) {
		           con.close();
		         }
	       } catch (SQLException ex) {
	         System.out.println("接続に失敗しました。");
	       }
	}
}
