//private - same class, another class in same or different with help of setter - getter

package OOPS;

public class StudentDetails {	
	//private variables
	private String name;
	private String username;
	private String password;
	private Long phone;

	//getter-setter for private variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}

	
}