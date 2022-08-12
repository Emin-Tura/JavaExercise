package Taksimetre;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start = 10;
        double unit = 2.20,totalPrice,distance;

        System.out.print("Kac Km Yol Yaptiniz : ");

        distance = input.nextDouble();
        totalPrice = (start + (distance*unit));
        System.out.println("Tutar : " + totalPrice);

        double result = totalPrice < 20 ? totalPrice=20 : totalPrice;


        System.out.print("Odemeniz Gereken Tutar : " + result);




    }
}
