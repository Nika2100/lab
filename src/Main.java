import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        //Создадим экземпляр класса студент
        //Используем класс Calendar для обозночения дня рождения студента
        Calendar br = new GregorianCalendar(2002, Calendar.JANUARY , 25);
        Student st = new Student("Иванов","Иван","Иванович",br,"89184663956","Ivan@gmail.com");

        Calendar br2 = new GregorianCalendar(2002, Calendar.DECEMBER , 22);
        Student st2 = new Student("Петров","Даиил","Викторович",br2,"89185883956","Petr@gmail.com");


        //С помощью лямбда-выражения посчитает сколько лет студенту
        Operation operation;
        operation = birthday -> {
            LocalDate currentDate = LocalDate.now();
            Integer y = birthday.get(Calendar.YEAR);
            Integer m = birthday.get(Calendar.MONTH) + 1;
            Integer d = birthday.get(Calendar.DAY_OF_MONTH);
            LocalDate brs = LocalDate.of(currentDate.getYear(),m,d);

            if (currentDate.equals(brs) || currentDate.isAfter(brs))
                return currentDate.getYear() - y;
            else
                return currentDate.getYear() - y - 1;
        };

        //Вывод системной даны
        LocalDate currentDate = LocalDate.now();
        System.out.println("Дата сегодня: " + currentDate);

        //Вывод результата работы лямба-выражения operation.get_year
        System.out.println("Cтуденту " + st.getName() + ": " + operation.get_year(st.getBirthday()));
        System.out.println("Cтуденту " + st2.getName() + ": " + operation.get_year(st2.getBirthday()));

        //Реализуем термелальное лямбда-выражение выводы информации о студенте
        Printble printble;
        printble = student -> {
            System.out.println("Фио: " + student.getSurname() + " " + student.getName() + " " + student.getPatronymic());
            String day = "";
            String month = "";
            String year = String.valueOf(student.getBirthday().get(Calendar.YEAR));

            if ((student.getBirthday().get(Calendar.DAY_OF_MONTH)) > 9)
                day = String.valueOf( (student.getBirthday().get(Calendar.DAY_OF_MONTH)));
            else
                day = "0" + String.valueOf((student.getBirthday().get(Calendar.DAY_OF_MONTH)));

            if ((student.getBirthday().get(Calendar.MONTH) + 1) > 9)
                month = String.valueOf( (student.getBirthday().get(Calendar.MONTH) + 1));
            else
                month = "0" + String.valueOf((student.getBirthday().get(Calendar.MONTH) + 1));

            System.out.println("День рождение: " + day + "." + month + "." + year);

            System.out.println("Телефон: " + student.getPhone());
            System.out.println("Почта: " + student.getMail());
        };

        //Выведем информацию о 2 студентах
        System.out.println();
        printble.print(st);

        System.out.println();
        printble.print(st2);
    }
}