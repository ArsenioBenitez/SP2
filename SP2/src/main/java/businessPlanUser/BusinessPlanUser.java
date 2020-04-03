package businessPlanUser;

public class BusinessPlanUser {
//this is the class for the users of our system	
	
	String name;
	String password;
	String department;
	boolean is_admin;
	
	public BusinessPlanUser(String name,String password,String department,boolean is_admin)
	{
		this.name = name;
		this.password = password;
		this.department= department;
		this.is_admin = is_admin;
	}
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public boolean isIs_admin() {
		return is_admin;
	}
	public void setIs_admin(boolean is_admin) {
		this.is_admin = is_admin;
	}
	
	
}
