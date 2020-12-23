package f.loops;

import java.util.Scanner;

public class SeriseSum { //1+1/2+1/3+1/4+......

	public static void main(String[] args) 
//	{
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		float result = 0;
//		for (float i=1; i<=n; i++)
//		{
//			result += 1/i;
//		}
//      System.out.println(result);
//	}
	
	//1-1/2+1/3-1/4+1/5-1/6.......
	
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float a = 0;
		float b = 0;
		float result=0;
		for (float i=1; i<=n; i++)
		{
			if(i%2==0 || i==1) a += 1/i;
			if(i%2!=0) b -= 1/i;
			
			result = a+b;
		}
      System.out.println(result);
	}
	}
	

