package inheritanceDemo;

public class UserManager {

	private User user;

	public UserManager() {
		System.out.println("Kullanýcý Yüklendi");
	}

	public UserManager(User user) {
		this.user = user;
		System.out.println("Kullanýcý Yüklendi :" + user.getEmail());
	}

	public void Save() {
		System.out.println("Kullanýcý Bilgileri Kayýt Edildi." + this.user.getEmail());
	}

	public void Save(User user) {
		System.out.println("Kullanýcý Bilgileri Kayýt Edildi." + user.getEmail());
	}
}
