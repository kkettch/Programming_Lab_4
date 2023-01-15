package EvrythingAlive;
import Interfaces.*;
import EverythingInanimate.*;
import Enum.*;

public class Girl extends AliveCreature implements Speakable{

    public Girl(String name, Place place) {
        super(name, place);
    }

    @Override
    public void speak (Word word){
        if (!this.name.equals("Alice")) {
            if (word.difficult) {
                System.out.println(this.name + " said: I don't know word '" + word.name + "'");
            } else {
                System.out.println(this.name + " said: I know word '" + word.name + "'");
            }
        } else {
            System.out.println(this.name + " said: I know all the words, even difficult ones, including " + word.name);
        }
    }
}

