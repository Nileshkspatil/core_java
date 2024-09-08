package feature8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		List<Student1> s=new ArrayList();
		s.add(new Student1(2,"nilesh",29,95));
		s.add(new Student1(1,"monya",32,90.7));
		s.add(new Student1(4,"harshal",18,89));
		System.out.println(s);
		
		
		Collections.sort(s, new AgeComparator());
		System.out.println(s);
		
		Collections.sort(s, new MarksComparator());
		System.out.println(s);

	}

}
