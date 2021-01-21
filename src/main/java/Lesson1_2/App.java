package Lesson1_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};

       //ArrayList arr1= arrList(<int> arr);


    }
   public static <T> ArrayList<T> arrList(T[] input) {

        return new ArrayList<T>(Arrays.asList(input));

    };
}
