package PalindromSayi;

public class Main {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            System.out.println("=====");
            System.out.println("Sayi ===>" + temp);
            lastNumber = temp % 10;
            System.out.println("Son Basamak ===> " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni Sayi ===> " + reverseNumber);
            temp /= 10;
            System.out.println("Yeni Temp ===> " + temp);

        }
        if (reverseNumber == number) {
            System.out.println("Sayi Palindromdur...");
        } else {
            System.out.println("Sayi Palindrom Degildir...");
        }


        return true;
    }


    public static void main(String[] args) {
        isPalindrom(2152);
    }
}
