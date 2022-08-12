package HarmonikSeri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz :");
        int number = input.nextInt();
        double total = 0;

        for (int i = 1; i <= number; i++) {
            //  System.out.println(Math.pow(i,-1));
            total += Math.pow(i, -1);

            //alternatif
            //total += (1/i);
        }

        System.out.println(total);

    }
}
