package com.techiepasssion.collection.with.parallel.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.techiepasssion.collection.with.staticmethodininterface.User;
import com.techiepasssion.collection.with.staticmethodininterface.UserInterface;

public class ParallelStream {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("jack", 48));
		userList.add(new User("jagan", 30));
		userList.add(new User("jpaspula", 73));
		Predicate<User> pred = (user) -> user.getAge() > 65;
		displayUsers(userList, pred);
			
	}
	
	public static void displayUsers(List<User> userList,Predicate<User> predicate){
		userList.parallelStream().filter(predicate).forEach(user -> System.out.println(UserInterface.getUserInfo(user)));
	}
}
