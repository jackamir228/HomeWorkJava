package homeWork6.ex2;

import java.util.Objects;

public class Item {
    //Переопределить у Item equals и hashcode так, чтобы при попадании в Hashmap в качестве ключа
    //вещи всегда попадали в один и тот же bucket.
    //При добавлении вещей, они не должны замещать друг друга.
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item item)) return false;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Item{" +
               "name='" + name + '\'' +
               '}';
    }
}
