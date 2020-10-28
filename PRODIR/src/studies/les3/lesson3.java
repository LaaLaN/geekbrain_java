package studies.les3;

import java.util.Scanner;

public class lesson3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println("\n*** Игра - угадай число.");
        //guessGame();
        // для того что бы поиграть в первую игру, снимите комментарий
        System.out.println("\n*** Игра - угадай слово eng. version.");
        wordsGame();
    }

    public static void guessGame() {
        int playAgain = 0;
        while (playAgain == 0) {
            byte tryCount, maxTryCount = 7;
            int playerAnswer;
            System.out.println("Ваша задача - угадать число от 0 до 100. За " + maxTryCount + " попыток. Удачи!");
            byte answer = (byte) (Math.random() * 100); // загадываем число
            for (tryCount = 1; tryCount <= maxTryCount; tryCount++) {
                playerAnswer = scanner.nextByte();
                if (playerAnswer == answer) {
                    System.out.println("*** Вы угадали! ***");
                    break;
                } else if (playerAnswer > answer) System.out.println("Загаданное число МЕНЬШЕ.");
                else System.out.println("Загаданное число БОЛЬШЕ");
                if (tryCount == maxTryCount) System.out.println("Нет больше попыток. Вы проиграли.");
            }
            System.out.println("\nСыграть еще разок?\nВведите 1 - если 'нет'; 0 - если 'да'");
            playAgain = scanner.nextInt();

        }
    }

    public static void wordsGame() {
        byte protect = 0;
        char deltaWords[] = new char[]{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        byte n = (byte) (Math.random() * words.length);
        String quation = words[n]; //загадали слово
        System.out.println("Программа загадала слово.\nВаша задача угадать его. Удачи!");
        String answer = "";
        while (!(answer.equals(quation)) || protect > 50) {
            System.out.println("Введите слово:");
            //System.out.println("");
            answer = scanner.next(); // считываем ответ игрока
            while (!(answer.length() == quation.length())) {
                if (answer.length() < quation.length()) answer += "#"; // выравниваем массивы вопроса и ответа
                else {
                    byte delta = (byte) (quation.length() - answer.length());
                    StringBuffer buffer = new StringBuffer(answer);
                    buffer.delete(buffer.length() + delta, buffer.length());
                    answer = buffer.toString();
                    System.out.println(answer);
                }
            }
            answer = answer.toLowerCase(); // переводим в нижний регистр
            if (answer.equals(quation)) {
                System.out.println("Вы угадали! Красавчик(вица)!");
                break;
            } else {
                for (int i = 0; i <= answer.length() - 1; i++) {
                    if (answer.charAt(i) == quation.charAt(i)) {
                        deltaWords[i] = quation.charAt(i);
                    }
                }
                System.out.println("Загаданное слово: ");
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
