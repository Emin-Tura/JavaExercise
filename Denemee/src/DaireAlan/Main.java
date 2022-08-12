package DaireAlan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double pi = 3.14;
        System.out.print("Capi Giriniz : ");
        r = input.nextInt();

        double area = pi * r * r;
        double distance = 2 * pi * r;


        System.out.println("Alan : " + area);

        System.out.println("Cevre : " + distance);

    }
}
