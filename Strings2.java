import java.util.*;
public class Strings2 {
public static void main(String[] args){

    //using substring:
    
    //String sentence = "My name is Akarsh";
    //substring (begining index, end index)
    //String name = sentence.substring(11, sentence.length());
    //System.out.println(name); //Akarsh
    String sentence = "AkarshSingh";
    String name = sentence.substring(0, 6); //Akarsh
    //String name = sentence.substring(0,sentence.length()); //AkarshSingh
    //String name = sentence.substring(6,sentence.length()); //Singh
    //OR  String name = sentence.substring(6); //Singh
    System.out.println(name);

    }
}

//STRING ARE IMMUTABLE i.e THEY CANT BE CHANGED ONCE STORED IN MEMORY.