
public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		setAge(age);
	}

	public void setAge(int age) {
		if (age < 0 || age > 120) {
			throw new InvalidAgeException("age must be between 0 and 120");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}
