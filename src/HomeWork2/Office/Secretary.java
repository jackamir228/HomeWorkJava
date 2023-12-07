package HomeWork2.Office;
public class Secretary {
    private String secretary;

    public Secretary(String secretary) {
        this.secretary = secretary;
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "secretary='" + secretary + '\'' +
                '}';
    }

    public void bossChilling(String bossName, String managerName, String securityName) {
        System.out.printf("Секретарь говорит - %s, не волнуйтесь, %s все успеет. %s - подождите!", bossName, managerName, securityName);
    }
}
