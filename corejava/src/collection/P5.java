package collection;

import java.util.Iterator;
import java.util.Stack;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s=new Stack();
		s.push(90);
		s.push("nilesh");
		s.push(null);
		System.out.println(s);
		
		Iterator i=s.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }

	}

}
