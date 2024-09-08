package opl;

public class P2 {
	static String college="sardar patel";
	String name;
	double rollNo;
	
	public P2(String name,double rollNo) {
		this.name=name;
		this.rollNo=rollNo;
		//System.out.println(name);
		//System.out.println(rollNo);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name:"+name+" :: RollNO:"+rollNo+" college:"+college;
	}
	public static void main(String[] args) {
		 P2 ref=new P2("nilesh",101);
		 System.out.println(ref);
		
		 P2 ref2=new P2("monish", 102);
		 System.out.println(ref2);
		 System.out.println(college);
		 
	}

}
