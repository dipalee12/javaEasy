package g.whileLoop;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int temp = n ;
        int r = 0;
        while(temp>0)
        {
        	int lastDigite=temp%10;
        	temp/=10;
        	r=lastDigite+r*10;
        }
        if (n==r)
        {
        	System.out.println("this number "+n+" is palindro");
        }
        else
        {
        	System.out.println("this number "+n+" is not palindro");
        }
         
	}

}
