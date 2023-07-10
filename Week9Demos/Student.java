
public class Student {
	private String name;
	private int studentNumber;
	
	public Student() {
	}
	
	public Student(String name, int studentNumber) {
		this.name = name;
		this.studentNumber = studentNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
}
