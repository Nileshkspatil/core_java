package collection;

import java.util.ArrayList;
import java.util.List;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList<>(); 
		l.add(99);
		l.add("nilesh");
		l.add(null);
		l.add('c');
		l.add(null);
		System.out.println(l+":"+l.size());
		
		ArrayList a=new ArrayList<>();
		a.add("biryani");
		a.add(0," muttton");
		System.out.println(a);
		
		l.add(3, a);
		//l.remove(null);
		//a.clear();
		
		System.out.println(l.containsAll(a));
		System.out.println(a.contains("biryani"));
		//System.out.println(l);
			l.clear();
			System.out.println(l);
		
	}

}
