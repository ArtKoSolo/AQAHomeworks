package Homework11;


import java.util.HashMap;
import java.util.Map;

public class Homework {
   public static void main(String[] args) {
      Map<Integer, String> sample = new HashMap<> ();
      sample.put (3, "value 3");
      sample.put (1, "value 1");
      sample.put (2, "value 2");
      sample.put (8, "value 8");
      sample.put (6, "value 6");
      sample.put (5, "value 5");
      sample.put (4, "value 4");
      sample.put (7, "value 7");
      for (Map.Entry<Integer, String> l:sample.entrySet ()) {
         System.out.println (l);
      }
   }
}
