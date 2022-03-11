package com.collections;
import java.util.*;
public class LinkedHashSetex {

	public static void main(String[] args) {
		LinkedHashSet<Integer> value=new LinkedHashSet<Integer>();
		value.add(60);
		value.add(50);
		value.add(40);
		value.add(30);
		value.add(null);
		
		Iterator<Integer> ite=value.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}

	}

}
