package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> m=new HashMap<>();
		
		m.put(1, "math");
		m.put(2, "chem");
		m.put(3, "English");
		m.put(4, "physics");
		//m.clear();
		System.out.println(m);
		
		Set set =m.entrySet();
		
		System.out.println(set);
		
		for(Object obj: set) {
			System.out.println(obj);
		}
	}

}
