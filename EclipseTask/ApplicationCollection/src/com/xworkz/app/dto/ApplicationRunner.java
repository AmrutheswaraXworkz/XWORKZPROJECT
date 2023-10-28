package com.xworkz.app.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ApplicationRunner {

	public static void main(String[] args) {

		ApplicationDto dto = new ApplicationDto("Instagram", "Insta2.O", "Instagram", LocalDate.of(2012, 10, 22), 4.5);
		ApplicationDto dto1 = new ApplicationDto("Facebook", "Face 16.3", "Facebook", LocalDate.of(2011, 6, 22), 4.7);
		ApplicationDto dto2 = new ApplicationDto("Youtube", "you2023", "Youtube", LocalDate.of(2010, 7, 12), 4.3);
		ApplicationDto dto3 = new ApplicationDto("Twitter", "X2023", "Twitter", LocalDate.of(2002, 10, 04), 4.2);
		ApplicationDto dto4 = new ApplicationDto("Snapchat", "snap23", "Snapchat", LocalDate.of(2016, 9, 22), 4.6);

		Collection<ApplicationDto> appl = new ArrayList<ApplicationDto>();
		appl.add(dto);
		appl.add(dto1);
		appl.add(dto2);
		appl.add(dto3);
		appl.add(dto4);
		System.out.println("Printing using collections");
		Iterator<ApplicationDto> itr = appl.iterator();
		while (itr.hasNext()) {
			ApplicationDto application = itr.next();
			System.out.println(application.getName());
		}

	}
}
