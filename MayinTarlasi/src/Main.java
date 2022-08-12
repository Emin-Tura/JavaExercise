import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satir Sayisini Giriniz :");
        int x = input.nextInt();
        System.out.print("Sutun Sayisini Giriniz :");
        int y = input.nextInt();

        MineSweeper table = new MineSweeper(x, y);
        table.run();

        int a = 4;


    }
}
