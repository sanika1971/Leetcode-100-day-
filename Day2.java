
import java.util.Scanner;

public class Day2 {

    public static boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            while (n % 2 == 0) {
                n = n / 2;
            }

            if (n == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean result = isPowerOfTwo(n);
        System.out.println(n + " is power of two: " + result);
    }
}
