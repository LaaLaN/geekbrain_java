package studies.les4;

import java.util.Scanner;
import java.util.Random;

public class xoGame {

    static final int Size_form = 5;
    static final char player1 = '0';
    static final char pcgamer = 'X';
    static final char NULL = '!';
    static Scanner insert = new Scanner(System.in);
    //static Random random = new Random();
    static final char[][] form = new char[Size_form][Size_form];

    static void initField() {
        for (int i = 0; i < Size_form; i++) {
            for (int j = 0; j < Size_form; j++) {
                form[i][j] = NULL;
            }
        }
    }

    static void printField() {
        for (int i = 0; i < Size_form; i++) {
            for (int j = 0; j < Size_form; j++) {
                System.out.print(form[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void movePlayer1() {
        int x, y;
        do {
            x = insert.nextInt() - 1;
            y = insert.nextInt() - 1;
        } while (!isCellValid(x, y));
        form[y][x] = player1;
    }

    static void movePlayer2() {
        int x, y;
        do {
            x = insert.nextInt() - 1;
            y = insert.nextInt() - 1;
        } while (!isCellValid(x, y));
        form[y][x] = pcgamer;
    }

    static boolean isCellValid(int x, int y) {
        if (form[y][x] == NULL) return true;
        if (x < 0 || x >= Size_form || y < 0 || y >= Size_form) return false;
        return false;
    }


    static boolean isFreeSpace(){
        for (int i = 0; i < Size_form; i++){
            for (int j = 0; j < Size_form; j++){
                if (form[i][j] == NULL) return false;
            }
        }
        return true;
    }

    static boolean checkWin(char sym){
        for (int i = 0; i < Size_form; i++){
            int result = 0;
            for (int j = 0; j < Size_form; j++){
                if (form[i][j] == sym) result++;
            }
            if (result == Size_form) return true;
        }
        for (int i = 0; i < Size_form; i++){
            int result = 0;
            for (int j = 0; j < Size_form; j++){
                if (form[j][i] == sym) result++;
            }
            if (result == Size_form) return true;
        }
        int first = 0; // проверка диагонали
        for (int i = 0; i < Size_form; i++){ // проверка диагонали
            for (int j = 0; j < Size_form; j++){ // проверка диагонали
                if (j==i && form[i][j] == sym) first++; // проверка диагонали

            }
        }
        if (first == Size_form) return true; // проверка диагонали
        int second = 0;
        for (int i = 0, j = Size_form-1; i < Size_form && j >=0; i++, j--)
        { if (form[i][j] == sym) second++; }
        if (second == Size_form) return true;
        else return false;
    }

    public static void main(String[] args) {
        initField();
        printField();
        while(true){
            movePlayer1();
            printField();
            if (checkWin(player1)){
                System.out.println("Игрок 1 победил!");
                break;
            }
            if (isFreeSpace()){
                System.out.println("Ничья");
                break;
            }
            movePlayer2();
            System.out.println();
            printField();
            if (checkWin(pcgamer)){
                System.out.println("Игрок 2 победил!");
                break;
            }
            if (isFreeSpace()){
                System.out.println("Ничья");
                break;
            }
        }
    }
}












