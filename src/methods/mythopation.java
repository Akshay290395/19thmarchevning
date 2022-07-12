package methods;

public class mythopation {

	public static void main(String[] args) {
	
		mythopation m=new mythopation();
		m.add();
		m.sub();
		m.mul();
		div();
		
		Sample_class nm=new Sample_class();
		nm.add();
		nm.sub();
		
		
	}
    public static void div() {
	 int a=100;
	 int b=200;
	 int div=(b/a);
	 
	 System.out.println("divadation of b/a is" + div);
}
	/*************************************************/
	public void add() {
		int a;
		int b;
		int addition;
		
		
		a=500;
		b=100;
		addition=a+b;
		System.out.println("adddition of and b " + addition );
		}
	/****************************************************/
	public void sub() {
		int a;
		int b;
		int subtraction;
		
		a=500;
		b=300;
		subtraction = a-b;
		System.out.println("subtraction of a-b is " + subtraction );
		
	/********************************************************/
	}
	public void mul() {
	   int a;
	   int b;
	   int mul;
	   
	   a=15;
	   b=20;
	   mul=(a*b);
	   
	   System.out.println("multiplecation of a*b is " + mul);
	   
	}
}
