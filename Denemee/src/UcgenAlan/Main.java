package UcgenAlan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c,env;
        double area;

        System.out.print("Birinci Kenari Giriniz : ");
        a= input.nextInt();
        System.out.print("Ikinci Kenari Giriniz : ");
        b= input.nextInt();
        System.out.print("Ucuncu Kenari Giriniz : ");
        c= input.nextInt();

        env = (a+b+c)/2;

        area=Math.sqrt(env*(env-a)*(env-b)*(env-c));

        System.out.print("Ucgenin Alani : " + area);



    }
}
