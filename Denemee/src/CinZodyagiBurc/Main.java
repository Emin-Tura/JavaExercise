package CinZodyagiBurc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthYear;
        double rate;
        String cinzodyagi = null;

        System.out.print("Lutfen Dogum Tarihinizi Giriniz :");
        birthYear = input.nextInt();
        rate = birthYear % 12;

        System.out.println(rate);

        switch ((int) rate) {
            case 0:
                cinzodyagi = "Maymun";
                break;
            case 1:
                cinzodyagi = "Horoz";
                break;
            case 2:
                cinzodyagi = "Kopek";
                break;
            case 3:
                cinzodyagi = "Domuz";
                break;
            case 4:
                cinzodyagi = "Fare";
                break;
            case 5:
                cinzodyagi = "Okuz";
                break;
            case 6:
                cinzodyagi = "Kaplan";
                break;
            case 7:
                cinzodyagi = "Tavsan";
                break;
            case 8:
                cinzodyagi = "Ejderha";
                break;
            case 9:
                cinzodyagi = "Yilan";
                break;
            case 10:
                cinzodyagi = "At";
                break;
            case 11:
                cinzodyagi = "Koyun";
                break;
        }
        System.out.println("Cin Zodyagi Burcunuz: " + cinzodyagi);

    }
}
