package inheritanceDemo;

public class InstructorManager extends UserManager {

	private Instructor instructor;

	public InstructorManager() {
		super();
	}

	public InstructorManager(Instructor instructor) {
		super(instructor);
		this.instructor = instructor;
	}

	public Instructor getStudent() {
		return this.instructor;
	}

	public void addInstructor() {
		Save();
		System.out.println("Eðitmen Bilgileri Kayýt Edildi. " + this.instructor.getFirstName() + "-"
				+ this.instructor.getLastName());
	}

	public void addInstructor(Instructor instructor) {
		Save(instructor);
		System.out.println(
				"Eðitmen Bilgileri Kayýt Edildi. " + instructor.getFirstName() + "-" + instructor.getLastName());
	}

}
