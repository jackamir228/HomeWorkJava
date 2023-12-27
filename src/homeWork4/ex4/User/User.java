package homeWork4.ex4.User;

import homeWork4.ex4.Messages.Message;

public class User {

    private long id;
    private String name;
    private String password;
    private Message[] countMessages;

    private static long idCounter;
    static {
        idCounter = 1;
    }

    public User(long id, String name, String password, Message countMessages) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.countMessages = new Message[100];
    }

    public User() {
        id = idCounter++;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Message[] getCountMessages() {
        return countMessages;
    }

    private int checkMessagesLegth() {
        int allMessages = 0;
        for (int i = 0; i < this.countMessages.length; i++) {
            if(this.countMessages[i] != null) {
                allMessages++;
            }
        }
        return allMessages;
    }

    public void setCountMessages(Message countMessages) {
        int size = checkMessagesLegth();
        if
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", countMessages=" + countMessages +
                '}';
    }
}