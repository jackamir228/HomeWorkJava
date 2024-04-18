package homework8.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class User {
    private int id;
    private List<Integer> integers;

    public User(int id) {
        this.id = id;
        integers = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }

    public List<Integer> fillTheSheetWithNumbers(int countElements) {
        Random random = new Random();
        IntStream.range(0, countElements).forEach(value -> getIntegers().add(random.nextInt(10)));
        return this.getIntegers();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", integers=" + integers +
                '}';
    }
}
