package task3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getBirthDate(int style) {
        DateFormat format = DateFormat.getDateInstance(style, Locale.forLanguageTag("ru-RU"));
        return format.format(birthDate);
    }

    public String toString(int style) {
        return "Студент: " + name + ", дата рождения: " + getBirthDate(style);
    }

    @Override
    public String toString() {
        return toString(DateFormat.MEDIUM);
    }
}
