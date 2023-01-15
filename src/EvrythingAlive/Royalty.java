package EvrythingAlive;
import EverythingInanimate.*;

import java.util.ArrayList;
import Enum.*;

public class Royalty extends AliveCreature {
    static ArrayList<String> capacity_throne = new ArrayList<>();
    public Royalty(String name, Place place) {
        super(name, place);
    }

    public void sittingOnTheThrone(Throne throne) {
        if (capacity_throne.size() == throne.maxAmountOfPersons) {
            System.out.println("Больше никто не может сидеть на троне");
        } else {
            capacity_throne.add(this.name);
            System.out.println(this.name + " сел на трон");
            if (capacity_throne.size() == throne.maxAmountOfPersons) {
                System.out.println("Король и королева заняли свои места на троне");
            }
        }
    }

/*    class Crown {

    }*/

}
