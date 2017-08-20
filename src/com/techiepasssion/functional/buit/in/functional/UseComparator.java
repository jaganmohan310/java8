package com.techiepasssion.functional.buit.in.functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("CCC");
		list.add("bbb");
		list.add("EEE");
		list.add("ddd");
		
		//Simple case-sensitive sort operation
		 Collections.sort(list);
		 System.out.println("Simple sort");
		for(String str: list){
		 System.out.println(str);
		}
		/*Collections.sort(list,new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.compareToIgnoreCase(str2);
			}
			
		});*/
		
		Comparator<String> comp =(str1,str2)->{
			return str1.compareToIgnoreCase(str2);
		};
		System.out.println("Sort with comparator");
		Collections.sort(list,comp);
		list.forEach(x -> System.out.println("value :"+x));
	}

}
