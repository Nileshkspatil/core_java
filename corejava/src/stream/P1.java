package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> a=Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println(a);
		
		List<Integer> l=a.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(l);
		
		List<Integer> l1=a.stream().filter(p->p%2==0).map(x->x*x*x).collect(Collectors.toList());
		System.out.println(l1);
		
		int res=a.stream().filter(p->p%2!=0).collect(Collectors.summingInt(x->x));
		System.out.println(res);
		
		List<String> s=Arrays.asList("nilya","monya","harshal");
		
		boolean b=s.stream().anyMatch(s1->s1.startsWith("n"));
		System.out.println(b);
		
		boolean b1=a.stream().allMatch(X->X>0);
		System.out.println(b1);
		
		Map m=new HashMap();
		m.put("math", 90);
		m.put("physic", 30);
		System.out.println(m);
		
		Set set =m.entrySet();
		
		
		

	}

}
