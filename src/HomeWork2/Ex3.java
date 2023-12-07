package HomeWork2;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        //Дан распределитель случайных чисел
        Random random = new Random(1);
        //Получение случайного числа
        int number = random.nextInt(1000);
        int attempt = 0;
        int targetNumber = 999;

        //Написать код, генерирующий случайные числа до тех пор, пока не сгенерируется 999.
        //Вывести номер попытки, с которой получилось получить случайным образом число 999.

        do {
            number = random.nextInt(1000);
            attempt++;
        }while (number != targetNumber);

        System.out.println("Число было сгенерировано с попытки " + attempt);


    }
}



