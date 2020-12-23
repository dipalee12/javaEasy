package b.operators;

public class BitOperators {          //a+2  a+=2

	public static void main(String[] args) {
		int a=20;
		int b=31;
		int c=a&b;
		int d=a|b;
		System.out.println(c);
		System.out.println(d);
		
		//shift opretion is divide by 2 in right shift,multiplay by 2 in left shift
		
		int e=b>>1; //how many time
		int f=a<<3;//
        System.err.println(e);
		System.out.println(f);
	}

}
