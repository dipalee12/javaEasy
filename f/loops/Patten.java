package f.loops;

import java.util.Scanner;

public class Patten {

	public static void main(String[] args) {
	   

		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int j=1; j<=n; j++) {
		for(int i=1; i<=n; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
	}

}
