package com.collections;
import java.util.*;
public class HashSet1 {
	public static void main(String[]args)
	{
		
	
	  HashSet<String> set = new HashSet<String>();
	          set.add("Red");
	          set.add("Green");
	          set.add("Black");
	          set.add("White");
	          set.add("Pink");
	          set.add("Yellow");
	          set.add(null);
	          set.add("Red");
	         
	          for(String str:set)
	        	  System.out.println(str);
	}
	
}
