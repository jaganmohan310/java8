package com.techiepasssion.functional.buit.in.functional.predictae;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredictaeWithLambda {
	
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("jack", 38));
		userList.add(new User("jagan", 30));
		userList.add(new User("jpaspula", 73));
		
		Predicate<User> predOlder = (user) -> user.getAge()>=65;
		Predicate<User> predYounger = (user) -> user.getAge()<=40;
		displayUsers(userList, predYounger);
	}
	
	public static void displayUsers(List<User> userList,Predicate<User> predicate){
		userList.forEach(user -> {
			if(predicate.test(user)) {
			System.out.println(user.getName());	
			}
		});
		
	}

}
