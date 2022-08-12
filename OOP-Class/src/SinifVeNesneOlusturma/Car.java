package SinifVeNesneOlusturma;

public class Car {
    String type;
    String model;
    String color;
    //Yan yana yazabilirdik fakat classlarda bu şekilde yazılması jargondur.
    int speed;
    int speedLimit = 180;

    void increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit) {
            speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
    }

    void printSpeed() {
        System.out.println(model + " Hiziniz :" + speed);
    }


}
