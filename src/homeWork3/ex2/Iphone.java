package homeWork3.ex2;

public class Iphone extends Phone {
    protected boolean isHasFlash;

    public Iphone(String name, String operationSystem, String camera, String phoneBoard,
                  String boardSize, boolean isHasFlash) {
        super("Iphone 15", operationSystem, camera, phoneBoard, boardSize);
        this.isHasFlash = isHasFlash;
    }

    public boolean isHasFlash() {
        return isHasFlash;
    }

    public void showInfoAboutPhone() {
        super.showInfoAboutPhone();
        System.out.println("Вспышка: " + isHasFlash());
    }
}
