package com.techiepasssion.collection.with.instancemethodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techiepasssion.collection.with.instancemethodreference.User;

public class InsatanceMethodReference {

	public static void main(String[] args) {
		InsatanceMethodReference instance = new InsatanceMethodReference();
		instance.sortData();
	
	}
	public void sortData(){
		
	List<User> userList = new ArrayList<>();
	userList.add(new User("jack", 48));
	userList.add(new User("jagan", 30));
	userList.add(new User("jpaspula", 73));
	Collections.sort(userList, this :: compareAges);
	userList.forEach(user -> System.out.println(user.getAge()));
	}
	
	public  int compareAges(User user1,User user2){
		Integer age1= user1.getAge();
		return age1.compareTo(user2.getAge());
	}
}
