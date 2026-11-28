package task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        format.setLenient(false);

        System.out.print("Введите дату (дд.мм.гггг): ");
        Date enteredDate = format.parse(scanner.nextLine());
        Calendar entered = Calendar.getInstance();
        entered.setTime(enteredDate);

        Calendar now = Calendar.getInstance();
        // Сравниваем именно даты, без времени суток.
        now.set(Calendar.HOUR_OF_DAY, 0);
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.MILLISECOND, 0);

        System.out.println("Текущая дата: " + format.format(now.getTime()));
        int result = entered.getTime().compareTo(now.getTime());
        if (result < 0) {
            System.out.println("Введённая дата раньше текущей.");
        } else if (result > 0) {
            System.out.println("Введённая дата позже текущей.");
        } else {
            System.out.println("Даты совпадают.");
        }
    }
}
