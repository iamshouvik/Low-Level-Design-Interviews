package class_relationships._01_association.social_network;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<User> followers = new ArrayList<>();
    private List<User> following = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void follow(User user){
        if(this == user) {
            return;
        }
        if(following.contains(user)){
            return;
        }
        following.add(user);
        user.followers.add(this);
    }

    public void sendMessage(String content, String timestamp){
        Message message = new Message(this, content, timestamp);
        messages.add(message);
    }
}
