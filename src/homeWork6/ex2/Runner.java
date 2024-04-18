package homeWork6.ex2;

import java.util.HashMap;
import java.util.Map;

//Создать класс Item, атрибут - name
//Переопределить у Item equals и hashcode так, чтобы при попадании в Hashmap в качестве ключа
//вещи всегда попадали в один и тот же bucket.
//При добавлении вещей, они не должны замещать друг друга.
//Пример: создал 3 вещи: item(Яблоко), item(Банан), item(Апельсин)
// положил в Map(ключ - значение):
// item(Яблоко) - 1
// item(Банан) - 2
// item(Апельсин) - 3
//При получении значения по ключу item(Апельсин) получу корректное значение (3)
public class Runner {
    public static void main(String[] args) {

        HashMap<Item, Integer> map = new HashMap<>();
        map.put(new Item("яблоко"), 1);
        map.put(new Item("банан"), 2);
        map.put(new Item("апельсин"), 3);

        Integer value = map.get(new Item("апельсин"));
        System.out.println( value.hashCode());
        System.out.println(value);



    }
}
