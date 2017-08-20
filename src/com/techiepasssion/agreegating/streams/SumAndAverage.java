package com.techiepasssion.agreegating.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import com.techiepasssion.collection.with.defaultmethodininterface.User;

public class SumAndAverage {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("jack", 48));
		userList.add(new User("jagan", 30));
		userList.add(new User("jpaspula", 73));
		int sum = userList.stream().mapToInt( u -> u.getAge()).sum();
		System.out.println("Toatal Ages : "+ sum);
		OptionalDouble dobule =userList.stream().mapToInt(u -> u.getAge()).average();
		if(dobule.isPresent()){
			System.out.println("Average :"  + dobule.getAsDouble());
		}else{
			System.out.println("Average  is not calculated:"  );
		}
		
		
	}
}
