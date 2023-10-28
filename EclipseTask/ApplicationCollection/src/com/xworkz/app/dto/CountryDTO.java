package com.xworkz.app.dto;

public class CountryDTO {

	private int id;
	private String name;
	private String capitalCity;
	private long population;
	private String independentDate;
	private int noOfStates;
	private String primaryReligion;
	private String nationalAnimal;
	private String nationalBird;
	private String nationalSport;
	private String primeMinister;

	public CountryDTO() {
		System.out.println("running CountryDTO");
	}

	public CountryDTO(int id, String name, String capitalCity, long population, String independentDate, int noOfStates,
			String primaryReligion, String nationalAnimal, String nationalBird, String nationalSport,
			String primeMinister) {
		super();
		this.id = id;
		this.name = name;
		this.capitalCity = capitalCity;
		this.population = population;
		this.independentDate = independentDate;
		this.noOfStates = noOfStates;
		this.primaryReligion = primaryReligion;
		this.nationalAnimal = nationalAnimal;
		this.nationalBird = nationalBird;
		this.nationalSport = nationalSport;
		this.primeMinister = primeMinister;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getIndependentDate() {
		return independentDate;
	}

	public void setIndependentDate(String independentDate) {
		this.independentDate = independentDate;
	}

	public int getNoOfStates() {
		return noOfStates;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	public String getPrimaryReligion() {
		return primaryReligion;
	}

	public void setPrimaryReligion(String primaryReligion) {
		this.primaryReligion = primaryReligion;
	}

	public String getNationalAnimal() {
		return nationalAnimal;
	}

	public void setNationalAnimal(String nationalAnimal) {
		this.nationalAnimal = nationalAnimal;
	}

	public String getNationalBird() {
		return nationalBird;
	}

	public void setNationalBird(String nationalBird) {
		this.nationalBird = nationalBird;
	}

	public String getNationalSport() {
		return nationalSport;
	}

	public void setNationalSport(String nationalSport) {
		this.nationalSport = nationalSport;
	}

	public String getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", name=" + name + ", capitalCity=" + capitalCity + ", population=" + population
				+ ", independentDate=" + independentDate + ", noOfStates=" + noOfStates + ", primaryReligion="
				+ primaryReligion + ", nationalAnimal=" + nationalAnimal + ", nationalBird=" + nationalBird
				+ ", nationalSport=" + nationalSport + ", primeMinister=" + primeMinister + "]";
	}

}
