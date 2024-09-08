package exception;

import java.util.Scanner;

public class Finallyblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		try {
			int n=sc.nextInt();
		}finally {
			System.out.println("thank youu!!!!!!!!!!!");
		}

	}

}
