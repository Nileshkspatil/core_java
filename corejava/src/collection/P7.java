package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List a=new ArrayList();
		
		a.add(5);
		a.add("hii");
		a.add('c');
		a.add(null);
		a.add(5);
		a.add(null);
		
		System.out.println(a);
		
		//Converting array 
		
		Object [] obj=a.toArray();
		System.out.println(Arrays.toString(obj));
		
		List l=Arrays.asList(obj);
		
		System.out.println(l);
		
		
		
	//Remove duplicate
		
		Set s=new LinkedHashSet(a);
		System.out.println(s);
		
		
		

	}

}
