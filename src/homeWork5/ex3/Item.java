package homeWork5.ex3;

public class Item<T extends Item> {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
