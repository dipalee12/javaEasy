package f.loops;

import java.util.Scanner;

public class Continu {
	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
		for(int i=0; i<=100; i++) {
			if(i>=40 && i<=50) continue;
			System.out.println(i);
		}
		
	}

}
