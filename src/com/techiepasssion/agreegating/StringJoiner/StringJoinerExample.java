package com.techiepasssion.agreegating.StringJoiner;

import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class StringJoinerExample {
	
	public static void main(String[] args) {
		//Stringjoi
		StringJoiner stringJoiner = new StringJoiner(",", "{", "}");
		stringJoiner.setEmptyValue("empty value");
		System.out.println("stringJoiner :" + stringJoiner);
		stringJoiner.add("jack").add("jagan").add("jpaspula");
		System.out.println("stringJoiner add:" + stringJoiner);
		StringJoiner stringJoiner2 = new StringJoiner(",");
		stringJoiner2.add("mohan");
		stringJoiner.merge(stringJoiner2);
		System.out.println("stringJoiner merge:" + stringJoiner);
		StringJoiner stringJoiner3 = new StringJoiner(" and ");
		Set<String> set = new HashSet<>();
		set.add("Hyderabad");
		set.add("Banagalore");
		set.add("Mumabai");
		set.forEach(s -> stringJoiner3.add(s));
		System.out.println("stringJoiner3 " + stringJoiner3);
		
	}

}
