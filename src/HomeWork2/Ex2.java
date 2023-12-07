package HomeWork2;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        {
            //Перевернуть массив(без сторонних классов), не создавая новый массив. Вывести на экран.
            //"перевернуть" - значит последние элементы становятся первыми и наоборот.
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            for (int i = 0; i < numbers[0]; i++) {
                numbers[0] = 9;
                numbers[8] = 1;
            }

            System.out.println(Arrays.toString(numbers));

        }
    }
}
