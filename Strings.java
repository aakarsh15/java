import java.util.*;
public class Strings {
    public static void main(String args[]){
       // String firstName = "Akarsh";
       // String lastName = "Singh";
       // String fullName = firstName + " " + lastName;
        //System.out.println(fullName); //Akarsh Singh
        //System.out.println(fullName.length()); //12
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1.name: ");
        String name1 = sc.next();
        System.out.print("Enter your 2.name: ");
        String name2 = sc.next();

        //charAt

        /* for(int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        } */
         /* 12
            A
            k
            a
            r
            s
            h

            S
            i
            n
            g
            h 
         */

         //compare
         // String name1 = "Akarsh";
         // String name2 = "Akarsh";
         
         //1) s1 == s2 : 0
         //2) s1  > s2  : +ve
         //3) s1  < s2  : -ve
        
         /* Example : hello < Hello
                      hello < wello
                      hello > cello
                      a < c
                      z > a
                      Akarsh < Akarsh2
          */
         if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
         }
            else{
                System.out.println("Strings are not equal");
            }
         }
         
    }
    

