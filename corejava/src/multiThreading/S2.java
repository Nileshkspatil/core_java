package multiThreading;

public class S2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		S2 ref=new S2();
		Thread t= new Thread(ref);
		t.start();
		t.getId();
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread task");
		
	}

}
