package association.example.app.getset;
public class Cred {
	
	private String companyName;
	private int registeredUsers;
	private boolean offersCreditCard;
	private boolean providesRewards;
	private boolean supportsMultipleBanks;
	private boolean hasMobileApp ;
	private  boolean offersCreditScore;
	private boolean providesBillReminders;
	private int supportedCities;
	private String headquarters;
	private boolean supportsUPIPayments;
	private  boolean offersServices;
	private int numberofCreditCards;
	private boolean hasSecurity;
	
	
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
		this.registeredUsers = registeredUsers;
	}

	public int getNumberofCreditCards() {
		return this.numberofCreditCards;
	}

	public void setNumberofCreditCards(int numberofCreditCards) {
		this.numberofCreditCards=numberofCreditCards;
	}

	public boolean isOffersCreditCard() {
		return this.offersCreditCard;
	}

	public void setOffersCreditCard(boolean offersCreditCard) {
		this.offersCreditCard =offersCreditCard;
	}

	public boolean isSupportsUPIPayments() {
		return this.supportsUPIPayments;
	}

	public void setSupportsUPIPayments(boolean supportsUPIPayments) {
		this.supportsUPIPayments= supportsUPIPayments;
	}
	public boolean isProvidesRewards() {
		return this.providesRewards;
	}

	public void setProvidesRewards(boolean providesRewards) {
		this.providesRewards=providesRewards;
	}
	public boolean isHasMobileApp() {
		return this.hasMobileApp;
	}

	public void setHasMobileApp(boolean hasMobileApp) {
		this.hasMobileApp=hasMobileApp;
	}
	public boolean isOffersServices() {
		return this.offersServices;
	}

	public void setOffersServices(boolean offersServices) {
		this.offersServices=offersServices;
	}
	
	public boolean isOffersCreditScore() {
		return this.offersCreditScore;
	}

	public void setOffersCreditScore(boolean offersCreditScore) {
		this.offersCreditScore=offersCreditScore;
	}
	public boolean isSupportsMultipleBanks() {
		return this.supportsMultipleBanks;
	}

	public void setSupportsMultipleBanks(boolean supportsMultipleBanks) {
		this.supportsMultipleBanks=supportsMultipleBanks;
	}
	public boolean isProvidesBillReminders() {
		return this.providesBillReminders;
	}

	public void setProvidesBillReminders(boolean providesBillReminders) {
		this.providesBillReminders=providesBillReminders;
	}
	public boolean isHasSecurity() {
		return this.hasSecurity;
	}

	public void setHasSecurity(boolean hasSecurity) {
		this.hasSecurity=hasSecurity;
	}

}
