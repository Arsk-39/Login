package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import been.login;

public class DAOlogin extends DAO {
	
	public login search(String userid, String password)throws Exception{
		login login =null;
		
		Connection con = getConnection();
		PreparedStatement st;
		st = con.prepareStatement("SELECT * FROM login WHERE userid = ? and password= ?");
		
		st.setString(1, userid);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {
			login = new login();
			login.setId(rs.getInt("userid"));
			login.setName(rs.getString("name"));
			login.setPassword(rs.getString("password"));
		}
		
		st.close();
		con.close();
		return login;
	}

}
