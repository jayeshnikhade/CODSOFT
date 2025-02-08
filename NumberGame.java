import java.util.*;

public class Main {
    public static int generateNumber() {
        Random random = new Random();
        int min = 1, max = 15;  // Setting the range
        int randomNumber = random.nextInt((max - min) + 1) + min;

        System.out.println("Guess a number between " + min + " & " + max);
        return randomNumber;
    }

    public static int userGuess(int min, int max, int randomNumber) {
        Scanner sc = new Scanner(System.in);
        int guess, attempts = 0;

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < min || guess > max) {
                System.out.println("Invalid number! Please guess between " + min + " and " + max);
                continue;
            }

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed correctly in " + attempts + " attempts.");
                break;
            }

            int diff = Math.abs(guess - randomNumber);
            if (diff <= 2) {
                System.out.println("Very close! Try again.");
            } else if (diff <= 4) {
                System.out.println("High guess! Try again.");
            } else {
                System.out.println("Low guess! Try again.");
            }
        }
        return attempts;  // Returning the number of attempts
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0, roundsWon = 0;

        while (true) {
            int randomNumber = generateNumber();
            int attempts = userGuess(1, 15, randomNumber);

            // Scoring System: Fewer attempts = Higher Score
            int roundScore = Math.max(10 - attempts, 1); // Ensures at least 1 point
            score += roundScore;
            roundsWon++;

            System.out.println("Round Won! Score for this round: " + roundScore);
            System.out.println("Total Score: " + score + " | Rounds Won: " + roundsWon);

            System.out.println("\nDo you want to play again?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            int again = sc.nextInt();
            if (again == 2) {
                System.out.println("Game Over! Final Score: " + score + " | Total Rounds Won: " + roundsWon);
                break;
            }
        }
    }
}
