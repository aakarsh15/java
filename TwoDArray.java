//Q) Take a matrix as input from the user. Search for a given number x and print the indicies at which itb occurs.
import java.util.*;
public class TwoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int columns = sc.nextInt();
        int [] [] numbers = new int[rows] [columns];

        //row
        for( int i = 0; i < rows; i++ ){
            //columns
            for( int j = 0; j < columns; j++ ){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter number to be found: ");
        int x = sc.nextInt();

        for( int i = 0; i < rows; i++ ){
            for( int j = 0; j < columns; j++){
                //compare with x
                if(numbers[i][j] == x){
                    System.out.print("Given Number found at location (" + i +"," + j + " )" );
                }
                else{
                    System.out.print("Given number not found in the matrix ");
                }
            }
        }
    }
}
