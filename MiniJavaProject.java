package assingment;

import java.util.Scanner;

public class MiniJavaProject {
	
	public static void main(String[] args) {
		// Mini Project
		
		  Scanner sc = new Scanner(System.in);
			int myNumber = (int)(Math.random()*100);
			int userNumber = 0;
			
			do {
				System.out.println("Guess My number (1-100 : ");
				userNumber = sc.nextInt();
				
				if(userNumber == myNumber) {
					System.out.println("WOHOO ... CORRECT ANSWER!!!");
					break;
				}
				else if(userNumber > myNumber) {
					System.out.println("Your number is large, try little small number");
				}
				else {
					System.out.println("Your number is small, try little large number");
				}
			} while(userNumber >= 0);
		
		System.out.print("My number was : ");
		System.out.println(myNumber);
	}
}
