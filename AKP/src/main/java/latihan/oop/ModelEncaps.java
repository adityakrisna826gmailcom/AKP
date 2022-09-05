package latihan.oop;

public class ModelEncaps {
	
	private String userN;
	private String password;
	
	public ModelEncaps(String userName, String pwd)
	{
		this.userN = userName;
		this.password = pwd;
	}
	public String getUserN() {
		return userN;
	}
	public void setUserN(String userN) {
		this.userN = userN;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
