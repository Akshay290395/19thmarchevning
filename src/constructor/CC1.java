package constructor;

public class CC1 {
        
	    int a;
		int b;
		
	public CC1() {
		a=100;
		b=200;
	}
	/*************************************/
	public static void main(String[] args) {
		CC1 obj = new CC1();
		obj.add();
	}
   /************************************************/
	public void add() {
	int a=30;
   int b=50;
		int sum = a+b;
		 System.out.println("the sum of a and b is " + sum);
		
	}
	//This new one
	
}
