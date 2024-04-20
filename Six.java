import java.util.*;
public class Six {
    public static void main ( String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of BUTTON: ");
        int button = sc.nextInt();
        switch(button) {
            case 1 : System.out.println("HELLO");
            break;
            case 2 : System.out.println("NAMASTE");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
        }

    }
}