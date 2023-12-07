package HomeWork2;
import java.util.Random;
public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random(1);
        int number = random.nextInt(1000);
        int attempt = 0;
        int targetNumber = 999;

        do {
            number = random.nextInt(1000);
            attempt++;
        }while (number != targetNumber);

        System.out.println("Число было сгенерировано с попытки " + attempt);
    }
}



