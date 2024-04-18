package homework8.ex2;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

//Задание №2 - Сколько здесь "о" ?
//Создать набор уникальных слов: "тонь", "тополь", "боль", "рой", "стройка"
//Внутри одного стрима:
//Посчитать количество букв "о" в одном слове
//Посчитать сумму количества букв "о" во всех словах из набора
//Если буквы "о" есть - напечатать количество букв "о", если нет выкинуть исключение
//ожидаемый результат:
// 6
public class Runner {
    public static void main(String[] args) {
        Set<String> strings = Set.of("тонь", "тополь", "боль", "рой", "стройка");

        strings.stream()
                .map(string -> string.replaceAll("[^о]", "").length())
                .reduce((Integer::sum)).ifPresent(System.out::println);


    }
}
