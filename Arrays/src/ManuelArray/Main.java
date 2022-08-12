package ManuelArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Giriniz : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print((i + 1) + ". Elemani giriniz :");
            int value = input.nextInt();
            arr[i] = value;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
