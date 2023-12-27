package homeWork3.ex1;

public final class Birch extends Deciduous {
    public Birch(int age) {
        super(age, "листья");
    }

    @Override
    public void blossomOfLeaves() {
        super.blossomOfLeaves();
        System.out.print(" она источает аллергены\n");
    }
}
