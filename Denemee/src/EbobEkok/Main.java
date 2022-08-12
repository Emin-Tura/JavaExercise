package EbobEkok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi Giriniz :");
        int n1 = input.nextInt();

        System.out.print("Ikinci sayiyi Giriniz :");
        int n2 = input.nextInt();

        int ebob = 1;


        //Ebob
//
//        for (int i = 1; i < n1; i++) {
//            if (n1 % i == 0 && n2 % i == 0) {
//                ebob = i;
//            }
//        }
//        System.out.println(ebob);

        //Ekok
//        for (int i = 1; i <= (n1 * n2); i++) {
//            if (i % n1 == 0 && i % n2 == 0){
//                System.out.println(i);
//                break;
//            }
//        }




    }
}
