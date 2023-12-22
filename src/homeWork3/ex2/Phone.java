package homeWork3.ex2;

public abstract class Phone {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    protected String operationSystem;
    protected String camera;
    protected String phoneBoard;
    protected String boardSize;

    public Phone(String name, String operationSystem, String camera, String phoneBoard, String boardSize) {
        this.name = name;
        this.operationSystem = operationSystem;
        this.camera = camera;
        this.phoneBoard = phoneBoard;
        this.boardSize = boardSize;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getCamera() {
        return camera;
    }

    public String getPhoneBoard() {
        return phoneBoard;
    }

    public String getName() {
        return name;
    }

    public String getBoardSize() {
        return boardSize;
    }

    public void showInfoAboutPhone() {
        System.out.println("---------------------");
        System.out.println(getName());
        System.out.println(getOperationSystem());
        System.out.println(getCamera());
        System.out.println(getPhoneBoard());
        System.out.println(getBoardSize());
    }
}
