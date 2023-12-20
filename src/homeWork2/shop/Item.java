package homeWork2.shop;
public class Item {
   private int weight;
   private String name;
    public Item(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
    public void itemShow(int weight, String name) {
        System.out.println(weight + " " + name);
    }
}
