package logical_program;

import java.util.Scanner;

public class End_user_IP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter value A");
		int obj = sc.nextInt();
		
		System.out.println("please enter value B");
		int obj1 = sc.nextInt();	

		
		int sum = obj+obj1;
		System.out.println("sum of the two obj is="+ sum);
	}

}
