import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("День: ");
        int day = scanner.nextInt();
        System.out.print("Месяц: ");
        int month = scanner.nextInt();
        if (day < 0 || day > 31 || month < 0 || month > 12) {
            System.out.println("error");
            return;
        }
        if (month == 6 || month == 7 || month == 8)
            System.out.println("лето");
        if (month == 9 || month == 10 || month == 11)
            System.out.println("осень");
        if (month == 12 || month == 1 || month == 2)
            System.out.println("зима");
        if (month == 3 || month == 4 || month == 5)
            System.out.println("весна");
        scanner.close();
    }
}