import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();
        boolean otricat = n < 0;
        if (otricat) n *= -1;
        double result = 1;
        // int i = 1;
        // while (i <= n) {
        //     result *= x;
        //     i++;
        // }
        for (int i = 1; i <= n; i++) result *= x;
        if (otricat) result = 1 / result;
        System.out.println(result);
        scanner.close();
    }
}