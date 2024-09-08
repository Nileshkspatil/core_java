package opp;

public class Mango extends Fruit{
	
	int j=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mango m=new Mango();
		Fruit f=new Mango();//
		//Fruit f=new Fruit();
		Mango m =(Mango)f;
		System.out.println("i: "+f.i);
		System.out.println("j:"+m.j);

	}

}
