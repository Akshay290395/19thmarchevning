package constructor;

public class CC5 {

	int a;
	int b;
	int c;
	int d;
	
	public CC5 () {
		a=236;
		b=120;
		
	}
	public CC5 (int x) {
		
		a=x;
		System.out.println(x);
		
	}
	public CC5 (int x,int y) {
		a=x;
		b=y;
		c=a+b;
		d=a-b;
		System.out.println(c);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		CC5 CS= new CC5(750);
        CC5 MI= new CC5(150,250);  
	  
	}

	//public void add() {
		//int sum=a+b;
	//	System.out.println("the sum of a and b is " + sum);
	//}
	
	
}

