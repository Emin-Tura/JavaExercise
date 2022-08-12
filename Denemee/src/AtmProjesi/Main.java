package AtmProjesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        int right = 3; //3 hakkı var
        int balance = 1500; //Bakiye
        int select;


        while (right > 0) {
            System.out.print("Kullanici Adiniz :");
            userName = input.nextLine();

            System.out.print("Password :");
            password = input.nextLine();

            if (userName.equals("emin") && password.equals("123")) {
                System.out.println("Merhaba, X Bankasina Hosgeldiniz...");
                do {
                    System.out.println("1-Para Yatirma \n" +
                            "2-Para Cekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Cikis Yap");
                    System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz :");

                    select = input.nextInt();

                    if (select == 1) {
                        System.out.println("Para Miktari :");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.println("Para Miktari :");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye Yetersiz...");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz :" + balance);
                    }

                } while (select != 4);
                System.out.println("Tekrar Gorusmek Uzere :)");
                break;
            } else {
                --right;
                if (right == 0) {
                    System.out.println("Hesabiniz Bloke Olmustur");
                } else {
                    System.out.println("Hatali bilgiler!!! Kalan Hakkiniz : " + right);
                }

            }

        }


    }
}
