package Array;
import java.util.*;
public class ArrayElements {
    public static void main(String[] args) {
int[] nums = new int[100];
for (int i = 1; i <= 100; i++) {
    nums[i-1] = i;

}
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");

        }
        System.out.println();
        for (int i = nums.length-1; i>=0  ; i--) {
            System.out.print(nums[i] + " ");

        }


    }
}