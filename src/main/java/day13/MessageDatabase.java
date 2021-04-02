package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message messageUser : messages) {
            if (messageUser.getSender().getUsername().equals(u1.getUsername()) && messageUser.getReceiver().getUsername().equals(u2.getUsername())) {
                System.out.println(messageUser.getSender().getUsername() + ": " + messageUser.getText());
            } else if (messageUser.getSender().getUsername().equals(u2.getUsername()) && messageUser.getReceiver().getUsername().equals(u1.getUsername())) {
                System.out.println(messageUser.getSender().getUsername() + ": " + messageUser.getText());
            }
        }
    }

}
