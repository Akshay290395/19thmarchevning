 package control_statment;

public class Globle_variable_new {
    int a=30;
    static int b=40;
    
	public static void main(String[] args) {
		
	Globle_variable_new ak= new Globle_variable_new();
	ak.plane();
	plane1();
    System.out.println(" the sum of b is " + b);
    System.out.println("the sum of a is " + ak.a);
    
    Case_study ks = new Case_study();//to call the non-satic method for any other class = classname obj =  new classname();
    
    System.out.println("the sum of g is " + ks.g);  // give the syso("   "  + obj.method name )
    
    System.out.println("the sum of y " + ks.y);// it same for satiac method calling for any other class  
    
    
	}
    public void plane() {
    	int sum = a+200;
    	int sub = b-20;
    	
    }
	public static void plane1() {
		int  sum = b+40;
		
		//int sub = a+.su.
		
	}
	
	
	
}
