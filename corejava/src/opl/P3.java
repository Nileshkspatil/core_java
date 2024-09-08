package opl;

	public class P3 {
		static int k=20;
		String name="nilesh";
		double no=101;
		int i=10;
		
		public void data() {
			String name="monish";
			System.out.println(this.name);
			System.out.println(k);
		}
		public static void main(String[] args) {
		P3 ref=new P3();
			ref.data();
		
	}
		{
			System.out.println("hiiii");
		}
	
		static {
			System.out.println("welcome");
		}
	}
