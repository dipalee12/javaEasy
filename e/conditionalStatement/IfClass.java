package e.conditionalStatement;
import java.util.Scanner;

public class IfClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age ");
		int age = sc.nextInt();
		
		if(age>18)
		{
			System.out.println("you can vote now");
		}
		

		

	}

}
