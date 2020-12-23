package h.array;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter row: ");
		int row = sc.nextInt();
		System.out.println("enter colaum: ");
		int col = sc.nextInt();
		
		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		
		System.out.println("enter fist matrix: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter second matrix: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		int c[][]= new int[row][col];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("result of tow array addition: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		

	}

}
