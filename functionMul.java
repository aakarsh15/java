import java.util.*;
public class functionMul {
    public static int calculateProduct(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Product of two numbers is: "+ calculateProduct(a, b));
    }
    
}
