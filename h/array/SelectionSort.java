package h.array;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
		
		System.out.println(" enter the length of array: ");
		int l = sc.nextInt();
		System.out.print("enter the array : ");
		int a[] = new int[l];
	    int n = a.length;
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}

		for (int i=0; i<n-1; i++)
		{
			int minIndex = i;
			for (int j=i; j<n; j++ )
			{
				if(a[minIndex]>a[j])
				{
					minIndex=j;
				}
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex] = temp;
		}
		System.out.println("the sort array: ");
		for(int item: a)
		{
			System.out.print(item+" ");
		}
	}

}
