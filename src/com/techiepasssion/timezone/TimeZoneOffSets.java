package com.techiepasssion.timezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;

public class TimeZoneOffSets {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
	    LocalDateTime localDateTime	= LocalDateTime.now();
	    System.out.println(dtf.format(localDateTime));
	    
	    ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+0"));
	    System.out.println(dtf.format(gmt));
	    
	    ZonedDateTime ny = ZonedDateTime.now(ZoneId.of("America/New_York"));
	    System.out.println(dtf.format(ny));
	    
	    Set<String> zones =ZoneId.getAvailableZoneIds();
	    
	    zones.forEach(z -> System.out.println(z));
	    
	}
}
