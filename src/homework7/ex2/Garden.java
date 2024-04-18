package homework7.ex2;

import java.util.function.Supplier;

@FunctionalInterface
public interface Garden<T extends Fruit> extends Supplier<T> {
}
