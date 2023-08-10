package association.example.boot.getsetmain;

import association.example.app.getset.Amazon;
import association.example.app.getset.Facebook;
import association.example.app.getset.GitHub;
import association.example.app.getset.Instagram;
import association.example.app.getset.PhonePe;
import association.example.app.getset.SnapChat;
import association.example.app.getset.WhatsApp;
import association.example.app.getset.YouTube;

public class GetSetMain {
	public static void main(String[] args) {
		PhonePe pay = new PhonePe();
		System.out.println(pay.getSize());
		System.out.println(pay.getUserName());
		System.out.println(pay.getUpi());
		System.out.println(pay.getTax());
		System.out.println(pay.isSafe());
		System.out.println(pay.getTxnId());
		System.out.println(pay.getSenderName());
		System.out.println(pay.getReceiverName());
		System.out.println(pay.getTime());
		System.out.println(pay.isFast());
		System.out.println(pay.isCreditCard());
		System.out.println(pay.getAmount());
		System.out.println(pay.getBank());
		System.out.println(pay.getLocation());

		System.out.println("=================================");
		pay.setSize(100);
		pay.setUserName("gagan");
		pay.setUpi("4545454545@ybl");
		pay.setTax(25.5f);
		pay.setSenderName("gagan");
		pay.setReceiverName("amruth");
		pay.setTxnId(54547899);
		pay.setTime(0.5f);
		pay.setAmount(456000);
		pay.setBank("sbi");
		pay.setLocation("davangere");

		System.out.println(pay.getSize());
		System.out.println(pay.getUserName());
		System.out.println(pay.getUpi());
		System.out.println(pay.getTax());
		System.out.println(pay.isSafe());
		System.out.println(pay.getTxnId());
		System.out.println(pay.getSenderName());
		System.out.println(pay.getReceiverName());
		System.out.println(pay.getTime());
		System.out.println(pay.isFast());
		System.out.println(pay.isCreditCard());
		System.out.println(pay.getAmount());
		System.out.println(pay.getBank());
		System.out.println(pay.getLocation());

		System.out.println("=========================");
		YouTube you = new YouTube();
		System.out.println(you.getSubscriber());
		System.out.println(you.isSubscription());
		System.out.println(you.getViews());
		System.out.println(you.getLikes());
		System.out.println(you.getDislike());
		System.out.println(you.getChannelName());
		System.out.println(you.getOwner());
		System.out.println(you.getGood());
		System.out.println(you.getAppSize());
		System.out.println(you.getName());
		System.out.println(you.getApiKey());
		System.out.println(you.getWatchHour());
		System.out.println(you.getDownloads());
		System.out.println(you.getComments());

		System.out.println("+++++++++++++++++++++++");
		you.setSubscriber(12350000);
		you.isSubscription();
		you.setViews(1554546);
		you.setLikes(45454);
		you.setDislike(45454);
		you.setChannelName("hjgH");
		you.setOwner("bbk vines");
		you.setGood(false);
		you.setAppSize(455);
		you.setName("bbvinesss");
		you.setApiKey(5454464644.04f);
		System.out.println("=========================");
		YouTube you1 = new YouTube();
		System.out.println(you1.getSubscriber());
		System.out.println(you1.isSubscription());
		System.out.println(you1.getViews());
		System.out.println(you1.getLikes());
		System.out.println(you1.getDislike());
		System.out.println(you1.getChannelName());
		System.out.println(you1.getOwner());
		System.out.println(you1.getGood());
		System.out.println(you1.getAppSize());
		System.out.println(you1.getName());
		System.out.println(you1.getApiKey());
		System.out.println(you1.getWatchHour());
		System.out.println(you1.getDownloads());
		System.out.println(you.getComments());
		System.out.println("====================");

		Amazon product = new Amazon();

		product.setProductName("Example Product");
		product.setProductId("ABC123");
		product.setPrice(99.99);
		product.setRatings(4);
		product.setCategory("Electronics");
		product.setSeller("Amazon Store");
		product.setAvailable(true);
		product.setNumberOfReviews(500);
		product.setDescription("This is an example product description.");
		product.setImageUrl("https://example.com/product-image.jpg");
		product.setShippingInfo("Ships within 2 business days.");
		product.setPrimeEligible(true);
		product.setBrand("Example Brand");
		product.setColor("Black");

		System.out.println("Product Name: " + product.getProductName());
		System.out.println("Product ID: " + product.getProductId());
		System.out.println("Price: $" + product.getPrice());
		System.out.println("Ratings: " + product.getRatings() + " stars");
		System.out.println("Category: " + product.getCategory());
		System.out.println("Seller: " + product.getSeller());
		System.out.println("Available: " + product.isAvailable());
		System.out.println("Number of Reviews: " + product.getNumberOfReviews());
		System.out.println("Description: " + product.getDescription());
		System.out.println("Image URL: " + product.getImageUrl());
		System.out.println("Shipping Info: " + product.getShippingInfo());
		System.out.println("Prime Eligible: " + product.isPrimeEligible());
		System.out.println("Brand: " + product.getBrand());
		System.out.println("Color: " + product.getColor());

		System.out.println("--------------------------------------");

		Facebook user = new Facebook();

		user.setUsername("john_doe");
		user.setFullName("John Doe");
		user.setAge(28);
		user.setGender("Male");
		user.setStatus("Feeling adventurous!");
		user.setFriendCount(500);
		user.setOnlineStatus(true);
		user.setProfilePictureUrl("https://example.com/john_profile.jpg");
		user.setCurrentCity("New York");
		user.setHometown("Los Angeles");
		user.setRelationshipStatus("Single");
		user.setPhotosCount(150);
		user.setPostCount(300);
		user.setLikesCount(1200);

		System.out.println("Username: " + user.getUsername());
		System.out.println("Full Name: " + user.getFullName());
		System.out.println("Age: " + user.getAge());
		System.out.println("Gender: " + user.getGender());
		System.out.println("Status: " + user.getStatus());
		System.out.println("Friend Count: " + user.getFriendCount());
		System.out.println("Online Status: " + user.isOnlineStatus());
		System.out.println("Profile Picture URL: " + user.getProfilePictureUrl());
		System.out.println("Current City: " + user.getCurrentCity());
		System.out.println("Hometown: " + user.getHometown());
		System.out.println("Relationship Status: " + user.getRelationshipStatus());
		System.out.println("Photos Count: " + user.getPhotosCount());
		System.out.println("Post Count: " + user.getPostCount());
		System.out.println("Likes Count: " + user.getLikesCount());

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

		WhatsApp user1 = new WhatsApp();

		user1.setUsername("john_doe");
		user1.setPhoneNumber("+1234567890");
		user1.setStatus("Hello, I'm using WhatsApp!");
		user1.setAge(25);
		user1.setCountry("USA");
		user1.setProfilePicture("profile.jpg");
		user1.setOnline(true);
		user1.setNotificationsEnabled(true);
		user1.setTotalMessages(1500);
		user1.setTotalContacts(200);
		user1.setBlocked(false);
		user1.setMuted(false);
		user1.setLastSeen("2023-08-10 10:30 AM");
		user1.setAbout("Software Engineer");

		System.out.println("Username: " + user1.getUsername());
		System.out.println("Phone Number: " + user1.getPhoneNumber());
		System.out.println("Status: " + user1.getStatus());
		System.out.println("Age: " + user1.getAge());
		System.out.println("Country: " + user1.getCountry());
		System.out.println("Profile Picture: " + user1.getProfilePicture());
		System.out.println("Online: " + user1.isOnline());
		System.out.println("Notifications Enabled: " + user1.isNotificationsEnabled());
		System.out.println("Total Messages: " + user1.getTotalMessages());
		System.out.println("Total Contacts: " + user1.getTotalContacts());
		System.out.println("Blocked: " + user1.isBlocked());
		System.out.println("Muted: " + user1.isMuted());
		System.out.println("Last Seen: " + user1.getLastSeen());
		System.out.println("About: " + user1.getAbout());

		System.out.println("+++++++++++++++++++++++++++++++++++++++");

		Instagram user11 = new Instagram();

		user11.setUsername("user123");
		user11.setFullName("John Doe");
		user11.setFollowersCount(1000);
		user11.setFollowingCount(500);
		user11.setPostsCount(20);
		user11.setBio("Just a regular person.");
		user11.setWebsite("https://example.com");
		user11.setEmail("john@example.com");
		user11.setPhoneNumber("+123456789");
		user11.setVerified(true);
		user11.setPrivate(false);
		user11.setProfilePictureUrl("https://example.com/profile.jpg");
		user11.setGender("Male");
		user11.setLocation("New York");

		System.out.println("Username: " + user11.getUsername());
		System.out.println("Full Name: " + user11.getFullName());
		System.out.println("Followers Count: " + user11.getFollowersCount());
		System.out.println("Following Count: " + user11.getFollowingCount());
		System.out.println("Posts Count: " + user11.getPostsCount());
		System.out.println("Bio: " + user11.getBio());
		System.out.println("Website: " + user11.getWebsite());
		System.out.println("Email: " + user11.getEmail());
		System.out.println("Phone Number: " + user11.getPhoneNumber());
		System.out.println("Verified: " + user11.isVerified());
		System.out.println("Private: " + user11.isPrivate());
		System.out.println("Profile Picture URL: " + user11.getProfilePictureUrl());
		System.out.println("Gender: " + user11.getGender());
		System.out.println("Location: " + user11.getLocation());

		System.out.println("--------------------------------------");

		SnapChat user111 = new SnapChat();

		user111.setUsername("example_user");
		user111.setEmail("user@example.com");
		user111.setAge(25);
		user111.setGender("Female");
		user111.setLocation("New York");
		user111.setPrivateAccount(true);
		user111.setNumFollowers(1000);
		user111.setNumFollowing(500);
		user111.setNumSnapsSent(300);
		user111.setNumSnapsReceived(450);
		user111.setVerified(true);
		user111.setBio("Hello, I'm an example user!");
		user111.setProfilePictureUrl("https://example.com/profile.jpg");
		user111.setActive(true);

		System.out.println("Username: " + user111.getUsername());
		System.out.println("Email: " + user111.getEmail());
		System.out.println("Age: " + user111.getAge());
		System.out.println("Gender: " + user111.getGender());
		System.out.println("Location: " + user111.getLocation());
		System.out.println("Private Account: " + user111.isPrivateAccount());
		System.out.println("Followers: " + user111.getNumFollowers());
		System.out.println("Following: " + user111.getNumFollowing());
		System.out.println("Snaps Sent: " + user111.getNumSnapsSent());
		System.out.println("Snaps Received: " + user111.getNumSnapsReceived());
		System.out.println("Verified: " + user111.isVerified());
		System.out.println("Bio: " + user111.getBio());
		System.out.println("Profile Picture URL: " + user111.getProfilePictureUrl());
		System.out.println("Active: " + user111.isActive());

		System.out.println("11111111111111111111111111111111111111");

		GitHub hello = new GitHub();

		hello.setUsername("johnDoe");
		hello.setEmail("john@example.com");
		hello.setFullName("John Doe");
		hello.setFollowers(500);
		hello.setFollowing(200);
		hello.setRepositories(50);
		hello.setBio("Software developer");
		hello.setLocation("New York, USA");
		hello.setWebsite("https://johndoe.com");
		hello.setVerified(true);
		hello.setContributions(1000);
		hello.setStars(300);
		hello.setForks(150);
		hello.setPrivateAccount(false);

		System.out.println("Username: " + hello.getUsername());
		System.out.println("Email: " + hello.getEmail());
		System.out.println("Full Name: " + hello.getFullName());
		System.out.println("Followers: " + hello.getFollowers());
		System.out.println("Following: " + hello.getFollowing());
		System.out.println("Repositories: " + hello.getRepositories());
		System.out.println("Bio: " + hello.getBio());
		System.out.println("Location: " + hello.getLocation());
		System.out.println("Website: " + hello.getWebsite());
		System.out.println("Verified: " + hello.isVerified());
		System.out.println("Contributions: " + hello.getContributions());
		System.out.println("Stars: " + hello.getStars());
		System.out.println("Forks: " + hello.getForks());
		System.out.println("Private Account: " + hello.isPrivateAccount());
	}
}
