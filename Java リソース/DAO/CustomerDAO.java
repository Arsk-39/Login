package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.LoginServlet;

public class CustomerDAO extends DAO{
	public LoginServlet search(String userid,String password)
	throws Exception{
		LoginServlet login=null;
		
		Connection con=getConnection();
		
		PreparedStatement st;
		st=con.prepareStatement(
				"select * from customer where userid=? and password=? ");
		st.setString(1, userid);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			login=new LoginServlet();
			
		}
		
		st.close();
		con.close();
		return login;
	}


}
