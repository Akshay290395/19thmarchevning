package methods;

public class New_paramiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	New_paramiter obj = new New_paramiter();
	
	obj.add(10+20, 12*10, 50-30, 50);
	
	obj.add(1000, 2500, 125, 1520.123f);
	
	}

	
	public void add(int a, int b,int c, float d) 
	
	{
	System.out.println("======================================");
		System.out.println("addition of a and b is " + (a+b));
		System.out.println("multipecation of a and c " + (a*c));
		System.out.println("sub of c and d " + (c-d) );
		System.out.println("the valu of d is "  + d);
	System.out.println("*****************************************");	
	}
	
	
	
}
