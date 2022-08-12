package AmstrongSayilar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int basValue;
        int tempNumber = number; //gecici number
        int basPow;
        int result = 0;

//            1-Sayi Gir
//            2-Basamak Sayisini Ogren
//            3-Sayıyı Basamaklarina Ayir
//            4-Ayirdigin rakamlari basamak sayisiyla us al
//            5-Bunlari topla
//            6-Esitlik Kontrolu Yap


        //Basamak Sayisi
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " Sayisi bir Armstrong sayidir.");
        } else {
            System.out.println(number + " Sayisi bir Armstrong Sayisi degildir.");
        }


    }
}
