package homeWork5.ex1;

public class Tiger extends Animal implements Capable{

    public Tiger() {

    }

    @Override
    public void capable() {
        System.out.println("Тигр рычит");
    }
}
