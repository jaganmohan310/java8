package com.techiepasssion.functional.buit.in.functional.predictae;

public class User {

	private String name;
	private int age;
	
	public User(String name,int age){
		this.name =name;
		this.age =age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return this.name + "(" + this.age + ")";
		
	}
}
