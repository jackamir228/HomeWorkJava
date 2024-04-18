package homeWork5.ex1;

public class Runner {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Bird bird = new Bird();
        Tiger tiger = new Tiger();

        Zoo<Bird, Dog, Tiger> zoo = new Zoo<>(bird, dog, tiger);
        Bird animal1 = zoo.getAnimal1();
        Dog animal2 = zoo.getAnimal2();
        Tiger animal3 = zoo.getAnimal3();

        animal1.capable();
        animal2.capable();
        animal3.capable();
    }
}
