// PerfectNumber.java
// Kameron Ibraheem
// Lab03: PerfectNumber
//
//
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take a integer from the user
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        //  variable to store the sum of divisors
        int sumDiv = 0;

        // calculate the sum of divisors
        for (int i = 1; i < userInput; i++) {
            if (userInput % i == 0) {
                sumDiv += i;  // add the divisor to the sum
            }
        }

        // check if the sum of divisors equals the userinput
        if (sumDiv == userInput) {
            System.out.println(userInput + " is a perfect number!");
        } else {
            System.out.println(userInput + " is not a perfect number.");
        }

    }
}
