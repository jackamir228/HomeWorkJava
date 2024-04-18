package homework8.ex4;

public class Runner {

    public static void main(String[] args) {

        User user1 = new User(1);

        user1.fillTheSheetWithNumbers(10);
//        System.out.println(user1);

        user1.getIntegers().stream().filter((a) -> a > 4)
                .distinct()
                .sorted()
                .forEach(integer -> {
                    User x = new User(integer);
                    x.fillTheSheetWithNumbers(10);
                    x.getIntegers().stream()
                            .map(i -> i * 10)
                            .reduce(Integer::sum)
                            .ifPresent(System.out::println);
                });
    }
}
