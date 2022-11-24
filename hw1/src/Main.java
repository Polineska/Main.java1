import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hw1 = new Scanner(System.in);
        System.out.print("День рождения: ");
        int day = hw1.nextInt();
        System.out.print("Месяц рождения: ");
        int month = hw1.nextInt();
        System.out.print("Год рождения: ");
        int year = hw1.nextInt();
        if (day < 0 || day > 31 || month < 0 || month > 12 || year < 0 || year > 2022) {
            System.out.println("error");
            return;
        }
        int nDay = 17, nMonth = 11, nYear = 2022;
        int differentsYears = nYear - year;
        if (nMonth < month)
            differentsYears--;
        int differentsMonths = nMonth - month;
        if (differentsMonths < 0)
            differentsMonths += 12;
        int differentsDays = nDay - day;
        if (differentsDays < 0)
        {
            differentsMonths--;
            if (differentsMonths < 0)
            {
                differentsYears--;
                differentsMonths += 12;
            }
            differentsDays += 31;
        }
        System.out.printf("%d лет, %d месяцев и %d дней", differentsYears, differentsMonths, differentsDays);
    }
}