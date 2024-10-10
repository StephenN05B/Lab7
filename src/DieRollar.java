import java.util.Random;
import java.util.Scanner;

public class DieRollar {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int die1, die2, die3, rollCount;
        String userInput;

        do {
            rollCount = 0;

            System.out.println("Roll" + "       Die1" + "       Die2" + "       Die3" +"       Sum");
            System.out.println("----------------------------------------------------------");

            do {
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                rollCount++;

                System.out.printf("%-10d %-10d %-10d %-10d %-10d%n", rollCount, die1, die2, die3, sum);

            } while (!(die1 == die2 && die2 == die3));


            System.out.println("Would you like to roll again? (y/n): ");
            userInput = scanner.nextLine();

        } while (userInput.equalsIgnoreCase("y"));

        scanner.close();
        System.out.println("Goodbye!");
    }
}
