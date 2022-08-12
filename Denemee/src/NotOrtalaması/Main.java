package NotOrtalaması;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
         sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.*/

        double math,physx,chemical,turkish,music;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunu Giriniz :");
         math = input.nextInt();

        System.out.print("Fizik Notunu Giriniz :");
         physx = input.nextInt();

        System.out.print("Kimya Notunu Giriniz :");
         chemical = input.nextInt();

        System.out.print("Turkce Notunu Giriniz :");
         turkish = input.nextInt();


        System.out.print("Muzik Notunu Giriniz :");
         music = input.nextInt();

        double average = (math + physx + chemical + turkish + music) / 5;

        System.out.println("Ortalama :" + average + " "+( average>60 ? "Sinifi Gecti... :)" : "Sinifta Kaldi... :("));


    }

}
