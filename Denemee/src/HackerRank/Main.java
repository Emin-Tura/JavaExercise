package HackerRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz :");
        int n = input.nextInt();

        int total = 0;
        for (int i = 1; i <= 10; i++) {
            if (n >= 2 && n <= 20) {
                total = n * i;
                System.out.println(n + " x " + i + " =" + total);

            }else {
                System.out.println("Gecersiz Sayi Girdiniz...");
                break;
            }
        }


    }
}
