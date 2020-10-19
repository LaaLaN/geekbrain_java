package studies;

import java.text.SimpleDateFormat;
import java.util.*;

public class dayGame {
    static Scanner insert = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите дату Вашего дня рождения! (формат: 1.6.1900)");
        System.out.println("Введите день.");
        int day = insert.nextInt();
        System.out.println("Введите месяц.");
        int month = insert.nextInt();
        System.out.println("Введите год.");
        int year = insert.nextInt();
       // System.out.println("Введите какой день сегодня! (формат: 01.06.1900)");
       // String date2 = insert.nextBigInteger().toString();
        delta_time(day, month, year);
    }

    public static void delta_time(int day, int month, int year)
    {
        Calendar calendar = new GregorianCalendar(2020, 9, 19);
        Calendar myday = new GregorianCalendar(year, month-1, day);
        for (int i = 0; i < 100000; ) {
            calendar.add(Calendar.DAY_OF_MONTH, -1);
            //System.out.println(calendar.getTime());
            ++i;
            //System.out.println(i);
            if (calendar.get(Calendar.YEAR) == myday.get(Calendar.YEAR) && calendar.get(Calendar.MONTH) == myday.get(Calendar.MONTH)) {
                if (calendar.get(Calendar.DAY_OF_MONTH) == myday.get(Calendar.DAY_OF_MONTH)) {
                    System.out.println("Дней от Вашего дня рождения - " + i + " дней.");
                    break;
                }
            }
        }


    }
    }


