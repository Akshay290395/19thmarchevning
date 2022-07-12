package variablestudy;

public class All_in_one {
	/*************************************/
    public static void adding_methods() {
    	System.out.println("i am in method");
    }
    
    public void non_static_one() {								  //
    	System.out.println("this is one non-static method");
    }
    
    public static void main(String[] args) { 
		
		adding_methods();
		All_in_one obj= new All_in_one();
		obj.non_static_one();
	/***********************************************/	
		String rohit;
		rohit=("MY NAME IS SURAJ");
		System.out.println(rohit);
		
		byte a;
		a=75;
		System.out.println(a);
		
		short b;
		b=1500;
		System.out.println(b);
		
		int c;
		c=1234566;
		System.out.println(c);
		
		long d;
		d=012345666577;
		System.out.println(d);

		float e,h,i;
		e=45;
		h=7;
		i=e/h;
		System.out.println(i);
		
		double f;
		f=123.45652;
		System.out.println(f);
		
		char gread;
		gread='A';
		System.out.println(gread);
		
		boolean G;
		G=true;
	    System.out.println(G);
		
	  // System.out.println("THE NAME OF STUDENT IS " + rohit);
	  //  System.out.println("sutdent all suject mark is as follow " + "marathi mark is " + "=" + a);
	///   System.out.println("sutdent all suject mark is as follow " + "hindi mark is " + "=" + b);
	///   System.out.println("sutdent all suject mark is as follow " + "english mark is " + "=" + a);
	 //   System.out.println("the gread given for the student  " + gread);
	    
	}

}
