package constructor;

public class CC4 {
  int a=150;
  int b=200;
  int c=500;
  public CC4() {
	 a=50;
	 b=60;
 }
  
  public CC4 (int x) {
	a=x;
}
  public CC4(int x ,int y,int z) {
	  a=x;
	  b=y;
	  c=z;
  }
	public static void main(String[] args) {
		
		CC4 CSK= new CC4();
		CSK.add();
		
		CC4 AB=new CC4(500);
		AB.add();
		
		CC4 MI = new CC4(250, 350,00);
		MI.add();
		
}
		
   public void add() {
	 
	 int sum=a+b+c;
	 System.out.println("sum is" + sum);
 }
	
	
}
