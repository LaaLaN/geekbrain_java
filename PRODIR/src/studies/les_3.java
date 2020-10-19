package studies;

import java.util.*;

public class les_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int playAgain = 0;
        while (playAgain == 0) {
            System.out.println("Ваша задача - угадать число от 0 до 100.");
            guessGame();
            System.out.println("\nСыграть еще разок?\nВведите 1 - если 'нет'; 0 - если 'да'");
            playAgain = scanner.nextInt();
        }
    }

    public static void guessGame() {
        int tryCount = 0, maxTryCount = 7;
        int playerAnswer;
        int answer = (int) (Math.random() * 100);
        for (tryCount = 1; tryCount <= maxTryCount; tryCount++) {
            playerAnswer = scanner.nextInt();
            if (playerAnswer == answer) {
                System.out.println("*** Вы угадали! ***");
                break;
            } else if (playerAnswer > answer) System.out.println("Загаданное число МЕНЬШЕ.");
            else System.out.println("Загаданное число БОЛЬШЕ");

        }
    }

}