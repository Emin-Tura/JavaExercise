package GirilenSayiyaKadarXinKuvetti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Bir Sayi Giriniz :");
        number = input.nextInt();



        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        for (int i=1;i<=number;i*=4){
            System.out.println(i);
        }
        for (int i=1;i<=number;i*=5){
            System.out.println(i);
        }



    }
}
