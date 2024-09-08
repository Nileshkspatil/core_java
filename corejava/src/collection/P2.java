package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<>();
		s.add("nilesh");
		s.add("monya");
		s.add("pratik");
		s.add("karan");
		s.add("raja");
		s.add("harshal");
		System.out.println(s);
		System.out.println("======get index==========");
		for(int i=0; i<s.size(); i++) {
			System.out.print(s.get(i)+" ");
		}
		System.out.println();
		System.out.println("=======Iterator===========");
		
		Iterator i=s.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		System.out.println("=========List Iterator======");
		
		ListIterator l=s.listIterator(s.size());
		
		while(l.hasPrevious()) {
			System.out.print(l.previous()+" ");
			
		}
		System.out.println();
		
		for(String obj: s) {
			System.out.print(obj+" ");
			
		}
		System.out.println();
		Collections.sort(s);
		System.out.println(s);
		
		
		

	}

}
