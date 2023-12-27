package homeWork4.ex4;
import homeWork4.ex4.User.User;

import java.util.Scanner;
public class OneGramChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя ");
        User user = new User();
        user.setName(scanner.next());

        System.out.println("Введите пароль");
        user.setPassword(scanner.next());
        System.out.println(user);

    }
}
