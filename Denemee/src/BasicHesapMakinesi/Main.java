package BasicHesapMakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float first, second, result;
        int islem;


        System.out.print("Birinci Sayiyi Giriniz : ");
        first = input.nextFloat();

        System.out.print("Ikinci Sayiyi Giriniz : ");
        second = input.nextFloat();

        System.out.print("Yapmak Istediginiz Islem : 1=>(+) 2=>(-) 3=>(*) 4=>(/) :");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                result = first + second;
                System.out.println(result);
                break;
            case (2):
                result = first - second;
                System.out.println(result);

                break;
            case (3):
                result = first * second;
                System.out.println(result);

                break;
            case (4):
                result = first / second;
                System.out.println(result);
                break;
        }


    }
}
