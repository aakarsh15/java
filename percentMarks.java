import java.util.*;
public class percentMarks {
    public static void main(String args[]){
        Scanner marks = new Scanner(System.in);
        System.out.print("Marks of english: ");
        int m1 = marks.nextInt();
        System.out.print("Marks of Hindi: ");
        int m2 = marks.nextInt();
        System.out.print("Marks of SST: ");
        int m3 = marks.nextInt();
        System.out.print("Marks of Science: ");
        int m4 = marks.nextInt();
        System.out.print("Marks of Maths: ");
        int m5 = marks.nextInt();

        double percentage = ((m1+m2+m3+m4+m5)/500.0) * 100;
        System.out.println("Percentage of Subjects is: " + percentage + "%");


    }
}