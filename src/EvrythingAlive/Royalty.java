package EvrythingAlive;
import EverythingInanimate.*;

import java.util.ArrayList;
import Enum.*;

public class Royalty extends AliveCreature {
    static ArrayList<String> citizens = new ArrayList<>();
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

    public void kill_citizen_of_wonderland(OrdinaryCitizenOfWonderland citizenOfWonderland) {
        class Security {
            final String name;
            Security(String name) {
                this.name = name;
            }
        }
        Security security = new Security("Охранник");
        citizens = OrdinaryCitizenOfWonderland.getCitizens_names();
        if (citizens.contains(citizenOfWonderland.name)) {
            System.out.println(security.name + " убивает жителя страны чудес по имени: " + citizenOfWonderland.name + ". Его приказал убить: " + this.name);
            citizens.remove(citizenOfWonderland.name);
        } else {
            System.out.println("Вы не можете убить жителя: " + citizenOfWonderland.name + ". Такого жителя нет! Вероятно он уже убит");
        }

    }

}
