import java.util.Random;
import java.util.Scanner;

public class CWH20_Exercise {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rock Paper Scissors game. Choose 1 for Rock, 2 for Scissors, and 3 for Paper.");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
i
        // Validate user input
        if (user < 1 || user > 3) {
            System.out.println("Invalid input. Please choose 1, 2, or 3.");
            return;
        }

        switch (user) {
            case 1 -> System.out.println("You have chosen Rock");
            case 2 -> System.out.println("You have chosen Scissors");
            case 3 -> System.out.println("You have chosen Paper");
        }

        Random ra = new Random();
        int compu = ra.nextInt(3) + 1; // Generates a number between 1 and 3

        switch (compu) {
            case 1 -> System.out.println("Computer has chosen Rock");
            case 2 -> System.out.println("Computer has chosen Scissors");
            case 3 -> System.out.println("Computer has chosen Paper");
        }

        // Determine the winner
        if (user == compu) {
            System.out.println("It's a Draw");
        } else if ((user == 1 && compu == 2) || (user == 2 && compu == 3) || (user == 3 && compu == 1)) {
            System.out.println("You Won");
        } else {
            System.out.println("Computer has won");
        }
    }
}
