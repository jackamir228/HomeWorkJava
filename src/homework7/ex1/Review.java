package homework7.ex1;

import java.time.LocalDateTime;
import java.util.Objects;

public class Review {

    private int id;
    private String text;
    private int likes;
    private LocalDateTime createdAt;

    public Review(int id, String text, int likes, LocalDateTime createdAt) {
        this.id = id;
        this.text = text;
        this.likes = likes;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Review{" +
               "id=" + id +
               ", text='" + text + '\'' +
               ", likes=" + likes +
               ", time=" + createdAt +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Review review)) return false;
        return Objects.equals(likes, review.likes) && Objects.equals(createdAt, review.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(likes, createdAt);
    }
}
