package inheritanceDemo;

public class Instructor extends User {

	private String firstName;
	private String lastName;
	private String Description;

	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instructor(int id, String email, String password, String profileImage, String firstName, String lastName,
			String description) {
		super(id, email, password, profileImage);
		this.firstName = firstName;
		this.lastName = lastName;
		Description = description;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
