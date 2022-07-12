package control_statment;

public class Globle_variable {
 int a =20;
 static int b=30;
 
	public static void main(String[] args) {
		
		Globle_variable obj = new Globle_variable();
		obj.test();
		test1();
		System.out.println(" the sum of " + obj.a);
        System.out.println("the sub of is " + b );
      
        //to call non-static global variable form any other class
        
        Test_class rs =  new Test_class();
        System.out.println("to call non-static variable form any other claSS " + rs.p);
        System.out.println("to call static method for defrent  class " +rs.q);
        
        int j=500+obj.a;
        System.out.println("sum of j is nothing but " + j);
         int r=850+ b ; 
         System.out.println("sun of r is nothing but "+ r);
	}

	public void test() {
	    int sum = a+10;
	    int sub = b-20;}
	
	public static void test1() {
		int sub = b-30;
	}
	
}
