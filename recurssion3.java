import java.util.*;

public class recurssion3 {
    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1);
    }

    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci series elements: ");
        int n = sc.nextInt();
        printFib(a, b, n - 2);
    }
}
