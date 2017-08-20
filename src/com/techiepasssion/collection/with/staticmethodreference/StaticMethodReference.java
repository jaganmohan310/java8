package com.techiepasssion.collection.with.staticmethodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techiepasssion.collection.with.staticmethodreference.User;

public class StaticMethodReference {
	
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("jack", 48));
		userList.add(new User("jagan", 30));
		userList.add(new User("jpaspula", 73));
		Collections.sort(userList, User :: compareAges);
		userList.stream().forEach(user -> {
			System.out.println(user.getName());
		});
		
	}

}
