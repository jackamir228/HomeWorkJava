package homework8.ex1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {

        AtomicInteger counter = new AtomicInteger(0);
        AtomicInteger counter2 = new AtomicInteger(0);

        Stream<Car> carsA0 = Stream.generate(() -> new Car("a0%dан799".formatted(counter.addAndGet(1))))
                .limit(50);

        Stream<Car> carsK0 = Stream.generate(() -> new Car("к0%dсе178".formatted(counter2.addAndGet(1))))
                .limit(50);

        Stream<Car> allCars = Stream.concat(carsA0, carsK0);
        Stream<Car> ambulances = allCars.filter(car -> car.getCarNumber().matches(".*04[0-9].*"));

        StringBuilder stringBuilder = new StringBuilder();
        ambulances.forEach(car -> {
            stringBuilder.append(car.getCarNumber());
            stringBuilder.append(", ");
        });

        System.out.println(stringBuilder);
    }
}
