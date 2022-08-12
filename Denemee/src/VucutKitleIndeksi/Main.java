package VucutKitleIndeksi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double boy,kilo,index;

        System.out.print("Lutfen Boyunuzu Giriniz (m) : ");
        boy = input.nextDouble();

        System.out.print("Lutfen Kilonuzu Giriniz (kg) : ");
        kilo = input.nextDouble();

        index = kilo / (boy*boy);

        System.out.println("Vucut Kitle Indeksiniz : " + index);


    }
}
