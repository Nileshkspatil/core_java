package opp;

import opl.P2;

public class Polymer1 extends Polymer {
	public  void demo() {
		System.out.println("polymer1");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymer P =new Polymer1();
		P.demo();
		// Polymer1 p2=(Polymer1)P;
		// P2.demo();
		
		Polymer p1 =new Polymer();
		p1.demo();
	}

}
