    import java.util.Scanner;
import java.util.Random;
    public class Lesson05Program01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int minNumber = 0;
            int maxNumber = 10;
            int secretNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

            System.out.println("Вгадайте число від " + minNumber + " до " + maxNumber);
            int attemptsLeft = 5;
            while (attemptsLeft > 0) {
                System.out.print("Ваш варіант: ");
                int userGuess = scanner.nextInt();
                if (userGuess == secretNumber) {
                    System.out.println("Ви вгадали! Загадане число: " + secretNumber);
                    break;
                } else {
                    attemptsLeft--;
                    if (attemptsLeft > 0) {
                        System.out.println("Невірно. Залишилося спроб: " + attemptsLeft);
                    } else {
                        System.out.println("Ви не вгадали. Загадане число: " + secretNumber);
                    }
                }
            }

            scanner.close();
        }
    }
