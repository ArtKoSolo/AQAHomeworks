package Homework10;


import java.util.HashMap;
import java.util.Map;

public class Homework {
   public static void main(String[] args) {
      Map<Integer, String> sample = new HashMap<> ();
      sample.put (3, "value 3");
      sample.put (1, "value 1");
      sample.put (2, "value 2");
      for (Map.Entry<Integer, String> l:sample.entrySet ()) {
         System.out.println (l);
      }
   }
}
