package inheritanceDemo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] courses = { 1, 2, 3 };
		Student student = new Student(1, "student1@kodlama.io", "testpass", "resim1.jpg", "Murat", "KO�", courses,
				"�stanbul", "T�rkiye");

		StudentManager studentManager = new StudentManager(student);

		studentManager.addStudent();

		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setEmail("instructor1@kodlama.io");
		instructor.setDescription("E�itmen Biyografi");
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setPassword("testpass");
		instructor.setProfileImage("instructor1.jpg");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor);

	}

}
