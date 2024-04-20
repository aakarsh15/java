import java.util.*;
public class table {
    public static void main(String[] args) {
        System.out.print("Table of: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.print( n + " X " + i + " = " );
            System.out.println(n*i);    
        }
        
    }
    
}
