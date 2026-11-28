package task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год, месяц, число, часы и минуты через пробел: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setLenient(false);
        calendar.set(year, month - 1, day, hour, minute);
        Date date = calendar.getTime();

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println("Дата из Date: " + format.format(date));
        System.out.println("Дата из Calendar: " + format.format(calendar.getTime()));
    }
}
