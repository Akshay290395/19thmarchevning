package Polymorphism;

public class MOL_2 {

	public static void main(String[] args) {
		MOL_2 ak= new MOL_2();
		ak.div();
		ak.sum(80, 20);
		ak.sub(100, 200, 300);
	}

     public void div() {
    	 int a= 60;
    	 int b=20;
    	 int div=a/b;
    	 System.out.println("div of a and b is " +  div);
     }
     public void sum(int a,int b) {
    	 int sum=a+b;
    	 System.out.println("sum of a and b is " + sum);
     }
     public void sub (int a, int b ,int c)
     {
    	 int sub = a-b-c;
    	 System.out.println("sub of abc is "  + sub);
     }
	
	
	
	
	
	
	
	
}
