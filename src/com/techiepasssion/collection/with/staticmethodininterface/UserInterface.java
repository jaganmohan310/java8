package com.techiepasssion.collection.with.staticmethodininterface;

public interface UserInterface {

	/**
	 * @return the name
	 */
	public String getName();

	/**
	 * @param name the name to set
	 */
	public void setName(String name);

	/**
	 * @return the age
	 */
	public int getAge();
	/**
	 * @param age the age to set
	 */
	public void setAge(int age);
	
	public static String getUserInfo(User user){
		return user.getName() + "(" + user.getAge() +")";
	}
}
