package e.conditionalStatement;



public class NestedIfelse {

	public static void main(String[] args) {
		int a = 100, b = 200, c = 30, result;
		
//		if (a>b)
//		{
//			if (a>c)
//			{
//				result=a;
//			}
//			else
//			{
//				result=c;
//			}
//		}
//		else
//		{
//			if (b>c)
//			{
//				result=b;
//			}
//			else
//			{
//				result=c;
//			}
//		}
		
	result = a>b ? a>c ? a : c : b>c ? b : c ;	
		
   System.out.println("the bigest number is "+result);
	}

}
