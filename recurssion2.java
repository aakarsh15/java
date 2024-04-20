import java.util.*;
public class recurssion2 {
    public static int Calcfactorial(int n){
        if( n == 1 || n == 0 ){
            return 1;
        }
        int fact_n1= Calcfactorial(n-1);
        int fact_n = n * fact_n1;
        return fact_n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Factorial of: ");
        int n = sc.nextInt();
        int ans = Calcfactorial(n);
        System.out.println(ans);

    }
    
}
