package UsluSayiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.


        int n, k,total=1,i;

        System.out.print("Ussu Alinacak Sayi : ");
        n = input.nextInt();

        System.out.print("Us Olacak Sayi : ");
        k = input.nextInt();

//        while (i<=k){
//            total *=n;
//            i++;
//        }
//
//        System.out.println(total);

        for (i=1;i<=k;i++){
            total *=n;
        }
        System.out.println(total);



    }
}
