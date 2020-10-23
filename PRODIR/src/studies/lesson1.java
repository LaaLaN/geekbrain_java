package studies;

import java.util.Scanner;

public class lesson1 {
    //psvm
    static Scanner insert = new Scanner(System.in);

    public static void main(String[] args) {
        //sout
        int itIsInt = 0;
        char itIsChar = 'ч';
        byte itIsByte = 127;
        short itIsShort = 32767;
        long itIsLong = 9999999;
        float itIsFloat = 3.141592653f;
        double itIsDouble = 0.12312312313; //very long 10degree308
        boolean jesusAlife = true;
        String itIsString = "Не примитивный но очень часто используется";

        int a = -1;
        short b = -90;
        byte c = 100;
        long d = 4;
        System.out.println("Введите год для определения его высокосности!");
        long year = insert.nextLong();

        sixth_method_my(year);
        sixth_method_pc(b);


    }

    public static Float first_method(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean second_method(float a, float b) {
        if (a + b >= 10 && a + b <= 20) return true;
        else return false;
    }

    public static void thirt_method(long a) {
        if (a >= 0) {
            System.out.println("Число положительное!");
        } else System.out.println("Число a negative!");
    }

    private static boolean fourth_method(long a) {
        if (a < 0) return true;
        return false;
    }

    private static void fifth_method(String anyName) {
        System.out.println("Привет, " + anyName + "!");
    }

    private static void sixth_method_my(long year) {
        System.out.println(" ");

        if (year > 0) {
            if (year % 4 == 0) {
                if (year % 400 > 0) {
                    if (year % 100 == 0) System.out.println("Год высокосный, но стократный!");
                } else System.out.println("Год высокосный, но четырехсоткратный!");
            } else System.out.println("Год не высокосный!");
        } else if (year == 0) System.out.println("Вы ввели ноль! Был такой год... но мы не знаем, высокосный ли он.");
        else System.out.println("Введен год до Рождества Христова.");
    }

    private static void sixth_method_pc(long year) {
        System.out.println(" ");
        if (year % 4 == 0) {
            if (year % 400 > 0) {
                if (year % 100 == 0) System.out.println("Год исключен!");
            } else System.out.print("Год высокосный!");
        } else System.out.println("Год не высокосный!");
    }
}
