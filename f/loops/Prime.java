package f.loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime=true;
		 
		for(int i=2; i<n; i++)// here i*i<=n also recommended ,time complexity less 1/2
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(n<=1) isPrime=false;
		
		System.out.println(" this number is prime or not = "+isPrime );

	}

}
