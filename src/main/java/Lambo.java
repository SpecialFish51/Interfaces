

public class Lambo extends Car {
    @Override
    String checkBeep() {
        return beeper.makeSound();
    }

    @Override
    String checkSpeed() {
        return "Broken";
    }

    public Lambo(Beeper beeper , Engine12v engine12v) {
        super(beeper, engine12v);
    }
}
