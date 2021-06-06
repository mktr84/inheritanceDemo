package inheritanceDemo;

public class Student extends User {

	private String firstName;
	private String lastName;
	private int[] courses;
	private String city;
	private String address;

	public Student() {
		super();
	}

	public Student(int id, String email, String password, String profileImage, String firstName, String lastName,
			int[] courses, String city, String address) {
		super(id, email, password, profileImage);		
		this.firstName = firstName;
		this.lastName = lastName;
		this.courses = courses;
		this.city = city;
		this.address = address;
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

	public int[] getCourses() {
		return courses;
	}

	public void setCourses(int[] courses) {
		this.courses = courses;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
