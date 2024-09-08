package opp;

interface Amaze{
	public static void demo() {
		System.out.println("hiiiiiiiiiiiiii");
	}
	void login();
}

class Amazone implements Amaze{

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login done successfully");
	}
	
}


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======interface==========");
		
		Amaze a=new Amazone();
		a.login();
		Amaze.demo();
		
		Amazone az = new Amazone();
		az.login();
		
		System.out.println("==================Encapsulation=====================");
		Atm am=new Atm();
		am.setMoney(98000);
		System.out.println(am.getMoney());
		am.withdrawMoney();
		System.out.println("============Abstraction======================");
		
		Honda ref=new Honda();
		ref.changeGear();
		ref.run();
		ref.stop();
		Bike b=new Honda();
		b.changeGear();
		b.run();
		
		Honda h=(Honda)b;
		h.stop();
		h.changeGear();
		h.run();
	
	}

}
