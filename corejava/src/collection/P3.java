package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s=new LinkedHashSet<>();
		s.add(1);
		s.add("mona");
		s.add(null);
		s.add('c');
		s.add(1);
		s.add(null);
		System.out.println(s);

		Set tr=new TreeSet();
		tr.add(55);
	//	tr.add('c');
		tr.add(6);
		System.out.println(tr);
	}

}
