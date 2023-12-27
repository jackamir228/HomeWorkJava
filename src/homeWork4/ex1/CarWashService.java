package homeWork4.ex1;

public class CarWashService implements CarWash {

    double priceForBus = 4000;
    double priceForPassengerCar = 2000;

    @Override
    public double cleaningCar(Car... cars) {
        double totalCoast = 0;
        for (var car : cars) {
            if (car.getLength() > 6 || car.getHeight() > 2.5 || car.getWidth() > 2) {
                totalCoast += priceForBus;
                car.setClear(true);
            } else {
                totalCoast += priceForPassengerCar;
                car.setClear(true);
            }
        }
        return totalCoast;
    }
}
