package association.example.app.getset;
public class Linkedin {
	
	private String companyName;
	private int registeredUsers;
	private boolean offersNetworking;
	private boolean jobSearching;
	private  boolean providesLearning ;
	private  boolean profileCreation;
	private boolean hasMobileApp;
	private boolean offersPremium;
	private  int languagesSupported;
	private String headquarters;
	private boolean supportsSharing;
	private boolean providesCompany;
	private int numberofIndustries;
	private boolean hasResumeBuilder;
	
	
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

	public int getNumberofIndustries() {
		return this.numberofIndustries;
	}

	public void setNumberofIndustries(int numberofIndustries) {
		this.numberofIndustries= numberofIndustries;
	}

	public boolean isOffersNetworking() {
		return this.offersNetworking;
	}

	public void setOffersNetworking(boolean offersNetworking) {
		this.offersNetworking =offersNetworking;
	}

	public boolean isJobSearching() {
		return this.jobSearching;
	}

	public void setJobSearching(boolean jobSearching) {
		this.jobSearching= jobSearching;
	}
	public boolean isProvidesLearning() {
		return this.providesLearning;
	}

	public void setProvidesLearning(boolean providesLearning) {
		this.providesLearning=providesLearning;
	}
	public boolean isHasMobileApp() {
		return this.hasMobileApp;
	}

	public void setHasMobileApp(boolean hasMobileApp) {
		this.hasMobileApp=hasMobileApp;
	}
	public boolean isProfileCreation() {
		return this.profileCreation;
	}

	public void setProfileCreation(boolean profileCreation) {
		this.profileCreation=profileCreation;
	}
	
	public boolean isOffersPremium() {
		return this.offersPremium;
	}

	public void setOffersPremium(boolean offersPremium) {
		this.offersPremium=offersPremium;
	}
	public boolean isSupportsSharing() {
		return this.supportsSharing;
	}

	public void setSupportsSharing(boolean supportsSharing) {
		this.supportsSharing=supportsSharing;
	}
	public boolean isProvidesCompany() {
		return this.providesCompany;
	}

	public void setProvidesCompany(boolean providesCompany) {
		this.providesCompany=providesCompany;
	}
	public boolean isHasResumeBuilder() {
		return this.hasResumeBuilder;
	}

	public void setHasResumeBuilder(boolean hasResumeBuilder) {
		this.hasResumeBuilder=hasResumeBuilder;
	}

}
