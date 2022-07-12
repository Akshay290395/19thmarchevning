package this_and_super_keyword;

public class Method_1 extends Method_2{
   
	
	int r=20;
	
	
	
	public static void main(String[] args) {
		
     Method_1 obj = new Method_1();
     obj.sum();
     
    
     
	}

	
	public void sum() {
		int r=45;
		int sum = 25+r;
		System.out.println("addition of r and 25 is = " + sum);
		System.out.println("the od sum is "  + r);
		System.out.println("this is globle variable "  + this.r);
		System.out.println("this is globale variable form another class " + super.r); 
	}
	
	
}
