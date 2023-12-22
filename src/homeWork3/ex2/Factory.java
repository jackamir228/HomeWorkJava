package homeWork3.ex2;

public class Factory {
    public static void main(String[] args) {
        Samsung samsung = new Samsung("Samsung galaxy", "android", "20x zoom",
                " j-108", "10х12х13");
        samsung.showInfoAboutPhone();

        Iphone iphone = new Iphone("Iphone 15", "Ios", "15x zoom",
                "7uik", "15х12х13", true);
        iphone.showInfoAboutPhone();


    }
}
