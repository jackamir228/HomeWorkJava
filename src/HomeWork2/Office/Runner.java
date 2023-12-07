package HomeWork2.Office;
public class Runner {
    public static void main(String[] args) {
        Office office = new Office();
        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        Security security = new Security("Петрович");
        Secretary secretary = new Secretary("Секретарь");
        office.startDay();

        boss.bossScream("Володя");
        manager.managerScream();
        security.securityDonate("Петрович");
        secretary.bossChilling("Петр Николаевич", "Володя", "Петрович");




    }
}
