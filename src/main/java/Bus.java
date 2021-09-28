import beepers.Beeper;
import engines.Engine;

public abstract class Bus extends Car implements PublicTransport {
    private int totalPeopleCount = 0;
    public Bus(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }

    @Override
    public void stop(int peopleCount) {
        totalPeopleCount += peopleCount;
        System.out.println(totalPeopleCount+ " People in bus");


    }
}
