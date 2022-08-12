package MukemmelSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz :");
        int number = input.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }

        }
        if (number == total) {
            System.out.println("Girdiginiz " + number + " Sayisi Mukemmel Bir Sayidir. :)");
        } else {
            System.out.println("Girdiginiz " + number + " Sayisi Mukemmel Sayi Degildir. :(");

        }


    }
}
