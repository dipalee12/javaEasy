package h.array;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no. of student: ");
		int n =sc.nextInt();
		
		int marks[] = new int[n+1];
		System.out.println("enter the marks now ");
		
		for(int i=1; i<=n; i++)
		{
			marks[i] = sc.nextInt();
		}
		
		int averageMarks = 0;
		for(int i=0; i<=n; i++)
		{
			averageMarks += marks[i];
		}
		averageMarks /= n;
		System.out.println(" the avarege marks is: "+averageMarks);

	}

}
