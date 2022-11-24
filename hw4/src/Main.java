import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество точек: ");
        int n = scanner.nextInt();
        System.out.print("Радиус окружности: ");
        int radius = scanner.nextInt();
        int k = 0;
        for (int i = 1; i <= n; i++) {
            if (inKrug(scanner, radius, i))
                k+=1;
        }
        System.out.println(k + " точек попали в окружность");
        scanner.close();
    }

    private static boolean inKrug(Scanner scanner, int r, int i) {
        System.out.printf("X %d точки: ", i);
        double x = scanner.nextDouble();
        System.out.printf("Y %d точки: ", i);
        double y = scanner.nextDouble();
        double distance = Math.sqrt(x * x + y * y);
        return distance <= r;
    }
}