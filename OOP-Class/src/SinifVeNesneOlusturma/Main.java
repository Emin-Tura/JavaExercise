package SinifVeNesneOlusturma;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model="Audi a3";
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.model="BMW m5";
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model="c180";
        mercedes.speed = 20;
        mercedes.printSpeed();
    }
}
