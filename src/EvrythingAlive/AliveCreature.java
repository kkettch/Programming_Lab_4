package EvrythingAlive;
import Enum.*;
import Interfaces.*;
import EverythingInanimate.*;

import java.util.ArrayList;

public abstract class AliveCreature implements EmotionalInfluencable {

    protected String name;
    protected Place place;
    protected int iq_level;
    protected Emotion emotion = Emotion.normal;
    private final Foot foot = new Foot();
    static ArrayList<String> amount_of_pies = new ArrayList<>();

    AliveCreature(String name, Place place) {
        this.name = name;
        this.place = place;
    }

    AliveCreature(String name, int iq_level, Place place) {
        this.name = name;
        this.iq_level = iq_level;
        this.place = place;
    }

    @Override
    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    @Override
    public void getEmotion() {
        System.out.println(this.name + " has an emotion: " + this.emotion);
    }

    public void eat() {
        amount_of_pies = Pie.getPies();
        System.out.println("На тарелке лежит " + amount_of_pies.size() + " пирожков");
        if (amount_of_pies.size() == 0) {
            System.out.println(this.name + " не может съесть ни одного. Их больше нет");
        } else {
            Pie.getPies().remove(0);
            System.out.println(this.name + " съел(-а) пирожок. Осталось еще: " + amount_of_pies.size());
        }
    }

    public void run() {
        foot.run();
        this.setPlace(Place.InTheMiddleOfNowhere);
    }

    class Foot {
        void run() {
            System.out.println(name + " бежит сломя голову");
        }
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void getPlace() {
        System.out.println(this.name + " находится в этом месте " + this.place);
    }
}
