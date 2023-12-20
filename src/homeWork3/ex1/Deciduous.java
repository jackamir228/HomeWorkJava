package homeWork3.ex1;
public abstract class Deciduous extends Tree{
    protected boolean leaves;
    public Deciduous(int age, boolean isHasLeaves) {
        super(age);
        this.leaves = isHasLeaves;
    }
    public void fallOfLeaves() {
        System.out.printf("%s пропадают с дерева", leaves);
    }
    public void blossomOfLeaves() {
        System.out.printf("%s появляются", leaves);
    }
}
