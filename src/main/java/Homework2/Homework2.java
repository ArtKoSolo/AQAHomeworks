package Homework2;

import java.util.Arrays;
import java.util.Random;

public class Homework2 {

        public static void main(String[] args) {

//      Task #1:
            int length = 20;
            int[] massive = new int[length];
            Random random = new Random();
            for (int i = 0; i < massive.length; i++) {
                massive[i] = random.nextInt( -100,100);
            }
            System.out.println(Arrays.toString(massive));
// Task #2:
            int sum = 0;
            for (int i = massive.length - 1; i >= 0; i--) {
                if (massive[i] % 2 == 0) {
                    System.out.println(i + 1 + " even number " + massive[i]);
                }
                if(massive[i] > 5 && massive[i] < 45){
                    sum += massive[i];
                };
//Task #3:
            }
            System.out.println("\nСумма чисел в диапазоне 5 - 45: " + sum);
        }
    }
