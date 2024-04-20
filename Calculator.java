import java.util.*;
public class Calculator {
    public static void main ( String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("1. Div, 2. Mul, 3. Add, 4. Sub: ");
        int option = sc.nextInt();
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        int div = a / b;
        int mul = a * b;
        int add = a + b;
        int sub = a - b; 

       /* if ( option == 1){
            System.out.println(div);

        }
        else if (option == 2){
            System.out.println(mul);
        }
        else if( option == 3){
            System.out.println(add);
        }
        else if (option == 4){
            System.out.println(sub);
        }
        else{
            System.out.println("Invalid Choice");
        }*/

        switch(option) {
            case 1 : System.out.println(div);
            break;
            case 2 : System.out.println(mul);
            break;
            case 3 : System.out.println(add);
            break;
            case 4 : System.out.println(sub);
            break;
            default : System.out.println("Invalid Choice");
        
        }
    }
  }