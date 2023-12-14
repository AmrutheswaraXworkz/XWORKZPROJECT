package com.xworkz.exceptions.event;

import java.io.IOException;

import com.xworkz.exception.HolidayException;
import com.xworkz.exception.HolidayRunTimeException;

public class Fest {
	public void dasara() throws IOException {
		System.out.println("Dasara is on monday");
		throw new IOException();

	}

	public void deepavali() throws HolidayException {
		System.out.println("Deepavali is on next month");
		//throw new NullPointerException();
		throw new HolidayException();
	}

}
