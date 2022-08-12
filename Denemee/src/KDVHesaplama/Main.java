package KDVHesaplama;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV
        oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

        double price,kdvPrice,totalPrice;

        System.out.print("Lutfen Fiyat Giriniz : ");
        price = input.nextDouble();

        kdvPrice = price < 1000 && price > 0 ? price*0.18 : price *0.08;

        System.out.println("KDV Tutari : " + kdvPrice + " TL");

        totalPrice =price+kdvPrice;

        System.out.println("KDV'li Tutar : " + totalPrice + " TL");


    }
}
