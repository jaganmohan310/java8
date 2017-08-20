package com.techiepasssion.functional.buit.in.functional;

public class UseRunnable {
	
public static void main(String[] args) {
	
	/*Runnable r1 = new Runnable() {
		@Override
		public void run() {
			System.out.println("Running Thread 1");
			
		}
	};
	
	Runnable r2 = new Runnable() {
		@Override
		public void run() {
			System.out.println("Running Thread 2");
		}
	};*/
	
	Runnable r1 = () ->{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Running Thread 1"); };
	Runnable r2 = () ->{System.out.println("Running Thread 2"); };
	new Thread(r1).start();
	new Thread(r2).start();
}

}
