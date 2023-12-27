package homeWork4.ex1;

public abstract class Car {

    protected double length;
    protected double height;
   protected double width;
   protected boolean isClear;

    public Car(double length, double height, double width, boolean isClear) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.isClear = isClear;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public boolean isClear() {
        return isClear;
    }

    public void setClear(boolean clear) {
        isClear = clear;
    }
}
