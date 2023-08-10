package association.example.app.getset;

public class SnapChat {
    private String username;
    private String email;
    private int age;
    private String gender;
    private String location;
    private boolean isPrivateAccount;
    private int numFollowers;
    private int numFollowing;
    private int numSnapsSent;
    private int numSnapsReceived;
    private boolean isVerified;
    private String bio;
    private String profilePictureUrl;
    private boolean isActive;

    // Getters and Setters for properties
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isPrivateAccount() {
        return isPrivateAccount;
    }

    public void setPrivateAccount(boolean privateAccount) {
        isPrivateAccount = privateAccount;
    }

    public int getNumFollowers() {
        return numFollowers;
    }

    public void setNumFollowers(int numFollowers) {
        this.numFollowers = numFollowers;
    }

    public int getNumFollowing() {
        return numFollowing;
    }

    public void setNumFollowing(int numFollowing) {
        this.numFollowing = numFollowing;
    }

    public int getNumSnapsSent() {
        return numSnapsSent;
    }

    public void setNumSnapsSent(int numSnapsSent) {
        this.numSnapsSent = numSnapsSent;
    }

    public int getNumSnapsReceived() {
        return numSnapsReceived;
    }

    public void setNumSnapsReceived(int numSnapsReceived) {
        this.numSnapsReceived = numSnapsReceived;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
