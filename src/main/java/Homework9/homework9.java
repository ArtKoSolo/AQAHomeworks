package Homework9;

import java.util.*;

public class homework9 {
    public static void main(String[] args) {
    sentence ("butter, butter, sausage, milk.");

    }
    public static void sentence (String string){
        String[] strings = string.replace (",","").replace (".","").split (" ");
        Set<String> stringSet = new HashSet<> (Arrays.asList (strings));
        for (String sample : stringSet) {
            System.out.println (sample.substring (0,1).toUpperCase () + sample.substring (1));
        }
    }

}
