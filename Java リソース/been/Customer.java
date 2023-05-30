package been;

public class Customer implements java.io.Serializable{
	
	private int id;
	private String name;
	private String password;
	
	public int getId() {
		return id;
	}
	public String getLongin() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setLogin(String name) {
		this.name=name;
	}
	public void setPassword(String password) {
		this.password=password;
	}

}
