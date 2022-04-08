package builder.resolved;

public class User {

	//mandatory parameters
	String username;
	String password;
	String email;
	
	// optional
	String address;
	String phoneNo;
	String birthday;
	
	
	public User(Userbuilder ub) {
		super();
		this.username = ub.username;
		this.password = ub.password;
		this.email = ub.email;
		this.address = ub.address;
		this.phoneNo = ub.phoneNo;
		this.birthday = ub.birthday;
	}
	
	
	public static class Userbuilder {
		//mandatory parameters
		String username;
		String password;
		String email;
		
		// optional
		String address;
		String phoneNo;
		String birthday;
		
		Userbuilder(String username, String password, String email) {
			this.username = username;
			this.password = password;
			this.email = email;
		}
		
		Userbuilder address(String address) {
			this.address = address;
			return this;
		}
		
		Userbuilder phoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
			return this;
		}
		
		Userbuilder birthday(String birthday) {
			this.birthday = birthday;
			return this;
		}
		
		public User build() { 
			User user = new User(this);
			return user;
		}
	}
	
}
