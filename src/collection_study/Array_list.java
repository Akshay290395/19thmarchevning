package collection_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_list {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
	    ar.add("rohit");
	    ar.add("ravi");
	    ar.add(12);
	    ar.add(58);
	    ar.add(null);
	    ar.add(null);
	    ar.add("rohit");
	    ar.add(true);
	    ar.add(56.45);
	    
	    System.out.println(ar);
	    
	    System.out.println(ar.size());
	    System.out.println(ar.indexOf(12));
	    System.out.println(ar.lastIndexOf(null));
	    System.out.println(ar.get(6));
	    System.out.println(ar.isEmpty());
	    System.out.println(ar.remove(1));
	    System.out.println(ar);
	    ar.add("rajuu");
	    ar.set(1,"rajesh");
	    System.out.println(ar);
	    
	  //1.for loop method
	    for(int i=0; i<=ar.size()-1;i++) {
	    	System.out.println(ar.get(i));
	    }
	    
	    System.out.println("****end of for loop*****");
	    
	  //2.iterator method
	    Iterator ite = ar.iterator();
	    while (ite.hasNext())
	    {
	    	System.out.println(ite.next());
	    }
	    
	    System.out.println("****end of for iterator*****");
	    
	    //3.list-iterator method
	   ListIterator ite_2 = ar.listIterator();
	   while(ite_2.hasNext()) {
		   System.out.println(ite_2.next());
	   }
	   
	   System.out.println("****end of for list-iterator*****");
	    
	   //4.for each method
	   for (Object obj:ar) {
		   System.out.println(obj);
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    
	    
		

	}

}
