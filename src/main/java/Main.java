import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSparks;
import engines.DieselEngine;
import engines.Engine12v;
import engines.FSDEngine;

import javax.sound.sampled.Line;

public class Main {


    public static void main(String[] args) {

        Horn horn = new Horn();
        FancyMusic music = new FancyMusic();
        MagicSparks magic = new MagicSparks();

        Engine12v engine12v = new Engine12v();

Lambo lambo = new Lambo(music, engine12v);
Viper viper = new Viper(music, new FSDEngine());
Bus22 bus22 = new Bus22(magic, new DieselEngine());
Truck truck = new Truck(horn, new DieselEngine());

        System.out.println("Bus 22");
        System.out.println(bus22.checkBeep());
        System.out.println(bus22.checkSpeed());
        bus22.stop(12);
        bus22.stop(-5);
              System.out.println("Viper the starship");
viper.scoopFuel();
viper.landToPlanet();
        System.out.println(viper.checkBeep());
        System.out.println(viper.checkSpeed());

        System.out.println("Lambo");
        System.out.println(lambo.checkBeep());
        System.out.println(lambo.checkSpeed());
        System.out.println("Massive Truck");
        System.out.println(truck.checkBeep());
        truck.sandLoading();
        System.out.println(truck.checkSpeed());
        truck.sandDumping();

    }
}
