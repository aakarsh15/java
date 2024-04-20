import java.util.*;

public class Three {
    public static void main ( Strings args[]){
        System.out.print("Select the age: ");
        Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();

            if(age > 18)
            {
                System.out.println("Adult");
            }
            else{
                System.out.println("Not Adult");
            }

    }
}
