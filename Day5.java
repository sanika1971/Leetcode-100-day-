
import java.util.Scanner;

public class Day5 {

    public class Solution {

        public static int numWaterBottles(int numBottles, int numExchange) {
            int ans = numBottles;

            while (numBottles >= numExchange) {
                int newBottles = numBottles / numExchange;
                int remBottles = numBottles % numExchange;

                ans = ans + newBottles;
                numBottles = newBottles + remBottles;
            }

            return ans;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of bottles: ");
            int numBottles = sc.nextInt();

            System.out.print("Enter exchange rate: ");
            int numExchange = sc.nextInt();

            int result = numWaterBottles(numBottles, numExchange);
            System.out.println("Total bottles you can drink: " + result);

            sc.close();
        }
    }

}
