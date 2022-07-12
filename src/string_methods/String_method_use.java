package string_methods;

public class String_method_use {

	public static void main(String[] args) {
		String name = "Ramchandra";
		System.out.println(name.length());
		
		// too use in future purpose so this obj. is created
		int length = name.length();
		System.out.println(length);
		
		System.out.println("*******************");
		
		// too create upper case
		System.out.println(name.toUpperCase());
		
		String k = name.toUpperCase();
	    System.out.println(k); 
	    
	    System.out.println("*******************");
	    
	    // TOO create lover case 
	    System.out.println(name.toLowerCase());
	    
	    String p= name.toLowerCase();
	    System.out.println(p);
	    
	    System.out.println("*******************");
	    
	    //**one more to create lower case 
	    System.out.println(k.toLowerCase());
	    
	    String o = k.toLowerCase();
	    System.out.println(k.toLowerCase());
	    
	    System.out.println("*******************");
	    
	   
	    //too create  equals method 
	    String a= "velocity";
	    String b= "velocity"; 
	    String c= new String("velocity");
	    String d = new String ("velocity");
	    String e=new String ("industry");
	    
	    System.out.println(a==b);// we use == for checking the memory to 2 string 
	    System.out.println(c==d);
	    
	    System.out.println("*******************");
	    
	    System.out.println(a.equals(b));// we use "equals" for checking  the sequence of the to string 
	    System.out.println(b.equals(a));
	    System.out.println(c.equals(d));
	    System.out.println(d.equals(d));
	    System.out.println(a.equals(d));
	    System.out.println(a.equals(e));
	    System.out.println(c.equals(e));
		
	    System.out.println("*******************");
	    
	    //to check equals ignore case
	    String x= "satara";
	    String y="satara";
	    String z="SATARA";
	    
	    System.out.println(x.equals(z));
	    System.out.println(x.equalsIgnoreCase(z));
	    System.out.println(y.equalsIgnoreCase(z));
	    
	    System.out.println("*******************");
	    
	    String R="satara";
		System.out.println(R.contains("sa"));
		System.out.println(R.contains("ra"));
		System.out.println(R.contains("st"));
		
		 System.out.println("*******************");
		 
		 //how to check is empty 
		 String h= "test";
		 String q="";
		 //String r=null;//we can't work on null 
		 
		 System.out.println(h.length());
		System.out.println(q.length());
		//System.out.println(r.length());
		 System.out.println("*******************");
		 
		//how to check charAt
		System.out.println(h.charAt(2));
		
		char sd =h.charAt(1);
		System.out.println(sd);
		System.out.println("*******************");
		
		//how to check endsWith
		String m = "pradip";
		System.out.println(m.endsWith("p"));
		System.out.println(m.endsWith("pr"));
		
		boolean rk =m.endsWith("p");
		System.out.println(rk);
		System.out.println("*******************");
		
		//how to check startsWith
		
		System.out.println(m.startsWith("pr"));
		System.out.println(m.startsWith("ra"));
		System.out.println(m.startsWith("ip"));
		System.out.println("*******************");
		
		// how to check substring
		
		
		
		
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
