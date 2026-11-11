import java.util.Scanner;
import java.time.Year;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите год рождения: ");
        int birthYear = in.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        if (age < 0) {
            System.out.println("Год рождения не может быть в будущем!");
        } else if (age == 0) {
            System.out.println("Вам меньше года.");
        } else {
            System.out.println("Ваш возраст: " + age);
        }

        in.close();
    }
}
