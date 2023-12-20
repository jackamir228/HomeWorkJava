package homeWork2.office;

public class Boss {
    private String name;

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                '}';
    }

    public Boss(String name) {
        this.name = name;
    }
    public void bossScream(String managerName) {
        System.out.printf("Босс говорит - %s быстрее!", managerName);
    }
}
