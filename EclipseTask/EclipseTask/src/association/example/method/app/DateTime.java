package association.example.method.app;

//import java.lang.System;
import java.util.Arrays;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("today is:" + date);

		LocalDate yesterday = date.minusDays(1);
		System.out.println("yesterday is:" + yesterday);

		LocalDate tomorrow = yesterday.plusDays(2);
		System.out.println("tomorrow is:" + tomorrow);

		String str = "2023-10-22";
		LocalDate d1 = LocalDate.parse(str);
		System.out.println("string to local date:" + d1);

		boolean is = date.equals(d1);
		System.out.println("Is same is:" + is);

		System.out.println("=============================");

		Date day = new Date();
		System.out.println(day);

		long milisecond = day.getTime();
		System.out.println("millisecond:" + milisecond);

		Date day1 = day;
		System.out.println(day1.toString());

		Date futureDate = new Date(day.getTime() + 86400000);

		int compare = day.compareTo(futureDate);
		System.out.println(compare);

		boolean isBefore = day.before(futureDate);
		System.out.println(isBefore);

		System.out.println("==============================");

		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("date and time is:" + currentDateTime);

		LocalDateTime futureDateTime = currentDateTime.plusHours(3).plusMinutes(30);
		System.out.println("Future Date and Time: " + futureDateTime);

		LocalDateTime pastDateTime = currentDateTime.minusDays(1).minusHours(5);
		System.out.println("Past Date and Time: " + pastDateTime);

		int year = currentDateTime.getYear();
		int month = currentDateTime.getMonthValue();
		int Day = currentDateTime.getDayOfMonth();
		int hour = currentDateTime.getHour();
		int minute = currentDateTime.getMinute();
		int second = currentDateTime.getSecond();

		System.out.println("Year: " + year);
		System.out.println("Month: " + month);
		System.out.println("Day: " + Day);
		System.out.println("Hour: " + hour);
		System.out.println("Minute: " + minute);
		System.out.println("Second: " + second);

		System.out.println("==================================");

		int[] sourceArray = { 1, 2, 3, 4, 5 };
		int[] destinationArray = new int[5];

		System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
		System.out.println("Destination Array: " + Arrays.toString(destinationArray));

		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("Current Time in milliseconds: " + currentTimeMillis);

		System.out.println("This is standard output.");
		System.err.println("This is standard error.");

		System.out.println("Before exit");
		
		String javaVersion = System.getProperty("java.version");
        String osName = System.getProperty("os.name");

        System.out.println("Java Version: " + javaVersion);
        System.out.println("Operating System: " + osName);
		
		System.out.println("After exit"); // This line will not be executed

		System.out.println(Thread.activeCount());

		System.out.println(Thread.interrupted());

		System.out.println(Thread.currentThread());

		System.out.println(Thread.getDefaultUncaughtExceptionHandler());

		String val="          Google            ";
		
		System.out.println(Thread.holdsLock(val));
		
	}

}
