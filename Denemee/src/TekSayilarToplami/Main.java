package TekSayilarToplami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int total = 0, number;

        //Kullanıcının girdiği sayıdan tek sayıları toplayan

//        while (number>0){
//            for (int i=1;i<number;i++){
//                if(!(i%2==0)){
//                    System.out.println("Tek Sayilar :" + i);
//                    total +=i;
//                }
//            }
//            System.out.println("Total : " + total);
//            break;
//        }
//

        // negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
        // tek sayıları toplayıp ekrana basan programı yazıyoruz.


//
//        do {
//            System.out.print("Sayi Giriniz :");
//            number = input.nextInt();
//            if (number % 2 == 1) {
//                total += number;
//            }
//        } while (number > 0);
//
//        System.out.println("Total : " + total);


        // tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        do {
            System.out.print("Sayi Giriniz :");
            number = input.nextInt();

            if (number % 4 == 0) {
                total += number;
            }
        } while (number % 2 == 0);


        System.out.println("Total : " + total);


    }
}
