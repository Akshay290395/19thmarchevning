package control_statment;

public class Else_if_condition {

	public static void main(String[] args) {
		
		// if mark is >66 than you are in dist.
		//if mark is  60>= and <66 than you are in 1st class
		//if mark is 50>=  and <60  than you in 2ed class
		//if mark is >=40 and <50 you are just pass		
		int mark = 55;
		
		if (mark >66) {
			System.out.println("you are in dist.");
		}
		else if (mark >=60 & mark<66) {
			System.out.println("you are in 1st class");
		}
		else if (mark >=50 & mark<60) {
			System.out.println("you are in 2ed class");}
			
			else if (mark >=40 & mark<50  ) ; 
			{
				System.out.println("you are just pass");
	                }
			//else
	}

}
