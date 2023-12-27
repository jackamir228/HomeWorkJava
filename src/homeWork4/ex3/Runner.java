package homeWork4.ex3;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Human human = new Human();
        Builder builder = new Builder();
        Driver driver = new Driver();

        bird.say();
        human.say();
        builder.say();
        driver.say();
    }
}
