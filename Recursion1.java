import java.util.*;
public class Recursion1{ //Recurssion: A function that call itself.
    public static void printNum(int n){
        if( n == 0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String args[]){
           int n = 5;
           printNum(n);// n=5
    }
}
//sum of n natural numbers