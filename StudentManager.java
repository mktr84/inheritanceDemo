package inheritanceDemo;

public class StudentManager extends UserManager {

	private Student student;

	public StudentManager() {
		super();
	}

	public StudentManager(Student student) {
		super(student);
		this.student = student;
	}

	public Student getStudent() {
		return this.student;
	}

	public void addStudent() {
		Save();
		System.out.println(
				"Öğrenci Bilgileri Kayıt Edildi. " + this.student.getFirstName() + "-" + this.student.getLastName());
	}

	public void addStudent(Student student) {
		Save(student);
		System.out.println("Öğrenci Bilgileri Kayıt Edildi. " + student.getFirstName() + "-" + student.getLastName());
	}
}
