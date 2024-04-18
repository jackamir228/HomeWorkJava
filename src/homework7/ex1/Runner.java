package homework7.ex1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {

        //Два варианта создания компаратора.
        //вариант 1:
        Comparator<Review> comparator1 = (review1, review2) -> {
            int diffLikes = review2.getLikes() - review1.getLikes();
            if(diffLikes != 0) {
                return diffLikes;
            }
            return review1.getCreatedAt().compareTo(review2.getCreatedAt());
        };
        Review review1 = new Review(1, "отличный товар", 200, LocalDateTime
                .of(2024, 01, 25, 13, 37));
        Review review2 = new Review(2, "так себе товар", 100, LocalDateTime
                .of(2024, 01, 25, 16, 37));
        Review review3 = new Review(3, "плохой товар", 100, LocalDateTime
                .of(2024, 01, 25, 13, 37));

        //вариант 2:
        Comparator<Review> comparator2 = Comparator
                .comparingInt(Review::getLikes)
                .thenComparing(Review::getCreatedAt)
                .reversed();

        TreeSet<Review> reviews = new TreeSet<>(comparator1);
        reviews.addAll(List.of(review1, review2, review3));
        //  System.out.println(reviews);

        ArrayList<Review> reviews2 = new ArrayList<>(List.of(review2, review1, review3));
        reviews2.sort(comparator1);
        System.out.println(reviews2);
    }
}
