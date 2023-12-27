package homeWork3.ex1;

public abstract class Deciduous extends Tree {

    protected String leaves;

    public Deciduous(int age, String leaves) {
        super(age);
        this.leaves = leaves;
    }

    public void fallOfLeaves() {
        System.out.printf("%s пропадают с дерева", leaves);
    }

    public void blossomOfLeaves() {
        System.out.printf("%s появляются", leaves);
    }
}
