  import java.util.Scanner;
public class Day3 {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 2; i <= n; i++) {
            int thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }

        return secondTerm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci number at position " + n + " is: " + fib(n));

        sc.close();
    }
}


