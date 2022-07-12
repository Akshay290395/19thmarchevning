package Polymorphism;

public class over_loading_3 {
    // over loading by using static method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		over_loading_3.add();
		over_loading_3.div(100, 20);

	}

	public static void add() {
		int a=20;
		int b=10;
		int sum = a+b;
		System.out.println("the sum of a and b is " + sum);
		}
	
	public static void div(int a,int b) {
		int div = a/b;
		System.out.println("the div of a and b is " + div );
		
	}
	
	
	
	
	
	
	
	
	
	
}
