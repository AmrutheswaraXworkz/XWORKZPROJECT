package association.example.app;

public class Company {
	public String companyName;
	public String companyCeo;
	public String companyCountry;

	public Company(String companyName, String companyCeo, String companyCountry) {
		this.companyName = companyName;
		this.companyCeo = companyCeo;
		this.companyCountry = companyCountry;
	}

	public void companyMethod() {
		System.out.println("name of the company is:" + this.companyName);
		System.out.println("name of the ceo is:" + this.companyCeo);
		System.out.println("name of the country is:" + this.companyCountry);
	}

}
