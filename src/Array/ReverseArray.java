package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] reverseArray = new int[array.length];
        for (int a = 0; a < array.length; a++) {
            reverseArray[a] = array[array.length - 1 - a];

        }
        System.out.println(Arrays.toString(reverseArray));
    }




}
