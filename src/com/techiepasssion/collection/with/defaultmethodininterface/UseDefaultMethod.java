package com.techiepasssion.collection.with.defaultmethodininterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.techiepasssion.collection.with.defaultmethodininterface.User;

public class UseDefaultMethod {
	
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("jack", 48));
		userList.add(new User("jagan", 30));
		userList.add(new User("jpaspula", 73));
		Predicate<User> pred = (user) -> user.getAge() > 65;
		displayUsers(userList, pred);
			
	}
	
	public static void displayUsers(List<User> userList,Predicate<User> predicate){
		userList.forEach(user -> {
			if(predicate.test(user)) {
			System.out.println(user.getUserInfo());	
			}
		});
	}

}
