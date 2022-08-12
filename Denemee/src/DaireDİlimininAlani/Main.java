package DaireDİlimininAlani;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int r;
        double a,pi=3.14,result;

        System.out.print("Yari Capi Giriniz :");
        r= input.nextInt();

        System.out.print("Merkez Aciyi Giriniz :");
        a= input.nextDouble();

        result=(pi*(r*r)*a)/360;

        System.out.println("Sonuc :" +result);



    }
}
