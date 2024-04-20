import java.util.*;
public class Function{
    public static int  calculateSum ( int a, int b ){
        int sum = a + b;
        return sum;

    }
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("The value of a is: ");
        int a = sc.nextInt();
        System.out.print("The value of b is: ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of the two numbers is: "+ sum);

    }

}