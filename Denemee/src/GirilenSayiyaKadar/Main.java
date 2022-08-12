package GirilenSayiyaKadar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz :");
        int number = input.nextInt();
        int total = 0,ort,sayac = 0;


//        for (int i = 1; i<=number; i++){
//            if (i%2==0){
//                System.out.println(i);
//            }
//        }

        for (int i=1; i<=number;i++){
            if (i%3==0 && i%4==0){
                total +=i;
                sayac++;
            }
        }

        System.out.println("Total :"+total);
        System.out.println("Ort :"+total/(sayac));



    }
}
