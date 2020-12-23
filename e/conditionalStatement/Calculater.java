package e.conditionalStatement;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter first value");
        int a = sc.nextInt();
        System.out.println("enter second value");
        int b = sc.nextInt();
        System.out.println("enter the opretion");
        sc.nextLine();
        char opretion = sc.nextLine().charAt(0);
        
        int result = 0;
        
        switch(opretion)
        {
        case '+':
        	result=a+b;
        	break;
        case '-':
        	result=a-b;
        	break;
        case '*':
        	result=a*b;
        	break;
        case '/':
        	result=a/b;
        	break;
        case '%':
        	result=a%b;
        	break;
        default:
        	System.out.println("invalid");
        }
         System.out.println("the result "+ result);
	}

}
