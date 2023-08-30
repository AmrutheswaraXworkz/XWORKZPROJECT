package association.example.app.inheritance.browser;

import association.example.app.inheritance.brand.Brand;

public class Browser extends Brand {
public String browserUsedFor;
double brandOriginYear=1995.00;
	public static void main(String[] args) {
		Browser b=new Browser();
		System.out.println(b.brandOriginYear);
	}
	public void browser() {
		System.out.println("Browser used for fetching the data");
	}
}
