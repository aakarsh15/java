import java.util.*;
public class Array {
    public static void main(String args[]){
        
        //Array:
        //int marks [] = new int[3];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;

        //user input:
        Scanner sc = new Scanner(System.in);
        System.out.print("Total no of subjects: ");
        int size = sc.nextInt();
        int marks[] = new int[size];

        
        // System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        //input
       for( int i = 0; i < size; i++){
        System.out.print("marks: ");
        marks[i] = sc.nextInt();
       }
       //output
        for( int i = 0; i < size; i++){
            System.out.println("Marks are: " + marks[i]);
        }

    }
    
}
