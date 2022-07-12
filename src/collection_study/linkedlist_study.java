package collection_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist_study {

	public static void main(String[] args) {
	       
		LinkedList obj = new LinkedList();
        obj.add('a');
        obj.add("rajuu");
        obj.add("rajuu");
        obj.add(12);
        obj.add(56.56);
        obj.add(null);
        obj.add(null);
        
        System.out.println(obj);
        
        System.out.println(obj.get(3));
        System.out.println(obj.indexOf(null));
        System.out.println(obj.lastIndexOf(null));
        
        System.out.println(obj.peek());
        System.out.println(obj.poll());
        System.out.println(obj);
        System.out.println(obj.remove());
        System.out.println(obj);
        
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
        
        
        
        
        
        
	}

}
