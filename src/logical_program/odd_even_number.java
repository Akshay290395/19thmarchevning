package logical_program;

import java.util.Scanner;

public class odd_even_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("please enter the value");
			
			int a =sc.nextInt();
			
			if (a%2==0) {
				System.out.println("The number is even");
			}
			else {
				System.out.println("The number is odd");
			}
		}
}


