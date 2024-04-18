package homework8.ex1SecondSolution;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {

        AtomicInteger firstCounter = new AtomicInteger(0);
        AtomicInteger secondCounter = new AtomicInteger(0);

        Stream<Car> firstCars = Stream.generate(() -> new Car("а0%dан799".formatted(firstCounter.addAndGet(1))))
                .limit(50);

        Stream<Car> secondCars = Stream.generate(() -> new Car("к0%dсе178".formatted(secondCounter.addAndGet(1))))
                .limit(50);

        Stream<Car> allCars = Stream.concat(firstCars, secondCars);

        allCars.filter(car -> car.getNumber()
                        .matches(".*04[0-9].*"))
                .forEach(car -> {
                    System.out.print( "  "+ (car.getNumber()) + " ,");
                });
    }
}










