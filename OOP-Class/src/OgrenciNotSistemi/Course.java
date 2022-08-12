package OgrenciNotSistemi;

public class Course {
    Teacher teacher;
    String name;
    String prefix;
    String code;
    int sozluNotu;
    int note;

    Course(String name, String prefix, String code) {
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        int sozluNotu = 0;
        int note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.name)) {
            this.teacher = teacher;
            // printTeacher();
        } else {
            System.out.println("Ogretmen ve Ders bolumleri uyusmuyor...");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }


}

