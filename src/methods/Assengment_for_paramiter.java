package methods;

public class Assengment_for_paramiter {

	public static void main(String[] args) {
		
		Assengment_for_paramiter obj= new Assengment_for_paramiter();
		
	    System.out.println("==============================================");
	     
	   	obj.ass(20+30, 6000/200, 25-15, 25*75);
	 	 System.out.println("==============================================");
		 
         obj.ass(200+100, 500/100, 1000-500, 600*300);
         System.out.println("==============================================");
         
	}
 public void ass(int sum , float div, int sub , int mul ) 
 {
	 
	 
	 
	 System.out.println("sum of  a and b is " + sum);
	 System.out.println("divadetion of c and d is " + div);
	 System.out.println("subtraction id f and g "+ sub);
	 System.out.println("multiplication of l and k is " + mul);
 }
}
