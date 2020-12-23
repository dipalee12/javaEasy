package d.userInput;

import java.util.Scanner;

public class UserInput {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("your principal");
		int principal=sc.nextInt();
		
		System.out.println("your rate");
		float rate=sc.nextFloat();
		
		System.out.println("your time");
		int year=sc.nextInt();
		 
		float simpleInteres=principal*rate*year/100;
		
		System.out.println("your simple interest is "+simpleInteres);
				
				
		
		
		
	}

}
