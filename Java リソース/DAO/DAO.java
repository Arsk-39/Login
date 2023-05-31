package DAO;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	public class DAO1 {
		static DataSource ds;
		
			public Connection getConnection() throws Exception{
				if (ds==null) {
					InitialContext ic=new InitialContext();
					ds=(DataSource)ic.lookup("java:/comp/env/jdbc/login_db");
				}
				return ds.getConnection();
			}
		}

}
