package constructor;

public class CC6 {
     int a=15;
     int b=20;
     int c=30;
     int d=80;
     
     public CC6 () {System.out.println(a);}
     
     public CC6 (int a,int b) {
    	 System.out.println(a+b);
     }
     
     public CC6 (int a, int b, int c) {
    	 System.out.println(a+b+c);
     }
     
     public CC6(int a, int b , int c , int d) {
    	 System.out.println(a+b+c+d);
     }
	public static void main(String[] args) {
	    CC6 OK = new CC6();
		CC6 PK =new CC6(50, 60);
		PK.add();
		
		CC6 MK =new CC6(10, 20, 30);
		MK.add();
		
		CC6 RK = new CC6(20, 30,40, 50);
		RK.add();
			

	}
	
	public void add() {
		//int sum= a+b+c;
		//System.out.println("SUM OF ");
	}

}
