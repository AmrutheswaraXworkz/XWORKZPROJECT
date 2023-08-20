package association.example.app.getset;

public class RedBus {
	private String companyName;
	private int registeredUsers ;
	private boolean offersBusTicket;
	private boolean providesSeatSelection;
	private boolean supportsMultipleBus;
	private boolean hasMobileApp;
	private boolean offersBusTracking;
	private boolean providesCancellation;
	private int supportedCities;
	private String headquarters;
	private boolean supportsOnlinePayments;
	private boolean offersAC;
	private int numberofRoutes;
	private boolean providesCustomerSupport;
    
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

	public int getNumberofRoutes() {
		return this.numberofRoutes;
	}

	public void setNumberofRoutes(int numberofRoutes) {
		this.numberofRoutes =numberofRoutes;
	}

	public int getSupportedCities() {
		return this.supportedCities;
	}

	public void setSupportedCities(int supportedCities) {
		this.supportedCities = supportedCities;
	}

	public int getRegisteredUsers() {
		return this.registeredUsers;
	}

	public void setRegisteredUsers(int registeredUsers) {
		this.registeredUsers=registeredUsers;
	}

	public boolean isOffersBusTicket() {
		return this.offersBusTicket;
	}

	public void setOffersBusTicket(boolean offersBusTicket) {
		this.offersBusTicket =offersBusTicket;
	}

	public boolean isSupportsOnlinePayments() {
		return this.supportsOnlinePayments;
	}

	public void setSupportsOnlinePayments(boolean supportsOnlinePayments) {
		this.supportsOnlinePayments=supportsOnlinePayments;
	}
	public boolean isProvidesSeatSelection() {
		return this.providesSeatSelection;
	}

	public void setProvidesSeatSelection(boolean providesSeatSelection) {
		this.providesSeatSelection=providesSeatSelection;
	}
	public boolean isHasMobileApp() {
		return this.hasMobileApp;
	}

	public void setHasMobileApp(boolean hasMobileApp) {
		this.hasMobileApp=hasMobileApp;
	}
	public boolean isOffersBusTracking() {
		return this.offersBusTracking;
	}

	public void setOffersBusTracking(boolean offersBusTracking) {
		this.offersBusTracking=offersBusTracking;
	}
	
	public boolean isOffersAC() {
		return this.offersAC;
	}

	public void setOffersAC(boolean offersAC) {
		this.offersAC=offersAC;
	}
	public boolean isSupportsMultipleBus() {
		return this.supportsMultipleBus;
	}

	public void setSupportsMultipleBus(boolean supportsMultipleBus) {
		this.supportsMultipleBus=supportsMultipleBus;
	}
	public boolean isProvidesCancellation() {
		return this.providesCancellation;
	}

	public void setProvidesCancellation(boolean providesCancellation) {
		this.providesCancellation=providesCancellation;
	}
	public boolean isProvidesCustomerSupport() {
		return this.providesCustomerSupport;
	}

	public void setProvidesCustomerSupport(boolean providesCustomerSupport) {
		this.providesCustomerSupport=providesCustomerSupport;
	}




}
