package homeWork6.ex3;

import java.util.Objects;
//3. Задание: Сломай это немедленно
//Создать класс Detail, атрибут - name
//Переопределить у Detail equals и hashcode так, чтобы при попадании в Hashmap в качестве ключа
//деталь всегда перетирала имеющуюся там деталь.
// Т.е. если положить Hashmap 3 детали в качестве ключа (число значение):
// detail(Пила) - 1, detail(Молоток) - 2, detail(отвертка) - 3
//При попытке печати map на экран: там будет последняя вставленное значение у первой детали
//деталь ( detail(Пила) - 3 )
//3. Задание: Сломай это немедленно
//Создать класс Detail, атрибут - name
//Переопределить у Item equals и hashcode так, чтобы при попадании в Hashmap в качестве ключа
//деталь всегда перетирала имеющуюся там деталь.
// Т.е. если положить Hashmap 3 детали в качестве ключа (число значение):
// detail(Пила) - 1, detail(Молоток) - 2, detail(отвертка) - 3
//При попытке печати map на экран: там будет последнее вставленное значение у первой детали
//деталь ( detail(Пила) - 3 )
public class Detail {
    private String name;

    public Detail(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Detail detail)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Detail{" +
               "name='" + name + '\'' +
               '}';
    }
}
