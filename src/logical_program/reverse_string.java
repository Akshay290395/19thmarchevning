package logical_program;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string to be reverse");
		
		String org = sc.next();
		
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--) {
			rev= rev+org.charAt(i);
		}
		System.out.println("original string is "+org);
		System.out.println("reverse string is "+rev);
		}

}
