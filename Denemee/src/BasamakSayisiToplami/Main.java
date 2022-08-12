package BasamakSayisiToplami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz :");
        int number = input.nextInt();


        int tempNumber = number;
        int basCounter = 0;
        int basValue;
        int total = 0;

//
//        while (tempNumber != 0) {
//            tempNumber /= 10;
//            basCounter++;
//        }
//        tempNumber = number;
//        for (int i = 1; i <= basCounter; i++) {
//
//            basValue = tempNumber % 10;
//            tempNumber /= 10;
//            total += basValue;
//            System.out.print(basValue + " + ");
//
//        }
//        System.out.print(" ==> " + total);
//


        // Diger Yol

        int toplam = 0;
        while (number != 0) {
            System.out.println(number);
            toplam += (number % 10);
            number /= 10;
        }

        System.out.println("Basamak Toplami: " + toplam);

    }
}
