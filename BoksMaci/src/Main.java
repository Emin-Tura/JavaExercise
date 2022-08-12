public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10, 100, 90, 50);
        Fighter f2 = new Fighter("B", 20, 90, 85, 30);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
