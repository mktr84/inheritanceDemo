package inheritanceDemo;

public class UserManager {

	private User user;

	public UserManager() {
		System.out.println("Kullan�c� Y�klendi");
	}

	public UserManager(User user) {
		this.user = user;
		System.out.println("Kullan�c� Y�klendi :" + user.getEmail());
	}

	public void Save() {
		System.out.println("Kullan�c� Bilgileri Kay�t Edildi." + this.user.getEmail());
	}

	public void Save(User user) {
		System.out.println("Kullan�c� Bilgileri Kay�t Edildi." + user.getEmail());
	}
}
