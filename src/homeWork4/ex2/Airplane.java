package homeWork4.ex2;

//Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
// Иначе печать "самолет летит"
public class Airplane implements Flyable {

    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Пассажиров не может быть меньше нуля");
        }
        System.out.println("Самолет летит.");
    }
}
