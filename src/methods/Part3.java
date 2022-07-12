package methods;

public class Part3 {
           
	public static void myMethod() {
		System.out.println("hii this is my method ");
	}
	
	public static void method()
	{System.out.println("hii this is method 1");
		
	}
	
	public void panishment() {
		System.out.println("how is this is going worng ");
		
	}
	public static void main(String[] args) {
        System.out.println("program by the akshay");
		myMethod();
		method();
		Part4.display();
		Part4.calculation();
		Non_static_method obj = new Non_static_method();
		obj.paint();
		New_part rsr = new New_part();
		rsr.display();
		
		Part3 we=new Part3 ();
		we.panishment();
		
		
	}

}
