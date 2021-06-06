package inheritanceDemo;

public class User {
	private int id;
	private String email;
	private String password;
	private String profileImage;
	
	public User() {		
	}
	public User(int id, String email, String password, String profileImage) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.profileImage = profileImage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
}
