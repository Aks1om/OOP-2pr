package task1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фамилию разработчика: ");
        String surname = scanner.nextLine();
        System.out.print("Введите дату и время получения задания (дд.мм.гггг чч:мм): ");
        String received = scanner.nextLine();

        Date submitted = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println("Разработчик: " + surname);
        System.out.println("Получение задания: " + received);
        System.out.println("Сдача задания: " + format.format(submitted));
    }
}
