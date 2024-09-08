package feature8;

interface I1{
	void show();
	default void demo() {
		System.out.println("inside inteface");
	}
}

public class C1 implements I1{

	@Override
	public void show() {
		System.out.println("class C1");
		
	}
	
}
