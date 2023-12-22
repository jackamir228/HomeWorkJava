package homeWork3.ex5;

import java.util.Arrays;

public final class City {
    private String name;
    private House[] houses;

    @Override
    public String toString() {
        return "City{"
                +
                "name='" + name + '\''
                +
                ", houses=" + Arrays.toString(houses)
                +
                '}';
    }

    public City(String name, House[] houses) {
        this.name = name;
        this.houses = houses;
    }
}

