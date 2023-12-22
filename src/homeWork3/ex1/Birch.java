package homeWork3.ex1;

public final class Birch extends Deciduous {
    public Birch(int age, boolean isHasLeaves) {
        super(age, isHasLeaves);
    }

    @Override
    public void blossomOfLeaves() {
        super.blossomOfLeaves();
        System.out.print(" она источает аллергены\n");
    }
}
