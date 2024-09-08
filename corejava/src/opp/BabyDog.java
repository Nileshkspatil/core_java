package opp;

public class BabyDog extends Dog {

	public void weep() {
		System.out.println("weeping");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog bd=new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
	}

}
