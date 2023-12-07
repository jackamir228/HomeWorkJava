package HomeWork2.shop;
public class Shop {
    private String worker;
    private int workerAge;
    private String workerSex;
    private String countItem1;
    private String countItem2;

    public Shop(String worker, int workerAge, String workerSex, String countItem1, String countItem2) {
        this.worker = worker;
        this.workerAge = workerAge;
        this.workerSex = workerSex;
        this.countItem1 = countItem1;
        this.countItem2 = countItem2;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "worker='" + worker + '\'' +
                ", workerAge=" + workerAge +
                ", workerSex='" + workerSex + '\'' +
                ", countItem1='" + countItem1 + '\'' +
                ", countItem2='" + countItem2 + '\'' +
                '}';
    }

    public void shopShow(String worker, int workerAge, String workerSex, String countItem1, String countItem2){
        System.out.printf("%s %f %s %s %s %s", worker, workerAge, workerSex, countItem1, countItem2);
    }
}
