package opl;

public class Employee {
	int id;
	String name;
	double sal;
	Employee(){
		System.out.println("NA");
	}

	Employee(int id){
		this();
		System.out.println(id);
	}
	
	Employee(int id, String name){
		this(id);
		//this.name=name;
		System.out.println(name);
	}
	
	Employee(int id, String name, double sal){
		this(id,name);
	//	this.sal=sal;
		System.out.println(sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ed=new Employee(1,"nilesh",35000);
	}

}
