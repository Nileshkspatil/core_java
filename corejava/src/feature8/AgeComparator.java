package feature8;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Student1 s1=(Student1)o1;
		Student1 s2=(Student1)o2;
		
		if(s1.age>s2.age) {
			return 1;
		}else if(s1.age<s2.age){
			return -1;
		}else {
		
			return 0;
		
		}
		
		
		
	}

}
