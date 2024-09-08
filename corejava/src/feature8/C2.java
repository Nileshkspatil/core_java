package feature8;

public class C2 {
	
	private C2() {
		
	}
	static C2 ref= new C2();
	
	public static C2 getRef() {
		return ref;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 ref1=C2.getRef();
		System.out.println(ref1);
		
		C2 ref2 =C2.getRef();
		System.out.println(ref2);
		
//		C2 ref3=new C2();
//		System.out.println(ref3);

	}

}
