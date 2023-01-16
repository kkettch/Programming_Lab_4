package EvrythingAlive;
import Enum.*;

import Exceptions.TooMuchCitizensException;
import Exceptions.WitnessIsNotReadyException;

public class WitnessToTheCrime extends OrdinaryCitizenOfWonderland{
    public boolean isWitnesshandcuffed;

    public WitnessToTheCrime(String name, Place place) throws TooMuchCitizensException {
        super(name, place);
    }

    public void putOnTheHandcuffs() {
        this.isWitnesshandcuffed = true;
        System.out.println("Наручники надеты на свидетеля: " + this.name);
    }

    public void goOutToGiveEvidence() throws WitnessIsNotReadyException {
        if (isWitnesshandcuffed) {
            System.out.println("Свидетель " + this.name + " выходит на дачу показаний");
        } else {
            throw new WitnessIsNotReadyException("Свидетель " + this.name + " не готов к даче показаний.");
        }
    }

}
