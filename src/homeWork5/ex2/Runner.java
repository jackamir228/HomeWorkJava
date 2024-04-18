package homeWork5.ex2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> integers1 = new ArrayList<>(List.of(5, 2, 4));
        ArrayList<Integer> integers2 = new ArrayList<>(List.of(7, 10));

        final ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(integers1);
        integers.addAll(integers2);
        System.out.println(integers);
        integers.remove(3);
        System.out.println("Лист после удаления - " + integers);
        System.out.println(integers.indexOf(10));

        List<Integer> integers3 = List.of(5, 2, 4);
        List<Integer> integers4 = List.of(7, 10);
        ArrayList<Integer> integers5 = new ArrayList<>();
        integers5.addAll(integers3);
        integers5.addAll(integers4);
        System.out.println(integers5);
        integers5.remove(2);
        System.out.println(integers5.indexOf(Integer.valueOf(10)));

    }


}
