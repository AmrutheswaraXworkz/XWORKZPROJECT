package association.example.app.getset;

public class YouTube {
	private int subscriber = 10000;
	private boolean subscription = true;
	private int views = 1000;
	private int likes = 1500;
	private int dislike = 1000;
	private String channelName = "village cooking channel";
	private String owner = "aschish";
	private boolean good = true;
	private int appSize = 100;
	private String name = "youtube";
	private float apiKey = 123546.01f;
	private int comments = 1000;
	private int watchHour = 3;
	private long downloads = 9000000000L;

	public int getSubscriber() {
		return subscriber;
	}

	public boolean isSubscription() {
		return subscription;
	}

	public int getViews() {
		return views;
	}

	public int getLikes() {
		return likes;
	}

	public int getDislike() {
		return dislike;
	}

	public String getChannelName() {
		return channelName;
	}

	public String getOwner() {
		return owner;
	}

	public boolean getGood() {
		return good;
	}

	public int getAppSize() {
		return appSize;
	}

	public String getName() {
		return name;
	}

	public float getApiKey() {
		return apiKey;
	}

	public int getComments() {
		return comments;
	}

	public int getWatchHour() {
		return watchHour;
	}

	public long getDownloads() {
		return downloads;
	}

	public void setSubscriber(int subscriber) {
		this.subscriber = subscriber;
	}

	public void isSubscription(boolean subscription) {
		this.subscription = subscription;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void setDislike(int dislike) {
		this.dislike = dislike;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;

	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	public void setAppSize(int appSize) {
		this.appSize = appSize;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setApiKey(float apiKey) {
		this.apiKey = apiKey;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public int setWatchHour(int watchHour) {
		return watchHour;
	}

	public long setDownloads(long downloads) {
		return downloads;
	}

}
