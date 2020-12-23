package e.conditionalStatement;

public class Switch {
	public static void main(String[] args) {
		 
		int dayOfWeek = 4;
		
		switch(dayOfWeek)
		{
		case 1:  case 4:                               //for marge
			System.out.println("i am live");
			break;
			
		case 2:
			System.out.println("i am in office");
			break;
			
		case 3:
			System.out.println("i am playying");
			break;	
			
		default	:
			System.out.println("i dont' no what day it is");
		
		
		}
		
	}

}
