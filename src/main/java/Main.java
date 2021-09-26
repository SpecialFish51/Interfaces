public class Main {
    public static void main(String[] args) {
        Horn horn = new Horn();
        Engine12v engine12v = new Engine12v();
Lambo lambo = new Lambo(horn, engine12v);
        System.out.println(lambo.checkBeep());
        System.out.println(lambo.checkSpeed());
    }
}
