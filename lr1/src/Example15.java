import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = in.nextInt();

        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        int sum = a+b;
        int minus = a-b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + minus);
        in.close();
    }
}