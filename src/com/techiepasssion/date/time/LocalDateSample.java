package com.techiepasssion.date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author jaganmohan_p
 *
 */
public class LocalDateSample {

	public static void main(String[] args) {
		// year/month/date
		LocalDate currentDate = LocalDate.now();
		System.out.print("Current date :" + currentDate + "\n");
		// specifiedDate
		LocalDate specifiedDate = LocalDate.of(2017, 01, 31);
		System.out.print("Specified date :" + specifiedDate + "\n");
		LocalTime currentTime = LocalTime.now();
		System.out.print("currentTime :" + currentTime + "\n");
		LocalTime specifiedTime =LocalTime.of(2, 30, 33);
		System.out.print("specifiedTime :" + specifiedTime + "\n");
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.print("currentDateTime :" + currentDateTime + "\n");
		LocalDateTime specifiedDateTime = LocalDateTime.of(specifiedDate, specifiedTime);
		System.out.print("specifiedDateTime :" + specifiedDateTime + "\n");

	}
}
