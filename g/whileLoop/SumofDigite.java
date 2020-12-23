package g.whileLoop;

import java.util.Scanner;

public class SumofDigite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
         
        while(temp>0)
        {
        	int lastDigite = temp%10;
        	temp /= 10;
        	sum += lastDigite;
        }
        
        System.out.println("tha sum of "+n+" is "+sum);
	}

}
