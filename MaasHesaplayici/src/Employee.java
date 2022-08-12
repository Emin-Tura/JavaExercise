public class Employee {
    String name;
    double salary;
    int workHour;
    int hireYear;

    Employee(String name, double salary, int workHour, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;
    }

    void tax() {
        if (salary > 1000) {
            double vergi = salary * 0.03;
            System.out.println("Maasa Uygulanan Vergi Miktari ====> " + vergi + " TL");
            this.salary += vergi;
        }
    }

    void bonus() {
        if (workHour > 40) {
            int mesai = workHour - 40;
            System.out.println("Mesai Ucreti ====> " + mesai * 30 + " TL");
            this.salary += mesai * 30;
        }
    }

    void raiseSalary() {
        int today = 2022;
        int calisilanSure = today - hireYear;
        if (calisilanSure < 10 && hireYear != today) {
            System.out.println("Maas Artisi ===> " + this.salary * 0.05);
            this.salary += (this.salary * 0.05);
        } else if (calisilanSure > 9 && calisilanSure < 20) {
            System.out.println("Maas Artisi ===> " + this.salary * 0.1);
            this.salary += (this.salary * 0.1);
        } else if (calisilanSure > 19) {
            System.out.println("Maas Artisi ===> " + this.salary * 0.15);
            this.salary += (this.salary * 0.15);
        } else {
            System.out.println("Maas Artisi ===> Biraz Calisin Daha Yeni Geldiniz ...");
        }
    }

    void printInfo() {
        System.out.println("=============================");

        System.out.println("Adi ===> " + this.name);
        System.out.println("Maasi ===> " + salary);
        System.out.println("Baslangic Yili ===> " + this.hireYear);
        System.out.println("Calisma Saati ===> " + this.workHour);
        bonus();
        tax();
        raiseSalary();
        System.out.println("Brut Maas ===> " + this.salary);

        System.out.println("=============================");
    }

}
