import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней: ");
        int day = in.nextInt();

        if (month.equals("февраль") && (day == 31 || day == 30 || day == 29)) {
            System.out.println("Месяц " + month + " не содержит " + day + " дней");
            in.close();
        } else if ((month.equals("апрель") || month.equals("июнь") || month.equals("сентябрь") || month.equals("ноябрь")) && day == 31) {
            System.out.println("Месяц " + month + " не содержит " + day + " дней");
            in.close();
        } else {
            System.out.println("Месяц " + month + " содержит " + day + " дней");
            in.close();
        }
    }
}
