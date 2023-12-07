package HomeWork2.Office;
public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }

    public void managerScream() {
        System.out.println("\nМэнеджер говорит - я ничего не успеваю, помогите!");
    }
}
