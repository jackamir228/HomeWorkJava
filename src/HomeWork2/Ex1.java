package HomeWork2;

public class Ex1 {
    public static void main(String[] args) {
        //Дан массив с массивом чисел внутри
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 2, 3, 4, 5, 6, 7, 8, 9, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 93, 10};
        arrayOfNumbers[2] = new int[]{1, 2, 31, 4, 5, 6, 7, 81, 9, 10};
        arrayOfNumbers[3] = new int[]{1, 2, 3, 45, 5, 6, 77, 8, 9, 10};
        arrayOfNumbers[4] = new int[]{1, 2, 3, 4, 57, 67, 7, 8, 9, 10};
        arrayOfNumbers[5] = new int[]{1, 2, 3, 4, 533, 68, 7, 8, 9, 10};
        arrayOfNumbers[6] = new int[]{1, 2, 3, 40, 5, 6, 72, 8, 9, 10};
        arrayOfNumbers[7] = new int[]{1, 2, 30, 4, 5, 6, 7, 83, 9, 10};
        arrayOfNumbers[8] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 901, 10};
        arrayOfNumbers[9] = new int[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 101};

        //Посчитать сумму каждой диагонали используя цикл(ы)
        //Вывесим на экран
        //С левого верхнего угла к нижнему правому
        int leftUpToRightDownSum = 0;

        //С левого нижнего угла к верхнему правому
        int leftDownToRightUpSum = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            leftUpToRightDownSum += arrayOfNumbers[i][i];

        }
        System.out.println(leftUpToRightDownSum);

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            leftDownToRightUpSum += arrayOfNumbers[i][arrayOfNumbers.length - i - 1];

        }
        System.out.println(leftDownToRightUpSum);
    }
}

