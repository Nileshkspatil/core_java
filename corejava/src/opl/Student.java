package opl;

public class Student {
	int id;
	String name;
	double per;
	Student(int id, String name, double per){
		this.id=id;
		this.name=name;
		this.per=per;
		System.out.print(id+" :"+name+": "+per);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student(1,"nilesh",95);
		System.out.println();
		Student std1=new Student(2,"nilesh",95);

	}

}
