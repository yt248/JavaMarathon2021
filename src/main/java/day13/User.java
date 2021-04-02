package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        boolean isSubscribed = false;
        for (User thisUser : this.subscriptions) {
            if (thisUser.username.equals(user.username)) {
                isSubscribed = true;
            }
        }
        return isSubscribed;
    }

    public boolean isFriend(User user) {
        int count = 0;
        for (User thisUser : this.subscriptions) {
            if (thisUser.username.equals(user.username))
                count++;
        }

        for (User user1 : user.subscriptions) {
            if (user1.username.equals(this.username))
                count++;
        }

        return count == 2;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(new User(this.username), user, text);
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
