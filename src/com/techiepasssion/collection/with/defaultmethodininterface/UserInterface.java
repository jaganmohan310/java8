package com.techiepasssion.collection.with.defaultmethodininterface;

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
	
	default String getUserInfo(){
		return getName() + "(" + getAge() +")";
	}
}
