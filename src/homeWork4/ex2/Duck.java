package homeWork4.ex2;
// Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
// иначе печатать на экран "утка летит"
public class Duck implements Flyable{
    private boolean  isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
                throw new FlyException("Утка ранена");
        }
        System.out.println("Утка летит");
    }
}
