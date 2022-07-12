package Polymorphism;

public class Method_over_loading {
     // this is the method over loading (polymorphism)
	public static void main(String[] args) {
	  Method_over_loading mk=new Method_over_loading();
	  mk.add();
	  mk.add(10, 30);
	  mk.add(20, 40, 60);

	}

	public void add() {
		int a=20;
		int b=30;
		int sum = a+b;
		System.out.println("sum of a and b is "  + sum );
	}
	public void add(int a, int b) {
		int sum = a+b;
		System.out.println("sum of a and b is "  + sum );
	}
	public void add(int a, int b, int c) {
		int sum=a+b+c;
		System.out.println("the sum of abc " + sum );
	}
	
	
}
