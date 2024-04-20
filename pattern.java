/*Q1) Print The pattern:
        *****
        *****
        *****
        *****
     */
import java.util.*;
public class pattern{
    public static void main ( Strings args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();

        //Nested Loops
        //outer loop

         //Ans 1)

        /* for( int i = 1; i <= n; i++ ){
            //inner loop
            for( int j = 1; j <= m; j++ ){
                System.out.print("*");
            }
            System.out.println();

        }*/


/*Q2) Print The Pattern:
        *****
        *   *
        *   *
        *****
 */  
            //Ans 2)

            // Outer loop
           /* for( int i = 1; i <= n; i++){
                //Inner Loop
                for( int  j = 1; j <= m; j++){
                    //cell-> (i,j)
                    if( i == 1 || j == 1 || i == n || j == m){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }    
                System.out.println();
            }
           
           */


 /*Q3)  Print the pattern 
        *
        **
        ***
        ****
 */
               /* for( int i = 1 ; i <= n ; i++){
                    for( int j = 1; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();

                } */
            
/*Q4) ****
      ***
      ** 
      *
 */                   
             /*  for( int i = n ; i >= 1 ; i--){
                    for( int j = 1; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
    
    }
     */ 
     
/*Q5)       *
           **
          ***
         ****  
  */
  for(int i=1; i<=n; i++){
    
  }


  }
}

