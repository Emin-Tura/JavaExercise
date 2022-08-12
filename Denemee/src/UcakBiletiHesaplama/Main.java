package UcakBiletiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance, unitPrice = 0.1, dctPrice, dctAge, purePrice, dctDirection;
        int age, direction;

        System.out.print("Mesafeyi Km Turunde Giriniz : ");
        distance = input.nextDouble();

        System.out.print("Yasinizi Giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (1 ==> Tek Yon / 2 ==> Cift Yon) : ");
        direction = input.nextInt();

        purePrice = distance * unitPrice;
        dctPrice = purePrice;


        if ((0 < distance && age > 0) && (direction == 1 || direction == 2)) {
            if (age < 12) {
                dctAge = purePrice * 0.5;
                dctPrice = purePrice - dctAge;
            } else if (age <= 24 && age >= 12) {
                dctAge = purePrice * 0.1;
                dctPrice = purePrice - dctAge;
            } else if (age >= 65) {
                dctAge = purePrice * 0.3;
                dctPrice = purePrice - dctAge;
            }
            if (direction == 1) {
                System.out.print("Toplam Tutar : " + dctPrice + " TL");
            } else {
                dctDirection = dctPrice * 0.2;
                dctPrice = (dctPrice - dctDirection) * 2;
                System.out.print("Toplam Tutar : " + dctPrice + " TL");
            }
        } else {
            System.out.println("Hatali Veri Girdiniz!!!");
        }
    }
}
