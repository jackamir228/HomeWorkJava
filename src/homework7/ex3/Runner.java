package homework7.ex3;
public class Runner {
    public static void main(String[] args) {
        Person petr = new Person("petr", 100, 20);
        Divination chamomile = (pe) -> {
            if (petr.getName().length() % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(chamomile.divination(petr));

        Divination granny = pe -> {
            if (petr.getHeight() + petr.getYears() > 210) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(granny.divination(petr));
    }
}
