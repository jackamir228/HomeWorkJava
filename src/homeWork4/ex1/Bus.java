package homeWork4.ex1;

public class Bus extends Car {

   private int maxPassengers;

    public Bus(double length, double height, double width, boolean isClear, int maxPassengers) {
        super(length, height, width, isClear);
        this.maxPassengers = maxPassengers;
    }
}
