package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Age");
		Scanner sc=new Scanner(System.in);
		double age=sc.nextDouble();
		
		if(age<18) {
			try {
				throw new InvalidAgeException("invalid age");
			}catch(InvalidAgeException ex) {
				System.out.println(ex.getMessage());
				//ex.printStackTrace();
			}
		}else {
			System.out.println("Eligible for voting");
		}
			
		
	}

}
