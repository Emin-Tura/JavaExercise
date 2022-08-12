package HarmonikSeri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {11,4,6,8};

        double harmSeri = 0;
        double harmOrt = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = arr[i]; j <= arr[i]; j++) {
                harmSeri += Math.pow(j, -1);
                harmOrt = arr.length / harmSeri;
            }
        }
        System.out.println("Harmonik Ortalama : " + harmOrt);


    }


}
