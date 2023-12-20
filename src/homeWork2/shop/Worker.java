package homeWork2.shop;

public class Worker {
   private String name;
   private int age;
  private  String sex;
  private  String item1;
   private String item2;

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", item1='" + item1 + '\'' +
                ", item2='" + item2 + '\'' +
                '}';
    }

    public Worker(String workerName, int workerAge, String workerSex,
                  String workerItem1, String workerItem2 ) {
        this.name = workerName;
        this.age = workerAge;
        this.sex = workerSex;
        this.item1 = workerItem1;
        this.item2 = workerItem2;
    }

    public void showOffThings(String workerName,String workerItem1, String workerItem2) {
        System.out.printf("%s: Смотрите какая у меня вещь %s %s\n", workerName, workerItem1, workerItem2);
    }
}
