//reversing the string
import java.util.Scanner;

public class recurssion5 {
    // public static void printRev ( String str, int idx ){
    //     if(idx == 0 ){
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }
    //     System.out.print(str.charAt(idx));
    //     printRev(str, idx-1);

    // }
    // public static void main (String args []){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("The lined to be reversed: ");
    //     String str = sc.nextLine();
    //     printRev(str, str.length()-1);
    // }
    
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] <= arr[idx + 1]) {
            // array is sorted till now
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Is the array sorted? " + isSorted(arr, 0));
    }
}