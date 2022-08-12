package OgrenciNotSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mehmet Hoca", "0-537-273-34-05", "Edebiyat");
        Teacher t2 = new Teacher("Emin Hoca", "0-534-285-11-80", "Fizik");
        Teacher t3 = new Teacher("Muhammed Hoca", "0-542-461-86-12", "Yazilim");

        Course edebiyat = new Course("Edebiyat", "EDB", "101");
        edebiyat.addTeacher(t1);

        Course fizik = new Course("Fizik", "FZK", "102");
        fizik.addTeacher(t2);

        Course yazilim = new Course("Yazilim", "YZL", "103");
        yazilim.addTeacher(t3);

        Student s1 = new Student("Emin Tura", "114", "4", edebiyat, fizik, yazilim);
        s1.addBulkExamNote(100, 100, 100, 80, 100, 80);
        s1.isPass();

        Student s2 = new Student("Akif Tura", "240", "3", edebiyat, fizik, yazilim);
        s2.addBulkExamNote(70, 40, 50, 45, 90, 30);
        s2.isPass();


    }
}
