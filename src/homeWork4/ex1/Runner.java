package homeWork4.ex1;
//В автомойку были отправлены грязные машины мэрии: 4 легковых(длина высота ширина) (5х2х1.8),
//5 автобусов(12х3х2.3)
//Посчитать, сколько мэрия заплатит денег за мойку машин.
public class Runner {
    public static void main(String[] args) {

       Car[] passengerCars = new PassengerCar[4];
        for (int i = 0; i < passengerCars.length; i++) {
            passengerCars[i] = new PassengerCar(5, 2, 1.8, false,
                    true);
        }

        Car[] buses = new Bus[5];
        for (int i = 0; i < buses.length; i++) {
            buses[i] = new Bus(12, 3, 2.3, false, 23);
        }

        CarWash carWashService = new CarWashService();
        double totalCoast;
        totalCoast = carWashService.cleaningCar(passengerCars);
        totalCoast += carWashService.cleaningCar(buses);

        System.out.println(totalCoast);



    }
}
