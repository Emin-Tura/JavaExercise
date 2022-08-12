package DiziyeEnYakinSayi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] MyArrayList = {15, 12, 788, 1, -1, -778, 2, 0,3};
        System.out.println(Arrays.toString(MyArrayList));

        for (int k : MyArrayList) {
            System.out.print(k);
            System.out.print(" , ");
        }
        Arrays.sort(MyArrayList);

        System.out.println();
        System.out.print("Enter Value:  ");
        int near_number = input.nextInt();

        int minvalue = MyArrayList[0];
        int maxvalue = MyArrayList[0];

        for (int i : MyArrayList) {
            if (i < near_number) {
                minvalue = i;
            }
            if (i > near_number) {
                maxvalue = i;
                break;
            }
        }
        System.out.println("Near Value Min:  " + minvalue);
        System.out.println("Near Value Max:  " + maxvalue);


    }
}
