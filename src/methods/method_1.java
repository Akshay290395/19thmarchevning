package methods;

public class method_1 {

	public static void main(String[] args) {
		
		add();                         // calling static method from same class
		
		                               //classname.obj= new classname();
		method_1 ac= new method_1();
		ac.sub();
		
		
		method_2.multiplecation();
		
		 method_2 ab= new method_2();
		 ab.div();
	}

	public static void add() {
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println("addition of a and b = " + c);
	}
	
	public void sub() {
		int a=50;
		int b=70;
		int c=a-b;
		System.out.println("subtraction of a and b is = "+ c);
		
	}
	
}
