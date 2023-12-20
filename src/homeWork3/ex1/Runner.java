package homeWork3.ex1;

public class Runner {
    public static void main(String[] args) {
        Birch birch = new Birch(70, true);
        birch.blossomOfLeaves();

        Pine pine = new Pine(275);
        Fir fir = new Fir(232);

        double birchAge = birch.getAge();
        double firAge = fir.getAge();
        double pineAge = pine.getAge();

        double[] yearsOfTree = {birchAge, firAge, pineAge};
        double middleAge = (yearsOfTree[0] + yearsOfTree[1] + yearsOfTree[2]) / yearsOfTree.length;
        System.out.println("Средний возраст деревьев: " + middleAge);
    }
}


