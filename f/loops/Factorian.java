package f.loops;

import java.util.Scanner;

public class Factorian {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number for factorian "); 
		int n = sc.nextInt();
		int result = 1;
		
		for(int i=1; i<=n; i++)
		{
			result = result*i;	
		}
		System.out.println("the factorial "+result);
	}

}
