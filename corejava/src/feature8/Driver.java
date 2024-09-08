package feature8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> s=new ArrayList();
		s.add(new Student(2,"nilesh",29,95));
		s.add(new Student(1,"monya",20,90.7));
		s.add(new Student(4,"harshal",18,89));
		System.out.println(s);
		
		Collections.sort(s);
		
	
		
		
		System.out.println(s);
		
		for(Object obj: s) {
			System.out.println(obj);
		}
		
		
	}

}
