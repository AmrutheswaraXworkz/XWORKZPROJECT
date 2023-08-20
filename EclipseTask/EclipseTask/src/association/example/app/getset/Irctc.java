package association.example.app.getset;
public class Irctc {
	private String companyName;
	private int registeredUsers;
	private boolean offersOnlineTicketBooking;
	private boolean providesEcatering;
	private boolean seatSelection;
	private boolean hasMobileApp;
	private boolean offersTourismPackages;
	private int languagesSupported;
	private boolean providesTravelInsurance;
	private String headquartersLocation;
	private boolean offersSpecialDiscounts;
	private boolean paymentOptions;
	private int numberofTrains;
	private boolean customerSupport;

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getHeadquartersLocation() {
		return this.headquartersLocation;
	}

	public void setHeadquartersLocation(String headquartersLocation) {
		this.headquartersLocation = headquartersLocation;
	}

	public int getLanguagesSupported() {
		return this.languagesSupported;
	}

	public void setLanguagesSupported(int languagesSupported) {
		this.languagesSupported = languagesSupported;
	}

	public int getRegisteredUsers() {
		return this.registeredUsers;
	}

	public void setRegisteredUsers(int registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

	public int getNumberofTrains() {
		return this.numberofTrains;
	}

	public void setnumberofTrains(int numberofTrains) {
		this.numberofTrains = numberofTrains;
	}

	public boolean isOffersOnlineTicketBooking() {
		return this.offersOnlineTicketBooking;
	}

	public void setOffersOnlineTicketBooking(boolean offersOnlineTicketBooking) {
		this.offersOnlineTicketBooking = offersOnlineTicketBooking;
	}

	public boolean isProvidesEcatering() {
		return this.providesEcatering;
	}

	public void setProvidesEcatering(boolean providesEcatering) {
		this.providesEcatering= providesEcatering;
	}
	public boolean isSeatSelection() {
		return this.seatSelection;
	}

	public void setSeatSelection(boolean seatSelection) {
		this.seatSelection=seatSelection;
	}
	public boolean isHasMobileApp() {
		return this.hasMobileApp;
	}

	public void setHasMobileApp(boolean hasMobileApp) {
		this.hasMobileApp=hasMobileApp;
	}
	public boolean isOffersTourismPackages() {
		return this.offersTourismPackages;
	}

	public void setOffersTourismPackages(boolean offersTourismPackages) {
		this.offersTourismPackages=offersTourismPackages;
	}
	public boolean isProvidesTravelInsurance() {
		return this.providesTravelInsurance;
	}

	public void setProvidesTravelInsurance(boolean providesTravelInsurance) {
		this.providesTravelInsurance=providesTravelInsurance;
	}
	public boolean isOffersSpecialDiscounts() {
		return this.offersSpecialDiscounts;
	}

	public void setOffersSpecialDiscounts(boolean offersSpecialDiscounts) {
		this.offersSpecialDiscounts=offersSpecialDiscounts;
	}
	public boolean isPaymentOptions() {
		return this.paymentOptions;
	}

	public void setPaymentOptions(boolean paymentOptions) {
		this.paymentOptions=paymentOptions;
	}
	public boolean isCustomerSupport() {
		return this.customerSupport;
	}

	public void setCustomerSupport(boolean customerSupport) {
		this.customerSupport=customerSupport;
	}
}
