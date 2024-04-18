package homeWork5.ex1;

public class Dog extends Animal implements Capable {

    public Dog () {

    }

    @Override
    public void capable() {
        System.out.println("Собака лает");
    }
}
