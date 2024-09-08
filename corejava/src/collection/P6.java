package collection;

import java.util.HashMap;
import java.util.Set;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap m=new HashMap();
		m.put(1, "monya");
		m.put(2, "nilya");
		m.put("sunny", null);
		m.put(3,true);
		System.out.println(m);
		
		Set s=m.entrySet();
		
		for(Object obj: s) {
			System.out.println(obj);
		}

	}

}
