package homework7.ex2;

import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {
      Garden<Apple> appleGarden = Apple::new;
      Garden<Apricot> apricotGarden = Apricot::new;
        Apricot apricot = apricotGarden.get();
        Apple apple = appleGarden.get();


    }
}
