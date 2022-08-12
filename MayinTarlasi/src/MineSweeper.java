import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    String[][] mainTable;
    String[][] tempTable;
    int x;
    int y;
    boolean isFinish;
    boolean isWin;
    int conditionToWin;

    MineSweeper(int x, int y) {
        this.mainTable = new String[x][y];
        this.tempTable = new String[x][y];
        this.x = x;
        this.y = y;
        this.isFinish = false;
        this.isWin = false;
    }


    void printTable() {
        for (int i = 0; i < mainTable.length; i++) {
            for (int j = 0; j < mainTable[i].length; j++) {
                mainTable[i][j] = "-";
                tempTable[i][j] = "-";
            }
        }
    }

    void minePlacement() {
        Random rand = new Random();
        int bombCount = (this.x * this.y) / 4;
        this.conditionToWin = (this.x * this.y) - bombCount;

        for (int i = 0; i < bombCount; i++) {
            int randomX = rand.nextInt(x);
            int randomY = rand.nextInt(y);
            if (Objects.equals(mainTable[randomX][randomY], "*")) i--;
            else mainTable[randomX][randomY] = "*";

        }

    }

    void print(int a) {
        if (a == 1) {
            System.out.println("=======Mayinlarin Konumu=======");
            print(mainTable);
            System.out.println("================================");
            System.out.println("Mayin Tarlasina Hosgeldiniz...");
        } else {
            System.out.println("================================");
            print(tempTable);
        }
    }

    public void print(String[][] arr) {
        for (String[] tmp : arr) {
            for (String tmp2 : tmp) System.out.print(tmp2 + " ");
            System.out.println();
        }
    }


    public int control(int satir, int sutun) {
        int count = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (satir + i < 0 || sutun + j < 0 || satir + i >= x || sutun + j >= y || (i == 0 && y == 0)) continue;
                if (mainTable[satir + i][sutun + j].equals("*")) count++;
            }
        }
        return count;
    }


    void run() {
        printTable();
        minePlacement();
        print(1);
        Scanner s = new Scanner(System.in);
        while (!isFinish) {
            print(0);
            System.out.print("Satir Giriniz: ");
            int satir = s.nextInt();
            System.out.print("Sutun Giriniz:");
            int sutun = s.nextInt();

            if (satir < 0 || satir >= x || sutun < 0 || sutun >= y) {
                System.out.println("Girilen degerlerde hata var. Lutfen tekrar giriniz: ");
            } else {
                if (mainTable[satir][sutun].equals("*")) {
                    System.out.println("Game Over!!");
                    System.out.println("================================");
                    isFinish = true;
                    isWin = false;
                    break;
                } else {
                    conditionToWin--;

                    if (conditionToWin <= 0) {
                        System.out.println("Oyunu Kazandiniz!!");
                        System.out.println("================================");
                        isFinish = true;
                        isWin = true;
                        break;
                    } else {
                        int count = control(satir, sutun);
                        tempTable[satir][sutun] = String.valueOf(count);
                    }
                }
            }
        }
    }
}
