package studies.lesson5;

import java.util.Scanner;

public class testoop {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        BaseOfEmployee[] listEmloyee = new BaseOfEmployee[5];

        listEmloyee[0] = new BaseOfEmployee("Vasya1 Noker", "Junior Java developer",
                "vasya1@googlework.com", "+79656708111",3_000, 32);
        listEmloyee[1] = new BaseOfEmployee("Vasya2 Noker", "Junior Java developer",
                "vasya2@googlework.com", "+79656708222",2_000, 42);
        listEmloyee[2] = new BaseOfEmployee("Vasya3 Noker", "Junior Java developer",
                "vasya3@googlework.com", "+79656708333",1_000, 25);
        listEmloyee[3] = new BaseOfEmployee("Vasya4 Noker", "Junior Java developer",
                "vasya4@googlework.com", "+79656708444",10_000, 52);
        listEmloyee[4] = new BaseOfEmployee("Vasya5 Noker", "Junior Java developer",
                "vasya5@googlework.com", "+79656708555",40_000, 41);
        for (int i = 0; i < listEmloyee.length; i++) {
            if (listEmloyee[i].age > 40) {
                System.out.println(listEmloyee[i]); // домашка вывод сотрудников с возрастом 40+
                System.out.println("\nНа какую сумму Вы хотели бы изменить зарплату сотруднику?");
                int delta = scan.nextInt();
                listEmloyee[i].setSalary(delta); // изменим зарплату этим сотрудникам
                System.out.println("\n");
                System.out.println(listEmloyee[i]);
                System.out.println("\n");
        }




//        System.out.print(b);


    }
}}
