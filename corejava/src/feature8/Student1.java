package feature8;

public class Student1 {
	
	int rollNo;
	String name;
	int age;
	double marks;
	public Student1(int rollNo, String name, int age, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

}
