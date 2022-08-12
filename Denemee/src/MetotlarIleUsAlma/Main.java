package MetotlarIleUsAlma;
import java.util.Scanner;

public class Main {

    static int result = 1;
    static int temp(int exp, int base) {
        if (exp == 0)
            return 1;
        result *= base;
        temp(exp - 1, base);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int exp, base;

        System.out.print("Enter Base Value: ");
        base = scan.nextInt();

        System.out.print("Enter Exponent Value: ");
        exp = scan.nextInt();

        System.out.println("Result : " + temp(exp, base));
    }
}