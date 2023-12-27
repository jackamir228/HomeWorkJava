package homeWork4.ex1;

public class PassengerCar extends Car {

       protected boolean isHasCruiseControl;

    public PassengerCar(double length, double height, double width, boolean isClear, boolean isHasCruiseControl) {
        super(length, height, width, isClear);
        this.isHasCruiseControl = isHasCruiseControl;
    }
}
