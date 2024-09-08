package multiThreading;

public class P2 extends Thread {
	
	P2(String s){
		super(s);

		}
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P2 ref=new P2("nilya");
		ref.start();
		P2 ref1=new P2("monya");
		ref1.start();
		

	}

}
