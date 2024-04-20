//tower of hanoi
import java.util.*;

public class recurssion4 {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1) {
            System.out.println("Transfer disk 1 from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper); //from source to helper using destination as helper in this step
        System.out.println("Transfer disk " + n + " from " + src + " to "+ dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n, "Source", "Helper", "Destination");
    }
}
