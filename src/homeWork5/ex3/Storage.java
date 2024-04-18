package homeWork5.ex3;

import java.util.ArrayList;
import java.util.List;

//Задание №3 Создать волшебный склад.
//Создать класс Item - с единственным атрибутом - имя вещи.
//Склад принимает в себя вещи. У склада нет ограничений в хранении.
//Склад умеет принимать в себя список вещей и хранить их с уже существующими вещами.
//В складе должен быть метод: получить все вещи.
// Данный метод вернет список, в котором будет только каждая четная вещь из склада.
//В складе должен быть метод: получить вещь по индексу. Данная вещь пропадает из склада.
//Склад умеет удалять все вещи, кроме последней.
public class Storage{

  private List<Item> items = new ArrayList<Item>();

    public Storage(List<Item> items) {
        this.items.addAll(items);
    }

    public List<Item> getItems () {
        ArrayList<Item> tempList = new ArrayList<>();
        for (int i = 0; i < items.size(); i+=2) {
                tempList.add(items.get(i));
        }
        return tempList;
    }

    public Item getItem(int index) {
        return items.get(index);
    }

    public void clearWithoutLast () {
        Item item = items.get(items.size() - 1);
        items.clear();
        items.add(item);
    }
}
