package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * 
     * @param amount  loan amount
     * @return Remaining loan amount
     */
    static int getRemainingAmountIn3Months(int amount) {

        // Calculate the remaining loan amount after 3 months
        int remainingAmount = amount;
        for (int i = 0; i < 3; i++) {
            //remainingAmount *= (1 - 0.1);
            remainingAmount = (int)(Math.ceil(remainingAmount * 0.9));
        }

        // Return the remaining loan amount
        return remainingAmount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
