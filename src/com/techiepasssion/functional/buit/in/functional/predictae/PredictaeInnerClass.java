package com.techiepasssion.functional.buit.in.functional.predictae;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredictaeInnerClass {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("jack", 38));
		userList.add(new User("jagan", 30));
		userList.add(new User("jpaspula", 73));
		Predicate<User> pred = new Predicate<User>() {
			@Override
			public boolean test(User user) {
				return user.getAge()>=65;
			}
		};
		
		userList.forEach(user -> {
			if(pred.test(user))
			{
			System.out.println(user.getName());
			}
		});
	}
	
	
	
}
