package task3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        String name = scanner.nextLine();
        System.out.print("Введите дату рождения (дд.мм.гггг): ");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        format.setLenient(false);
        Date birthDate = format.parse(scanner.nextLine());

        Student student = new Student(name, birthDate);
        System.out.print("Формат даты: 1 — короткий, 2 — средний, 3 — полный: ");
        int choice = scanner.nextInt();
        int style;
        switch (choice) {
            case 1:
                style = DateFormat.SHORT;
                break;
            case 2:
                style = DateFormat.MEDIUM;
                break;
            case 3:
                style = DateFormat.FULL;
                break;
            default:
                System.out.println("Неизвестный формат.");
                return;
        }
        System.out.println(student.toString(style));
    }
}
