package OgrenciNotSistemi;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print() {
        System.out.println("Adi \t:" + this.name);
        System.out.println("Telefonu:" + this.mpno);
        System.out.println("Bransi \t:" + this.branch);
    }


}
