package day13;

import java.util.Date;

public class Message {
    private User sender; //отправитель
    private User receiver; //получатель
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "FROM: " + sender +
                ", TO: " + receiver +
                ", ON: " + date + '\'' +
                " " + text +
                '}';
    }
}
