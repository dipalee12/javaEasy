package f.loops;

import java.util.Scanner;

public class Patten4 {

	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i+1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
