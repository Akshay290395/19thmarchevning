package control_statment;

public class Switch_statment {

	public static void main(String[] args) {
		// 1- you are in 1st year of engineering 
		// 2- you are in 2st year of engineering 
		// 3- you are in 3st year of engineering 
		// 4- you are in 4st year of engineering 
		
		// plz enter the year in between 1 to 4 year
		
		int year= 1;
		
		switch (year) {
		case 1: {System.out.println("you are in 1st year of engineering ");}
		break;
		
		case 2: {System.out.println("you are in 2st year of engineering ");}
		break;
		
		case 3: {System.out.println("you are in 3st year of engineering ");}
		break;
		
		case 4: {System.out.println("you are in 4st year of engineering ");}
		break;
			
			
		
		default:{System.out.println("In-valid year plz Enter the year in between 1 to 4 year");}
		
		}
		
		
		
		
	}

}
