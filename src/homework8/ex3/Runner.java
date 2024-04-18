package homework8.ex3;

//Необходимо создать небоскребы:
//1 Всемирный торговый центр 1 - 541м
//2 Шанхайская башня - 632м
//3	Бурдж-Халифа - 828м
//4 Международный финансовый центр Пинань - 599м
//5 Абрадж аль-Бейт - 601м
//6 Всемирный центр Лотте - 555м

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//Занести данный список в List! Дважды положить бурдж халифа в лист.
//С помощью стримов:
//Убрать дубликаты
//(РАЗНЫЕ СТРИМЫ)
//Вывести только первые три небоскреба.
//Вывести самый высокий небоскреб.
//Вывести те небоскребы, которые выше километра.
//Если выше нет, то вывести на экран: небоскреба выше километра - нет.
public class Runner {
    public static void main(String[] args) {

        List<Skyscraper> skyscrapers = List.of(
                new Skyscraper("Всемирный торговый центр", 541),
                new Skyscraper("Бурдж-Халифа", 828),
                new Skyscraper("Шанхайская башня", 632),
                new Skyscraper("Бурдж-Халифа", 828),
                new Skyscraper("Бурдж-Халифа", 828),
                new Skyscraper("Международный финансовый центр Пинань", 599),
                new Skyscraper("Абрадж аль-Бейт", 601),
                new Skyscraper("Всемирный центр Лотте", 555));

        //убрать дубликаты
        skyscrapers.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");

        //печатаю 3 первых небоскреба
        skyscrapers.stream()
                .limit(3)
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        //самая высокая башня
        skyscrapers.stream()
                .max((a, b) -> a.getHeight() - b.getHeight())
                .ifPresent(skyscraper -> System.out.println("Самая высокая башня: " + skyscraper));
        System.out.println("-------------------------------------------------------------------");
        //вывод башни длинее киллометра
        skyscrapers.stream()
                .filter(skyscraper -> skyscraper.getHeight() > 1000)
                .max(Comparator.comparingInt(Skyscraper::getHeight))
                .orElseThrow(() -> new RuntimeException("небоскреба выше километра - нет."));
    }
}
