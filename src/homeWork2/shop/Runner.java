package homeWork2.shop;
public class Runner {
    public static void main(String[] args) {
        Item hammer = new Item(1000, "Молот");
        Item screwdriver = new Item(50, "Отвертка");
        Item copybook = new Item(30, "Тетрадь");
        Item pen = new Item(10, "Ручка");

        Worker vasili = new Worker("Василий", 30, "male",
                "молот", "отвертка");
        Worker maryana = new Worker("Марьяна", 25, "female",
                "тетрадь", "ручка");

        Shop vasya = new Shop("Василий", 30, "male",
                "молот", "отвертка");
        Shop maryan = new Shop("Марьяна", 25, "female",
                "тетрадь", "ручка");

        System.out.println(maryan);
        System.out.println(vasya);

        vasili.showOffThings("Василий","молот", "отвертка");
        maryana.showOffThings("Марьяна", "тетрадь", "ручка");
    }
}
