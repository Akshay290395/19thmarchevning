package control_statment;



public class Gread_switch_statment {

	public static void main(String[] args) {
		// A this is in 1st class
		// B this is in 2st class
        // C this is in 3st class
		// D this is in 4st class
		// plz enter the class between the A to B
	
		char grade= 'a' ;
		
		switch (grade) {
		case 'a': {System.out.println("this is in 1st class");}
		break;
			
		case 'b': {System.out.println("this is in 2st class");}
		break;
			
		case 'c': {System.out.println("this is in 3st class");}
		break;
			
		case 'd': {System.out.println("this is in 4st class");}
		break;
		
		default: {System.out.println("plz enter the class between the A to B");}
		}
		

		

	}

}
