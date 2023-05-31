package been;

import java.io.Serializable;

public class login implements Serializable{
	
	private int userid;
	private String name;
	private String password;
	
	public int getId() {
		return userid;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
	public void setId(int id) {
		this.userid=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPassword(String password) {
		this.password=password;
	}

}
