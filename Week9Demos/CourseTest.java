
public class CourseTest {

	public static void main(String[] args) {
		Course c1 = new Course("PROG8580");
		c1.addStudent(new Student("Tony", 10001));
		c1.addStudent(new Student("Ari", 10002));
		c1.addStudent(new Student("Steph", 10003));
		c1.addStudent(new Student("James", 10004));
		
		Student[] classlist = c1.getStudents();
		
		for(int i = 0; i < c1.getNumberOfStudents(); i++) {
			System.out.println(classlist[i].getStudentNumber() + 
					" " + classlist[i].getName());
		}
		
		System.out.println("End of program");
	}

}
