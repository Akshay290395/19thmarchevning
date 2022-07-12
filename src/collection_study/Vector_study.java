package collection_study;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_study {

	public static void main(String[] args) {
		
		 Vector obj = new Vector();
		 
        obj.add('a');
        obj.add("rajuu");
        obj.add("rajuu");
        obj.add(12);
        obj.add(56.56);
        obj.add(null);
        obj.add(null);
        obj.add(1234);
	    obj.add("swAPNIL");
	    obj.add(077);
	    obj.add(89789);
        
        
        
        System.out.println(obj);
        
        System.out.println(obj.get(3));
        System.out.println(obj.indexOf(null));
        System.out.println(obj.lastIndexOf(null));
        System.out.println(obj.size());
        System.out.println(obj.capacity());
        System.out.println(obj.contains("rajuu"));
        System.out.println(obj.isEmpty());
        
  
        
        System.out.println("**********************");
        
        Iterator obj_2 = obj.iterator();
        while(obj_2.hasNext()) {
        	System.out.println(obj_2.next());
        }
        System.out.println("**********************");
        ListIterator obj_3 = obj.listIterator();
        while (obj_3.hasNext()) {
        	System.out.println(obj_3.next());
        }
        
        System.out.println("**********************");
       
        for(Object obj_4:obj) {
        	System.out.println(obj_4);
        	 }
        System.out.println("**********************");
        
        for(int i=0 ; i<= obj.size()-1; i++) {
        	System.out.println(obj.get(i));
        }
        
		//enumeration
        System.out.println("**********************");
        Enumeration obj_5 = obj.elements();
        while(obj_5.hasMoreElements()) {
        	System.out.println(obj_5.nextElement());
        }
        System.out.println("**********************");
        Vector obj_6 = new Vector<>();
        obj_6.add(1256);
        obj_6.add("rajesh");
        System.out.println(obj_6);
         System.out.println("***********");
         
         obj.add(obj_6);
         for (int i=1 ; i<=obj.size()-1;i++) {
        	 System.out.println(obj.get(i));
         }
         System.out.println("***********");
		
		
		
		
		
		
		
		
		
		

	}

}
