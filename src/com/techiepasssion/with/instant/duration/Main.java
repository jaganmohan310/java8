package com.techiepasssion.with.instant.duration;

import java.time.Duration;
import java.time.Instant;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Instant start = Instant.now();
		Thread.sleep(500);
		Instant end = Instant.now();
		Duration elapsed =Duration.between(start, end);
		System.out.println("elapsed :"+ elapsed.toMillis());
	}
}
