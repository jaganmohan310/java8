package com.techiepasssion.functional.interfaces;

public class FunctionInterfaceWithOutArgumentsMain {

	public static void main(String[] args) {
		SimpleInterfaceWithOutArguments simpleWithOut = () -> System.out.println("*do Something*");
		simpleWithOut.doSomeThing();
	}
}
