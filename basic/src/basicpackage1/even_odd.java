package basicpackage1;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter a number to find the number even and odd");
		int number =scanner.nextInt();
		
		if(number%2==0) {
			System.out.println("given number "+ number +" is even number");
		}
		else {
			System.out.println("given number "+ number +" is odd number");
		}
		
		scanner.close();

	}
}
