package exception;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=23;
		
		try {
			
			i=i/0;
			System.out.println("hii");
		}catch(ArithmeticException ex) {
			
			System.out.println(i);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("hii");
	}

}
