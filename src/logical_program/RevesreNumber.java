package logical_program;

import loop.For_loop;

public class RevesreNumber {

	public static void main(String[] args) 
	{
		int num = 456;
		String strnum = Integer.toString(num);
		String rev="";
		
		for(int i=strnum.length()-1;i>=0;i--) {
			rev=rev+strnum.charAt(i);//6,65,654
		}
       int revnum = Integer.parseInt(rev);
         System.out.println("original no. is " + num);
         System.out.println("reverse number is "+ rev);
	}

	
	

}
