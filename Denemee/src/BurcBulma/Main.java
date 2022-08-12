package BurcBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month,day;
        String burc = null;
        boolean isError = false;

        System.out.print("Dogdugunuz Ay : ");
        month=input.nextInt();

        System.out.print("Dogdugunuz Gun :");
        day= input.nextInt();


        switch(month) {
            case 1:
                if(day >= 1 && day <=31) {
                    if (day <= 21) {
                        burc= "Oğlak Burcu";
                    } else {
                        burc= "Kova Burcu";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if(day >= 1 && day <= 29) {
                    if (day <= 19) {
                        burc = "Kova Burcu";
                    } else {
                        burc = "Balık Burcu";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if(day >= 1 && day <=31) {
                    if (day <= 20) {
                        burc = "Balık Burcu";
                    } else {
                        burc = "Koç Burcu";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if(day >=1 && day <= 30) {
                    if (day <= 20) {
                        burc = "Koç Burcu";
                    } else {
                        burc = "Boğa Burcu";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if(day >= 1 && day <= 31) {
                    if (day <= 21) {
                        burc = "Boğa Burcu";
                    } else {
                        burc = "İkizler Burcu";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if(day >= 1 && day <= 30) {
                    if (day <= 22) {
                        burc = "İkizler Burcu";
                    } else {
                        burc = "Yengeç Burcu";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if(day >= 1 && day <= 31) {
                    if (day <= 22) {
                        burc = "Yengeç Burcu";
                    } else {
                        burc = "Aslan Burcu";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if(day >= 1 && day <= 31) {
                    if (day <= 22) {
                        burc = "Aslan Burcu";
                    } else {
                        burc = "Başak Burcu";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if(day >= 1 && day <= 30) {
                    if (day <= 22) {
                        burc = "Başak Burcu";
                    } else {
                        burc = "Terazi Burcu";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if(day >= 1 && day <= 31) {
                    if (day <= 22) {
                        burc = "Terazi Burcu";
                    } else {
                        burc = "Akrep Burcu";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if(day >= 1 && day <= 30) {
                    if (day <= 21) {
                        burc = "Akrep Burcu";
                    } else {
                        burc = "Yay Burcu";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        burc = "Yay Burcu";
                    } else {
                        burc = "Oğlak Burcu";
                    }
                } else {
                    isError = true;
                }
                break;
        }


        if(isError) {
            System.out.println("Hatalı giriş yaptınız.");
        } else {
            System.out.println("Burcunuz: " + burc);
        }


    }
}
