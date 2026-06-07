package class_relationships._01_association.social_network;

public class Message {
    private User author;
    private String content;
    private String timestamp;

    public Message(User author, String content, String timestamp) {
        this.author = author;
        this.content = content;
        this.timestamp = timestamp;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
