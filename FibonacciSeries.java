import java.util.Scanner;
class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci Series:");
        int a = 0;
        int b = 1;

        for (int i = 1; i <= numTerms; ++i) {
            System.out.print(a + " ");

            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}
