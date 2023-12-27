package homeWork4.ex4.Messages;

public class Message {
    protected String text;
    protected String author;
    protected String recipient;

    public String getAuthor() {
        return author;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
