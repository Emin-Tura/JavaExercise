package ManavKasa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut,elma,domates,muz,patlıcan,aKg,eKg,dKg,mKg,pKg,total;

        armut = 2.14;
        elma = 3.67;
        domates=1.11;
        muz = 0.95;
        patlıcan=5.00;



        System.out.print("Kac Kilo Armut Aldiniz : ");
        aKg = input.nextDouble();
        System.out.print("Kac Kilo Elma Aldiniz : ");
        eKg = input.nextDouble();
        System.out.print("Kac Kilo Domates Aldiniz : ");
        dKg = input.nextDouble();
        System.out.print("Kac Kilo Muz Aldiniz : ");
        mKg = input.nextDouble();
        System.out.print("Kac Kilo Patlican Aldiniz : ");
        pKg = input.nextDouble();


        total = (armut * aKg) + (elma*eKg) + (dKg*domates) + (mKg*muz) + (patlıcan*pKg);

        System.out.print("Toplam Tutar : " + total);

    }
}
