package association.example.app.inheritance.util;

import association.example.app.inheritance.browser.*;

public class BrowserUtil {
	public void browserUtil(Browser browser) {
		Browser browser2 = new Browser();
		browser2.browser();
		
		if(browser instanceof Chrome) {
			Browser browser3 = new Chrome();
//			browser3.browser();
			
			Chrome chrome = (Chrome)browser3;
			chrome.chrome();
		}
		
		if(browser instanceof Firefox) {
			Browser browser4 = new Firefox();
			Firefox firefox = (Firefox)browser4;
			firefox.fireFox();
		}
	}
}
