package association.example.app.getset;
public class Netflix {
	private String name;
	private int year;
	private double subscriptionFee;
	private int noOfSubscribers;
	private int noOfOriginal;
	private boolean downloads;
	private boolean multipleProfiles;
	private String headQuarter;
	private boolean recommendations;
	private boolean freeTrial;
	private int noOfLang;
	private boolean userReview;
	private String contentQuality;
	private String category;
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
    public int getYear() {
    	return this.year;
    }
    public void setYear(int year) {
    	this.year=year;
    }
	public double getSubscriptionFee() {
		return this.subscriptionFee;
	}
	public void setSubscriptionFee(double subscriptionFee) {
		this.subscriptionFee = subscriptionFee;
	}
	public int getNoOfSubscribers() {
		return this.noOfSubscribers;
	}
	public void setNoOfSubscribers(int noOfSubscribers) {
		this.noOfSubscribers=noOfSubscribers;
		
	}
	public int getNoOfOriginal() {
		return this.noOfOriginal;
	}
	public void setNoOfOriginal(int noOfOriginal) {
		this.noOfOriginal=noOfOriginal;
	}
	public boolean isDownloads() {
		return this.downloads;
	}
	public void setDownloads(boolean downloads) {
		this.downloads=downloads;
	}
	public boolean  isMultipleProfiles() {
		return this.multipleProfiles;
	}
	public void setMultipleProfiles(boolean multipleProfiles) {
		this.multipleProfiles=multipleProfiles;
	}
	public String getHeadQuarter() {
		return this.headQuarter;
	}
	public void setHeadQuarter(String headQuarter) {
		this.headQuarter=headQuarter;
	}
	public boolean  isRecommendations() {
		return this.recommendations;
	}
	public void setRecommendations(boolean recommendations) {
		this.recommendations=recommendations;
	}
	public boolean  isFreeTrial() {
		return this.freeTrial;
	}
	public void setFreeTrial(boolean freeTrial) {
		this.freeTrial=freeTrial;
	}
	public int getNoOfLang() {
		return this.noOfLang;
	}
	public void setNoOfLang(int noOfLang) {
		this.noOfLang=noOfLang;
	}
	public boolean  isUserReview() {
		return this.userReview;
	}
	public void setUserReview(boolean userReview) {
		this.userReview=userReview;
	}
	public String getContentQuality() {
		return this.contentQuality;
	}
	public void setContentQuality(String contentQuality) {
		this.contentQuality=contentQuality;
	}
	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	
	

}
