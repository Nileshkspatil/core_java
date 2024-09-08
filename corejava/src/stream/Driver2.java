package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(12,"nilesh", 56789.98));
		emp.add(new Employee(15,"vaibhav", 25000));
		emp.add(new Employee(18,"nikhil", 16789.98));
		emp.add(new Employee(121,"lilya", 41009.4));
		
		System.out.println(emp);
		
		List<Employee> emp1=emp.stream().filter(p->p.sal>25000).collect(Collectors.toList());
		System.out.println(emp1);
		List<Double> emp2=emp.stream().map(p->p.sal*12).collect(Collectors.toList());
		System.out.println(emp2);
		double sal=emp.stream().map(p->p.sal).collect(Collectors.summingDouble(p->p));
		System.out.println(sal);
		Map<Integer, String> emap=emp.stream().filter(p->p.getEname().startsWith("n")).collect(Collectors.toMap(Employee::getEid, Employee::getEname));
		
		System.out.println(emap);
		
		emap.entrySet().forEach(p->System.out.println(p.getKey()));
	}

}
