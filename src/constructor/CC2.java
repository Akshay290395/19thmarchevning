package constructor;

public class CC2 {
	int a;
	int b;
	
	public CC2() {
		a=20;
		b=60;
		
	}

	public CC2 (int x) {
		a=x;
	}
	public CC2 (int x,int y) {
		a=x;
		b=y;
		
		
	}
	public static void main(String[] args) {

              CC2 obj = new CC2();
              obj.add();
              
              CC2 MS = new CC2(500);
              MS.add();
              
              CC2 ab= new CC2(60, 70);
              ab.add();
              
  	}

	public void add() {
		int sum=a+b;
		System.out.println("sum of a and b " + sum);
	}
}
