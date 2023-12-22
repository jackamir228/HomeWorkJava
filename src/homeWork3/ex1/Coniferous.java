package homeWork3.ex1;

public abstract class Coniferous extends Tree {

    protected String neils;

    public Coniferous(int age) {
        super(age);
    }

    public Coniferous(int age, String neils) {
        super(age);
        this.neils = neils;
    }
}
