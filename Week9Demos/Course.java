
public class Course {
	private String courseName;
	private int numberOfStudents;
	private Student[] students = new Student[40];
	
	public Course() {
	}
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(Student student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
