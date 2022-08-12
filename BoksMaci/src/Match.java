public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {

            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("====== YENI ROUND ======");
                if (startChance()) {
                    System.out.println("==> " + f1.name + " Rounda Basladi" +" <== ");
                    this.f2.health = this.f1.hit(this.f2); //F2 nin sagligi f1 in hit metodunda donen metoda esitledik.
                    if (isWin()) {
                        break;
                    }
                } else {
                    System.out.println("==> " + f2.name + " Rounda Basladi" +" <== ");
                    this.f1.health = this.f2.hit(this.f1); //F1 nin sagligi f2 nin hit metodunda donen metoda esitledik.
                    if (isWin()) {
                        break;
                    }
                }
                printScore();
            }

        } else {
            System.out.println("Sporcularin Sikletleri Esit Degil...");
        }
    }


    boolean isCheck() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazandi...");
            return true;
        } else if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Kazandi...");
            return true;
        }
        return false; //Hala dovusuyorlar. Biri Birinie vuruyor.
    }

    boolean startChance() {
        double randomChance = Math.random() * 1;
        return randomChance < 0.5;
    }


    public void printScore() {
        System.out.println("-----------------------");
        System.out.println(this.f1.name + " Kalan Can \t:" + this.f1.health);
        System.out.println(this.f2.name + " Kalan Can \t:" + this.f2.health);
        System.out.println("-----------------------");

    }
}
