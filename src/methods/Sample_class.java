package methods;

public class Sample_class {

	public static void main(String[] args) {
		Sample_class obj = new Sample_class();
		obj.add();
		obj.sub();
	}

	public void add() {
		int a=123;
		int b=456;
	
		int add;
		add = a+b;
		System.out.println("addition of a+b is " + add);
	}
	
	public void sub() {
		
		int a=4568;
		int b= 45123;
		
	    int sub=(a+b);
	    
	    System.out.println("subtraction of a+b is " + sub);   
	    	}
}
