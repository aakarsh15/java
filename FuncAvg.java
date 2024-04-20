import java.util.*;
public class FuncAvg{
    public static int  calculateAvg ( int a, int b, int c ){
        int avg = (a + b + c) / 3 ;
        return avg;
    }
    public static void main( Strings args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("The value of a is: ");
        int a = sc.nextInt();
        System.out.print("The value of b is: ");
        int b = sc.nextInt();
        System.out.print("The value of c is: ");
        int c = sc.nextInt();

        int avg = calculateAvg(a, b, c);
        System.out.println("Avg of the three numbers is: "+avg);

    }

}