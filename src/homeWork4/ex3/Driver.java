package homeWork4.ex3;

public class Driver extends Human implements Saying {
    @Override
    public void say() {
        System.out.println("Я водитель");
    }
}
