package RecursiveDeseneGore;

import java.util.Scanner;

public class Main {
    static int func(int n) {
        int temp = n;
        System.out.print(temp + " ");
        if (temp > 0) {
            temp -= 5;
            func(temp);
        }
        if (temp <= 0 || temp <= n) {
            temp += 5;
            System.out.print(temp + " ");
        }
        return temp;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz :");
        int n = input.nextInt();
        func(n);
    }
}
