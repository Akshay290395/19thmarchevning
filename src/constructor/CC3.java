package constructor;

public class CC3 {
     int a;
    int b;
     
     public CC3() {
    	 a=10;
    	 b=20;
    	 
     }


	
	public static void main(String[] args) {
		CC3 obj = new CC3();
		obj.add();
	}

	public void add() {
		//int a=50;
		//int b=60;
		int sum=a+b;
		System.out.println("sum of a and b is " + sum );
	}
}
