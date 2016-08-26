package ee.mrts.model;

public class Speaker {

    private String name;
    private String bio;
    private String twitter;

    public Speaker(String name, String bio, String twitter) {
        this.name = name;
        this.bio = bio;
        this.twitter = twitter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
}
