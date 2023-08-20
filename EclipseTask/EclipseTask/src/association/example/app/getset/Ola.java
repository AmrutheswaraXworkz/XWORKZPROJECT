package association.example.app.getset;

public class Ola {
	private String companyName;
	private int registeredDrivers;
	private boolean offersRide ;
	private boolean providesOlaRentals;
	private boolean supportsOutstation;
	private boolean hasMobileApp;
	private boolean offersOlaAuto;
	private boolean providesInCar;
	private int supportedCities;
	private String headquarters;
	private boolean supportsCashlessPayments; 
	private boolean offersLuxuryCar;
	private int typesofVehiclesAvailable;
	private boolean hasEmergency;
	
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getHeadquarters() {
		return this.headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public int getRegisteredDrivers() {
		return this.registeredDrivers;
	}

	public void setRegisteredDrivers(int registeredDrivers) {
		this.registeredDrivers =registeredDrivers;
	}

	public int getSupportedCities() {
		return this.supportedCities;
	}

	public void setSupportedCities(int supportedCities) {
		this.supportedCities = supportedCities;
	}

	public int getTypesofVehiclesAvailable() {
		return this.typesofVehiclesAvailable;
	}

	public void setTypesofVehiclesAvailable(int typesofVehiclesAvailable) {
		this.typesofVehiclesAvailable= typesofVehiclesAvailable;
	}

	public boolean isOffersRide() {
		return this.offersRide;
	}

	public void setOffersRide(boolean offersRide) {
		this.offersRide =offersRide;
	}

	public boolean isSupportsCashlessPayments() {
		return this.supportsCashlessPayments;
	}

	public void setSupportsCashlessPayments(boolean supportsCashlessPayments) {
		this.supportsCashlessPayments=supportsCashlessPayments;
	}
	public boolean isProvidesOlaRentals() {
		return this.providesOlaRentals;
	}

	public void setProvidesOlaRentals(boolean providesOlaRentals) {
		this.providesOlaRentals=providesOlaRentals;
	}
	public boolean isHasMobileApp() {
		return this.hasMobileApp;
	}

	public void setHasMobileApp(boolean hasMobileApp) {
		this.hasMobileApp=hasMobileApp;
	}
	public boolean isOffersLuxuryCar() {
		return this.offersLuxuryCar;
	}

	public void setOffersLuxuryCar(boolean offersLuxuryCar) {
		this.offersLuxuryCar=offersLuxuryCar;
	}
	
	public boolean isOffersOlaAuto() {
		return this.offersOlaAuto;
	}

	public void setOffersOlaAuto(boolean offersOlaAuto) {
		this.offersOlaAuto=offersOlaAuto;
	}
	public boolean isSupportsOutstation() {
		return this.supportsOutstation;
	}

	public void setSupportsOutstation(boolean supportsOutstation) {
		this.supportsOutstation=supportsOutstation;
	}
	public boolean isProvidesInCar() {
		return this.providesInCar;
	}

	public void setProvidesInCar(boolean providesInCar) {
		this.providesInCar=providesInCar;
	}
	public boolean isHasEmergency() {
		return this.hasEmergency;
	}

	public void setHasEmergency(boolean hasEmergency) {
		this.hasEmergency=hasEmergency;
	}

}
