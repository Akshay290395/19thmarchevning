package collection_study;

import java.util.HashSet;
import java.util.Iterator;

public class hashset_study {

	public static void main(String[] args) {
		HashSet ar = new HashSet();
		
	    ar.add("rohit");
	    ar.add("ravi");
	    ar.add(12);
	    ar.add(61);
	    ar.add(null);
	    ar.add(null);
	    ar.add("rohit");
	    ar.add(true);
	    ar.add(56.45);
	    ar.add(1234);
	    ar.add("swAPNIL");
	    ar.add(77);
	    ar.add(89789);
	    
	    
	    System.out.println(ar);
        System.out.println(ar.size());
        System.out.println(ar.isEmpty());
        System.out.println(ar.contains("rohit"));
        System.out.println(ar.remove(13));
        System.out.println(ar);
        
        //we can't use for loop for hashset class. &  
        //we can't use  list iterator for hashset class.
     
        System.out.println("****************");
        Iterator us = ar.iterator();
        
        while (us.hasNext()) {
        	System.out.println(us.next());
        }
        System.out.println("****************");
        
        //we can't use  list iterator for hashset class.
        
        for(Object po:ar) {
        	System.out.println(po);
        }
        
   
        
        
        
        
        
	}

}
