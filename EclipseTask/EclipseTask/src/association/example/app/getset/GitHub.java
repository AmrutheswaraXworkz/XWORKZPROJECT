package association.example.app.getset;

public class GitHub {
	private String username;
	private String email;
	private String fullName;
	private int followers;
	private int following;
	private int repositories;
	private String bio;
	private String location;
	private String website;
	private boolean isVerified;
	private int contributions;
	private int stars;
	private int forks;
	private boolean isPrivateAccount;

	
	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getFullName() {
		return fullName;
	}

	public int getFollowers() {
		return followers;
	}

	public int getFollowing() {
		return following;
	}

	public int getRepositories() {
		return repositories;
	}

	public String getBio() {
		return bio;
	}

	public String getLocation() {
		return location;
	}

	public String getWebsite() {
		return website;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public int getContributions() {
		return contributions;
	}

	public int getStars() {
		return stars;
	}

	public int getForks() {
		return forks;
	}

	public boolean isPrivateAccount() {
		return isPrivateAccount;
	}

	// Setters
	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public void setFollowing(int following) {
		this.following = following;
	}

	public void setRepositories(int repositories) {
		this.repositories = repositories;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setVerified(boolean verified) {
		isVerified = verified;
	}

	public void setContributions(int contributions) {
		this.contributions = contributions;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public void setForks(int forks) {
		this.forks = forks;
	}

	public void setPrivateAccount(boolean privateAccount) {
		isPrivateAccount = privateAccount;
	}
}
