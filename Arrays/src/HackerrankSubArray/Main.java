package HackerrankSubArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Dizi Uzunlugunu Giriniz :");
        int n = input.nextInt();
        int[] arr = new int[n];
        int total = 0;
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + (". elemani giriniz :"));
            int value = input.nextInt();
            arr[i] = value;
        }

        for (int j = 0; j < n; j++) {
            System.out.println("j :" + j);
            int sum = 0;
            for (int k = j; k < n; k++) {
                System.out.println("k :" + arr[k]);
                sum += arr[k];
                System.out.println("Sum :" + sum);
                if (sum < 0) {
                    count++;
                }
            }
        }


        System.out.println(Arrays.toString(arr) + " ");
        System.out.println("Toplam :" + total);
        System.out.println(count);
    }
}
