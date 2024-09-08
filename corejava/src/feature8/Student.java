package feature8;

public class Student implements Comparable{
	int rollNo;
	String name;
	int age;
	double marks;
	public Student(int rollNo, String name, int age, double marks) {
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
	//@Override
/*	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student)o;
		
		if(s.age>this.marks) {
			return 1;
		}else if(s.age<this.marks) {
			return -1;
		}else
			return 0;
		
	}*/
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		
		
		return name.compareToIgnoreCase(s.name);
	}
	
	
	
	

}
