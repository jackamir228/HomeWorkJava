package fuction;

public class Runner {
    public static void main(String[] args) {
        TylerDurden tylerDurden = new TylerDurden();
        tylerDurden.speak();

        Sigmable patrickBatman = new Sigmable() {
            @Override
            public void speak() {
                System.out.println("тупые вумен");
            }
        };

        patrickBatman.speak();

        Sigmable ryanGosling = () -> System.out.println("......");
        ryanGosling.speak();

        Sigmable taxist = () -> {
            System.out.println("подбрось монетку");
            System.out.println("скибиди тойлет");
        };
        taxist.speak();

        Calculator calculator = (a, b) -> {
            System.out.println("Результат вычислений: " + (a + b));
            return a +b;
        };

        int a = 1;
        int b = 2;

        calculator.accept(a, b);
    }



}
