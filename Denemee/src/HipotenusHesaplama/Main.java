package HipotenusHesaplama;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b;
        double c;

        System.out.print("Lutfen Birinci Kenari Giriniz : " );
        a= input.nextInt();

        System.out.print("Lutfen Ikinci Kenari Giriniz : " );

        b= input.nextInt();

        c = Math.sqrt((a*a)+(b*b));

        System.out.print("Hipotenus :" +c);
    }
}
