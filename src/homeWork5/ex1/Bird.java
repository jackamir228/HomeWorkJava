package homeWork5.ex1;

public class Bird extends Animal implements Capable {

    public Bird() {
    }

    @Override
    public void capable() {
        System.out.println("Птица летит");
    }
}
