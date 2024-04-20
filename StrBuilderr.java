import java.util.*;
public class StrBuilderr {
public static void main(String args[]){

        /*StringBuilder: It is a class used as string, basically it  is a string which is 
         more optimized and opperations like adding, deleting etc can be done using 
         StringBuilder. StringBuilder takes less time to show results so whenever we
         face a modification problem we use StringBuilder instead of string.*/

        // StringBuilder sb = new StringBuilder("Akarsh");
        // System.out.println(sb);

        // //charAt index 0
        // System.out.println(sb.charAt(0));
        // //Akarsh
        // // A

        // //set char at index
        // //sb.setCharAt(0,'P');
        // //System.out.println(sb);
        // // Akarsh
        // //A
        // //Pkarsh

        // //Insert
        // sb.insert(3,'P');
        // System.out.println(sb);
        // //Akarsh
        // //A
        // //AkaPrsh

        // //Delete the extra 'P'
        // sb.delete(3, 4);
        // System.out.println(sb);
        //  /* Akarsh
        //     A
        //     AkaPrsh
        //     Akarsh */

        //append: use to add value at the end
        StringBuilder sb1 = new StringBuilder("A");
        sb1.append("k");
        sb1.append("a");
        sb1.append("r");
        sb1.append("s");
        sb1.append("h");
        System.out.println(sb1);
        System.out.println(sb1.length());
        //Akarsh
        //6
        

    }    
}
