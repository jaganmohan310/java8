package com.techiepasssion.functional.interfaces;

public class FunctionInterfaceWithArgumentsMain {

	public static void main(String[] args) {
		SimpleInterfaceWithArguments simple = (v1,V2)->{
			int result =v1*V2;
			System.out.println("***************" + result);
			int result1 =v1+V2;
			System.out.println("***************" + result1);
		};
		simple.doSomeThing(10,20);
	}
}
