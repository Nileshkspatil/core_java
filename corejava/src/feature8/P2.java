package feature8;

interface AB{
	void test();
}

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AB ref=new AB (){
			
			public void test() {
				System.out.println("ANonymous inner class");
			}
			
		};
		
		ref.test();
		
		AB ref1=()->System.out.println("inner class");
		ref1.test();

	}

}
