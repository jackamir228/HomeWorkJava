package homework7.ex4;
//атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
//костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!
public class Runner {
    public static void main(String[] args) {
        Uranium uranium1 = new Uranium();
        Burn atomReactor = (uranium) -> {
            System.out.println("зеленый свет вокруг!");
            return uranium;
        };
        Wood wood = new Wood();
        Burn bonfire = (wood1) -> {
            System.out.println("желто-красный свет вокруг!");
            return wood1;
        };

        atomReactor.burning(uranium1);
        bonfire.burning(wood);
    }
}
