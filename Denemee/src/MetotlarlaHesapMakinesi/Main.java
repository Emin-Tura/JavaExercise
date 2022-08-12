package MetotlarlaHesapMakinesi;

import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Cikarma : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Carpma : " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("Bolum 0 dan farklı olmalı...");
        }
        int result = a / b;
        System.out.println("Cikarma : " + result);
        return result;
    }

    static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calcRect(int a, int b) {
        System.out.println("Cevresi : " + (2 * (a + b)));
        System.out.println("Alani : " + (a * b));
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";

        System.out.println(menu);
        while (true) {
            System.out.print("Bir Islem Giriniz : ");
            select = input.nextInt();

            if (select == 0) {
                break;
            }
            System.out.print("Birinci Sayiyi Giriniz :");
            int n1 = input.nextInt();
            System.out.print("Ikinci Sayiyi Giriniz :");
            int n2 = input.nextInt();

            switch (select) {
                case 1:
                    sum(n1, n2);
                    break;
                case 2:
                    minus(n1, n2);
                    break;
                case 3:
                    times(n1, n2);
                    break;
                case 4:
                    divided(n1, n2);
                    break;
                case 5:
                    System.out.println("Us Hesabi :" + pow(n1, n2));
                    break;
                case 6:
                    System.out.println("Mod Hesabi :" + mod(n1, n2));
                    break;
                case 7:
                    calcRect(n1, n2);
                    break;
                default:
                    System.out.println("Gecersiz Islem Girdiniz");
            }
        }


    }


}
