package com.techiepasssion.format.date.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class FormatLocalDate {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("Date and Time format :" + dtf.format(localDateTime));

		DateTimeFormatter dtf_Long = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println("Date and Time format Long :" + dtf_Long.format(localDateTime));

		DateTimeFormatter dtf_short = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("Date and Time format dtf_short :" + dtf_short.format(localDateTime));

		String fr_short = dtf_short.withLocale(Locale.FRENCH).format(localDateTime);
		String fr_Long = dtf_short.withLocale(Locale.FRENCH).format(localDateTime);
		System.out.println("fr_short :" + fr_short);
		System.out.println("fr_Long :" + fr_Long);

		DateTimeFormatterBuilder dtf_formatter = new DateTimeFormatterBuilder().appendValue(ChronoField.MONTH_OF_YEAR)
				.appendLiteral("||").appendValue(ChronoField.DAY_OF_MONTH).appendLiteral("||")
				.appendValue(ChronoField.YEAR);
		DateTimeFormatter dtff = dtf_formatter.toFormatter();
		System.out.println("custom date formater " + dtff.format(localDateTime));

	}

}
