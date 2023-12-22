package homeWork3.ex5;

public class House {
    private String streetName;
    private int numberOfHouse;

    public House(String streetName, int numberOfHouse) {
        this.streetName = streetName;
        this.numberOfHouse = numberOfHouse;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public String toString() {
        return "House{"
                +
                "streetName='" + streetName + '\''
                +
                ", numberOfHouse=" + numberOfHouse
                +
                '}';
    }
}

