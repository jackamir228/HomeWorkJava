package homeWork4.ex2;

//5. Создать 1 утку не раненую, 1 утку раненую, 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
public class Runner {
    // утка летит
    // Ошибка: утка ранена
    // самолет летит
    // Ошибка: пассажиров в самолете меньше 0
    public static void main(String[] args) throws FlyException {

        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);

        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);

        duck2.fly();
        duck1.fly();

        airplane1.fly();
        airplane2.fly();

    }
}
