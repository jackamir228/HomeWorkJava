package homeWork3.ex5;

public class Runner {
    public static void main(String[] args) {
        House house1 = new House("street1", 228);
        House house2 = new House("street2", 148);
        House[] houses = {house1, house2};

        City city = new City("cityName", houses);

    }
}
