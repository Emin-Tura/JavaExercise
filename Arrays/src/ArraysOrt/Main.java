package ArraysOrt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 7, 8, 9,70};
        System.out.println(Arrays.toString(arr1));

        int sum = 0;
        for (int j : arr1) {
            sum += j;
        }

        System.out.println(sum/ arr1.length);
    }
}
