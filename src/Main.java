public class Main {
    public static void main(String[] args) {
        Sun sun = new Sun(45, Colors.YELLOW);
        Earth earth = new Earth(76, Colors.WHITE);
        Moon moon = new Moon(112, Colors.GREEN);
        System.out.println("Sun: " + sun.resalt() + "\nMoon; " + moon.resalt() + "\nEarth: " + earth.resalt());
    }
}