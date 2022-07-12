package string_methods;

public class String_methid_2 {

	public static void main(String[] args) {
		// to check length method -------------> o/p in int
		String a= "rajesh";
		System.out.println(a.length());
		
		int obj =a.length();
		System.out.println(obj);
		System.out.println("************************");
		// too create upper case
		
		System.out.println(a.toUpperCase());
		
		String obj1= a.toUpperCase();
		System.out.println(obj1);
		System.out.println("************************");
		
		 // TOO create lover case
		System.out.println(obj1.toLowerCase());
		
		String obj2=obj1.toLowerCase();
		System.out.println(obj2);
		
		System.out.println("************************");
		
		//too create  equals method 
	    String x= "mashuk";
	    String y= "mashuk"; 
	    String z= new String("mashuk");
	    String s = new String ("mashuk");
	    String t=new String ("mashuk");
	    
	    System.out.println(x==y);
	    System.out.println("************************");
	   System.out.println(x.equals(s));
	   System.out.println("************************");
	   
	    //to check equals ignore case
	    String g= "satara";
	    String u="satara";
	    String o="SATARA";
	    
	    System.out.println(g.equals(u));
	    System.out.println(g.equalsIgnoreCase(u));
	    System.out.println(u.equals(o));
	    
	    System.out.println("************************");
	    // too check contains 
	    String R="satara";
		System.out.println(R.contains("sa"));
		System.out.println(R.contains("ra"));
		System.out.println(R.contains("st"));

		System.out.println("************************");
		
		//how to check is empty 
		 String h= "test";
		 String q=" ";
		 String r=null;//we cant work on null 
		 
		 System.out.println(h.length());
		System.out.println(q.length());
		//System.out.println(r.length());
		
		System.out.println("************************");
		
		// too check charAt
		String p= "pune";
		System.out.println(p.charAt(2));
		System.out.println(p.charAt(1));
		
		char abc =p.charAt(2);
		System.out.println(abc);
		System.out.println("************************");
		
		//too check endsWith 
		System.out.println(p.endsWith("une"));
		
		boolean rr = p.endsWith("e");
		System.out.println(rr);
		System.out.println("************************");
		
		//too check startsWith
		
		System.out.println(p.startsWith("p"));
		System.out.println(p.startsWith("pu"));
		System.out.println(p.startsWith("ne"));
		
		System.out.println("************************");
		
		//check check substring
		String w="laxmikant thombre";
		
		System.out.println(w.substring(1,12));
		System.out.println("************************");
		
		//too check concat
		String abc1 = "katraj +";
		String abc2 = " pune";
		System.out.println(abc1.concat(abc2));
		System.out.println("************************");
		
		//too check indexOf 
		String ab="velocity";
		System.out.println(ab.indexOf("y"));
		System.out.println(ab.indexOf("i"));
		
	    String op= "satara";
	    System.out.println(op.indexOf("a",3));
		System.out.println("************************");
		
		//too check lastIndexOf
		System.out.println(ab.lastIndexOf("c"));
		
		//too check replace
		System.out.println(ab.replace("ve", "rc"));
		
	
		
		
		
		
		
		
		
		
		
	

	}

}
