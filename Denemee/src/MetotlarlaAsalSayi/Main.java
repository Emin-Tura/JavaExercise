package MetotlarlaAsalSayi;

import java.util.Scanner;

public class Main {

    static boolean isPrime(int n, int i) {

        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime(n, i + 1);
    }

    // Driver program to test above function
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        int n = input.nextInt();

        if (isPrime(n, 2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
