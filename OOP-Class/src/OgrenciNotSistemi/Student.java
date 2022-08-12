package OgrenciNotSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course sozluNotu;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int s1, int s2, int s3) {
        if ((note1 >= 0 && note1 <= 100) && (s1 >= 0 && s1 <= 100)) {
            this.c1.note = note1;
            this.c1.sozluNotu=s1;
        }
        if ((note2 >= 0 && note2 <= 100) && (s2 >= 0 && s2 <= 100)) {
            this.c2.note = note2;
            this.c2.sozluNotu=s2;
        }
        if ((note3 >= 0 && note3 <= 100) && (s3 >= 0 && s3 <= 100)) {
            this.c3.note = note3;
            this.c3.sozluNotu=s3;
        }
    }

    void calculateAvarage() {
        double n1 = (this.c1.note * 0.8) + (this.c1.sozluNotu * 0.2);
        double n2 = (this.c2.note * 0.6) + (this.c2.sozluNotu * 0.4);
        double n3 = (this.c3.note * 0.7) + (this.c3.sozluNotu * 0.3);
        this.avarage = (n1 + n2 + n3) / 3.0;
    }

    void isPass() {

        calculateAvarage();
        printNote();

        if (this.avarage >= 55) {
            System.out.println("Sinifi Basarili Bir Sekilde Gectiniz... :)");
            this.isPass = true;
        } else {
            System.out.println("Sinifta Kaldiniz... :(");
            this.isPass = false;
        }

    }

    void printNote() {
        System.out.println("========================");
        System.out.println(this.c1.name + " Notu\t:" + this.c1.note + " \t Sozlu Notu \t:"+this.c1.sozluNotu);
        System.out.println(this.c2.name + " Notu\t\t:" + this.c2.note);
        System.out.println(this.c3.name + " Notu\t:" + this.c3.note);
        System.out.println("Ortalamaniz\t\t:" + this.avarage);
    }


}
