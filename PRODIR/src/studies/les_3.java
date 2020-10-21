package studies;

import java.util.*;

public class les_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n*** Игра - угадай число.");
        guessGame();
        System.out.println("\n*** Игра - угадай слово eng. version.");
        wordsGame();
    }

    public static void guessGame() {
        int playAgain = 0;
        while (playAgain == 0) {
            System.out.println("Ваша задача - угадать число от 0 до 100.");
            byte maxTryCount = 7;
            int playerAnswer;
            byte answer = (byte) (Math.random() * 100); // загадываем число
            for (byte tryCount = 1; tryCount <= maxTryCount; tryCount++) {
                playerAnswer = scanner.nextByte();
                if (playerAnswer == answer) {
                    System.out.println("*** Вы угадали! ***");
                    break;
                } else if (playerAnswer > answer) System.out.println("Загаданное число МЕНЬШЕ.");
                else System.out.println("Загаданное число БОЛЬШЕ");
            }
            System.out.println("\nСыграть еще разок?\nВведите 1 - если 'нет'; 0 - если 'да'");
            playAgain = scanner.nextInt();
        }
   scanner.close(); }

    public static void wordsGame() {
        byte protect = 0;
        char deltaWords[] = new char[]{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        byte n = (byte) (Math.random() * words.length);
        String quation = words[n]; //загадали слово
        System.out.println("Программа загадала слово до " + quation.length() + " символов.\nВаша задача угадать слово.");
        String answer = "";
        while (!(answer.equals(quation)) || protect > 50) {
            System.out.println("Введите слово:");
            answer = scanner.nextLine(); // считываем ответ игрока
            while (!(answer.length() == quation.length())) {
                System.out.println("Недопустимое количество символов!\nНапоминаю длинна слова <= " + quation.length() + " символов.");
                answer = scanner.nextLine(); // считываем ответ игрока
            }
            answer = answer.toLowerCase(); // переводим в нижний регистр
            if (answer.equals(quation)) {
                System.out.println("Вы угадали! Красавчик(вица)!");
                break;
            } else {
                for (int i = 0; i <= answer.length() - 1; i++) {
                    if (answer.charAt(i) == quation.charAt(i)) {
                        deltaWords[i] = quation.charAt(i);
                        //System.out.println(i + " " + quation.charAt(i));
                    }
                }
                printword(deltaWords);
                System.out.println("\nПродолжайте угадывать.");
            }
            protect++;
        }
        scanner.close();
    }

    private static void printword(char[] deltaWords) {
        for (char i : deltaWords) {
            System.out.print(i);
        }
    }
}