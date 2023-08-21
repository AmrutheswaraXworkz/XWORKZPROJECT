package association.example.equals.app;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExampleUtility{
	public static void printThreadInfo() {
		Thread currentThread=Thread.currentThread();
		System.out.println("Thread name:"+currentThread.getName());
		System.out.println("Thread id:"+currentThread.getId());
	}
	
	public static void printSystemProperties() {
		System.out.println("Java Version:"+System.getProperty("java.version"));
		System.out.println("Operating System:"+System.getProperty("os.name"));
	}
	
	public static LocalDate getCurrentDate() {
		return LocalDate.now();
	}
	
	public static LocalDateTime getCurrentDateTime() {
		return LocalDateTime.now();
	}
	
	public static void executeGC() {
		Runtime.getRuntime().gc();
	}
}
