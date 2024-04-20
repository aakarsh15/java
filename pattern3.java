import java.util.*;
public class pattern3 {
    public static void main(String args[]){
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();

        for(int i=1; i<=n; i++){
            //spaces
            for ( int j = 1; j<=n-i; j++){
                System.out.print(" ");

            }
            //stars
            for( int j = 1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}