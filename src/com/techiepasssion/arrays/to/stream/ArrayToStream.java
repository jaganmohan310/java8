package com.techiepasssion.arrays.to.stream;

import java.util.Arrays;
import java.util.stream.Stream;

import com.techiepasssion.collection.with.defaultmethodininterface.User;

public class ArrayToStream {

	public static void main(String[] args) {
	
		User[] users = { new User("jack", 48),new User("jagan",30),new User("jpaspula", 73)};
				
		Stream<User> stream1 = Stream.of(users);
		Stream<User> stream2 = Arrays.stream(users);
		stream1.forEach(u -> System.out.println(u.getUserInfo()));
		stream2.forEach(u -> System.out.println(u.getUserInfo()));
		}
	}

