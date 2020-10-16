package studies;


import java.util.Scanner;
public class arrays_les2 {
    //psvm
    public static void main(String[] args) {
        //задание №1
        System.out.println(" ");
        System.out.println("Lessons 2_1");
        byte[] array01 = new byte[10]; //задание 1 Создать массив 0 и 1
        for (byte i = 0; i < array01.length; i++) // заполняем массив
        {
            array01[i] = (byte)(Math.random()*2); // рандомно заполняем
            System.out.print(" " + array01[i]); //выводим посмотреть
        }
        System.out.println(" ");
        for (byte i = 0; i < array01.length; i++) //выполняем задание №1
        {
            if (array01[i]==0) array01[i] = 1;
            else array01[i] = 0;
            System.out.print(" " + array01[i]); //выводим посмотреть
        }

        //задание №2
        System.out.println(" ");
        System.out.println("Lessons 2_2");
        byte[] array02 = new byte[8]; // декларировали
        for (byte i=1; i<array02.length;i++) //циклично инициировали все елементы
            array02[i] = (byte) (array02[i-1] + 3); //пропустили array02[0] так как он 0 по умолчанию.
        showArrayByte(array02);

        //задание №3
        System.out.println(" ");
        System.out.println("Lessons 2_3");
        byte[] array03 = new byte[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (byte i=0; i<array03.length;i++)  //переберем массив
        { if (array03[i] < 6) array03[i] *= 2; } //если елемент меньше 6 то умножаем на 2 и переназначаем
        showArrayByte(array03);

        //задание №4
        System.out.println(" ");
        System.out.println("Lessons 2_4");
        byte[][] array04 = new byte[5][5];
        for (byte i = 0; i < array04.length; i++) //зарандомим елементы этого массива
            for (byte j = 0; j < array04[0].length; j++)
                array04[i][j] = (byte)(Math.random()*100);

        for (byte i = 0; i < array04.length; i++) //посмотрим этот двумерный массив
        {
            for (byte j = 0; j < array04[0].length; j++)
                System.out.print(" "+array04[i][j]);
            System.out.println(" ");
        }

        for (byte i = 0; i < array04.length; i++) //заменяем диагональ №1
        {
            for (byte j = 0; j < array04[0].length; j++)
                if (i == j) array04[i][j] = 1;
        }
        for (byte i = 0; i < array04.length; i++) //заменяем диагональ №2
        {
            for (byte j = (byte) (array04[i].length - 1); j >= 0; j--)
                if (j == array04[i].length-(i+1))
                    array04[i][j] = 1;
        }
        System.out.println(" ");

        for (byte i = 0; i < array04.length; i++) //посмотрим этот двумерный массив
        {
            for (byte j = 0; j < array04[0].length; j++)
                System.out.print(" "+array04[i][j]);
            System.out.println(" ");
        }

        //задание №5**
        System.out.println(" ");
        System.out.println("Lessons 2_5");
        int[] array05 = new int[10];
        for (byte i = 0; i < array05.length; i++) // заполняем массив
        { array05[i] = (int) (Math.random()*100); // рандомно заполняем
            System.out.print(" " + array05[i]); //выводим посмотреть
        }
        int max = array05[0];
        int min = array05[0];
        for (byte i = 0; i < array05.length; i++)
        { if (array05[i] > max) max = array05[i];
        else if (array05[i] < min) min = array05[i];
        }
        System.out.println(" ");
        System.out.println("Максимальное значение элемента в массиве №5 = " +max);
        System.out.println("Минимальное значение элемента в массиве №5 = " +min);

        //задание №6**
        System.out.println(" ");
        System.out.println("Lessons 2_6");
        int[] array06 = new int[]{1,2,3,0,1,5};
        boolean balance;
        balance = checkBalance(array06);
        System.out.println(balance);

        //задание №7****
        System.out.println(" ");
        System.out.println("Lessons 2_7*");
        int array2[] = new int[]{0,1,2,3,4,5,6,7,8,9};
        System.out.println("Первоначальный массив: ");
        showArrayInt(array2);
        System.out.println("Введите число на которое нужно сдвинуть элементы: ");
        int delta = new Scanner(System.in).nextByte();
        array2 = arrayMove(array2,delta);
        System.out.println("Сдвинутый массив: ");
        showArrayInt(array2);
    }
    public static int[] arrayMove (int[] array, int delta){
        if (delta == 0){return array;}
        else if (delta > 0){
            if (delta > array.length) delta %= array.length; //как бы меньше пересчитывать если число большое
            int bufferElement;
            for (byte j = 0; j < delta; j++)
            {
                bufferElement = array[array.length-1];
                for (byte i = (byte) (array.length-1); i > 0; i--)
                    array[i] = array[i-1];
                array[0] = bufferElement;
            }
        }
        else if (delta < 0)
        {
            int bufferElement;
            delta*=-1;
            if (delta > array.length) delta %= array.length; //как бы меньше пересчитывать если число большое
            for (byte j = 0; j < delta; j++)
            {
                bufferElement = array[0];
                for (byte i = 0; i < array.length-1; i++)
                    array[i] = array[i+1];
                array[array.length-1] = bufferElement;
            }
        }
        return array;
    }

    public static void showArrayInt (int[] array){
        for (byte i=0; i<array.length;i++)
            System.out.print(" " + array[i]);
        System.out.println(" ");
    }

    public static void showArrayByte (byte[] array){
        for (byte i=0; i<array.length;i++)
            System.out.print(" " + array[i]);
        System.out.println(" ");
    }

    public static boolean checkBalance(int array06[]){
        for (byte i=0; i < array06.length; i++)
        {
            int sumLeft = 0;
            int sumRight = 0;
            for (byte j = 0; j <= i; j++)
            {sumLeft += array06[j];}
            for (byte j = (byte) (array06.length-1); j > i; j--)
            {sumRight += array06[j];}
            if (sumLeft == sumRight)
                return true;

        }
        return false;
    }
}