package homework7.ex1;

import java.util.List;

public interface ReviewComparator<T> {

    List<Review> compare(T o1, T o2, T o3);
}
