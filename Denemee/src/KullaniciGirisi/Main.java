package KullaniciGirisi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName,password,newPassword;



        System.out.print("Kullanici Adiniz : ");
        userName=input.nextLine();


        System.out.print("Parolaniz : ");
        password=input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giris Yapildi....");
        } else if (!password.equals("java123")) {
            int value;
            System.out.print("Girdiginiz Sifre Yanlis Sifirlamak Ister Misiniz? 1-Evet  2-Hayir : ");
            value= input.nextInt();

            if(value==1){

                System.out.print("Yeni Sifreniz :");
                input.nextLine();
                newPassword = input.nextLine();
                if (!newPassword.equals(password) && !newPassword.equals("java123")){
                    System.out.print("Sifre Olusturuldu...");
                }
                else{
                    System.out.println("Sifre Olusturulamadi, Lutfen baska sifre giriniz...");
                }
            }else{
                System.out.print("Iyi Gunler...");
            }

        }

    }
}
