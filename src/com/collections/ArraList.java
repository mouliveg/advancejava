package com.collections;
import java.util.*;
public class ArraList {

	public static void main(String[] args) {
    ArrayList<Integer> array=new ArrayList<Integer>();
     array.add(20);
     array.add(30);
     array.add(20);
     array.add(50);
     array.add(60);
     array.add(2, 90);//it will add number into index 2
     
     System.out.println("Before sorting..");
     for(Integer i:array)
     
    	 System.out.println(i);
     
     Iterator it=array.iterator();
   /*  while(it.hasNext())
     {
    	 System.out.println(it.next());
     }*/
    // System.out.println("After sorting..");
   // Collections.sort(array);//for sorting
     System.out.println("After Descinding order");
     Collections.sort(array,Collections.reverseOrder());
    for(Integer i:array)
    
    	System.out.println(i);
    

	}

}
