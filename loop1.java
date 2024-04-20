//Q1) Print Sum of n natural numbers
//Q2) Print the table of a number input by the user.
// 1 Ans)

import java.util.*;
public class loop1{
    public static void main ( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("N is: ");
        int n = sc.nextInt();

       /*  int sum = 0;
        
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
*/

// 2 Ans)

for(int i = 1; i < 11; i++){
    System.out.println(i * n);

}
    }
}