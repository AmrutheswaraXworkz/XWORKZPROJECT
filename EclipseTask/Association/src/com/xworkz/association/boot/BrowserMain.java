package com.xworkz.association.boot;

import com.xworkz.association.app.Internet;
import com.xworkz.association.impl.Browser;
import com.xworkz.association.impl.InternetImpl;

public class BrowserMain {
	public static void main(String[] args) {
		
	
	Internet internet = new InternetImpl();

	Browser browser = new Browser();
	browser.connect();
}
}