package homeWork4.ex4.Messages;

import java.time.LocalDateTime;

public class Message {
    private String text;
    private long author;
    private long recipient;


    public Message(String text, long author, long recipient) {
        this.text = text;
        this.author = author;
        this.recipient = recipient;
        this.timestamp = LocalDateTime.now();
    }

    public Message() {
        timestamp = LocalDateTime.now();
    }

    protected LocalDateTime timestamp;

    public long getAuthor() {
        return author;
    }

    public long getRecipient() {
        return recipient;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", recipient='" + recipient + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
