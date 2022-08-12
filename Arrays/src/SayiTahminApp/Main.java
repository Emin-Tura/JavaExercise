package SayiTahminApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = (int) (Math.random() * 100);
        System.out.println(random);
        int hak = 5;

        while (hak > 0) {
            System.out.print("0-100 Arasinda Bir Sayi Giriniz : ");
            int number = input.nextInt();
            if (number < 0 || number > 100) {
                System.out.println("Hatali Sayi Girdiniz...");
                hak--;
            } else {
                if (number > random) {
                    System.out.println("Asagi");
                    hak--;
                } else if (number < random) {
                    System.out.println("Yukari");
                    hak--;
                } else {
                    System.out.println("Tebrikler Dogru Tahmin...");
                    break;
                }
            }
        }

        if (hak == 0) {
            System.out.println("Hakkiniz Bitmistir....");
            System.out.println("Sayi :" + random);
        }
    }
}
