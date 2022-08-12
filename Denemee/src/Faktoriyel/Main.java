package Faktoriyel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//
//        int number,total=1;
//
//        System.out.print("Lutfen bir Sayi giriniz :");
//        number  = input.nextInt();


         //Faktöriyel
//        for (int i=1;i<=number;i++) {
//            total *=i;
//        }
//        System.out.print(total);


        //Kombinasyon

        //C(n,r) = n! / (r! * (n-r)!)

        int n, r, comb, totaln = 1, totalr = 1, totalnr = 1;

        System.out.println("C(n,r) bicimindeki n degerini giriniz: ");
        n = input.nextInt();
        System.out.println("C(n,r) bicimindeki r degerini giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++){
            totaln *= i;
        }

        for (int j = 1; j <= r; j++){
            totalr *=  j;
        }

        int nFarkR = n - r;

        for (int k = 1; k <= nFarkR; k++){
            totalnr *=  k;
        }

        comb = (totaln / (totalr * totalnr));

        System.out.println("C(" + n + "," + r + ") = " + comb);







    }
}
