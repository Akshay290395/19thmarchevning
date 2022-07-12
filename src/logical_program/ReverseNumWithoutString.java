package logical_program;

public class ReverseNumWithoutString {

	public static void main(String[] args) {
		
//		System.out.println(11/2);
//		
//		System.out.println(11%2);
           
		int num=123;
		int rev1=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem = i%10;
			rev1 = rev1*10+rem;
			
			
		}
		System.out.println("orignal number is "+ num);
		
		System.out.println("reverse number is "+ rev1);
}

}
