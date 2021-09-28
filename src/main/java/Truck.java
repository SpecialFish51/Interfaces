import beepers.Beeper;
import engines.Engine;

public class Truck extends Car{
    public Truck(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }
    public void sandLoading(){
        System.out.println("Loading in progress");
    }
    public void sandDumping(){
        System.out.println("Dumping in progress");
    }
}
