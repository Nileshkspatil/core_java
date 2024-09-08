package feature8;

import java.util.Arrays;
import java.util.List;

interface I3{
	void add(int a, int b);
}

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		I3 ref=(a,b)->{
			System.out.print("the addition is: ");
			System.out.println(a+b);
		};
		ref.add(5, 10);
		
		ref.add(10, 23);
		
		List<Integer> l=Arrays.asList(12,34,56,45,32,67);
		l.forEach(i->System.out.println(i));
	}

}
