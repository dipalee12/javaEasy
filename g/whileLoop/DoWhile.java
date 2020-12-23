package g.whileLoop;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		do
		{
			n = sc.nextInt();
			System.out.println("no is "+n);
			
		}while(n!=0);

	}

}
