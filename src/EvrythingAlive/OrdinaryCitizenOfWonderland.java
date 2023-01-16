package EvrythingAlive;

import Exceptions.TooMuchCitizensException;
import java.util.ArrayList;
import Enum.*;


public class OrdinaryCitizenOfWonderland extends AliveCreature {

    static ArrayList<String> citizens_names = new ArrayList<>();

    public OrdinaryCitizenOfWonderland(String name, Place place) throws TooMuchCitizensException {
        super(name, place);

        try {
            Statistic.counter++;
            citizens_names.add(this.name);
            if (Statistic.counter > 12) {
                throw new TooMuchCitizensException("Жителей не должно быть больше 12!");
            }
        } catch (TooMuchCitizensException e) {
            System.out.println(e.getMessage());
            System.out.println("Сейчас жителей: " + Statistic.counter + ". Максимальное количество: 12");
        }
    }

    public static void getAmountOfCitizens() {
        Statistic.getAmountOfCitizens();
    }

    public static class Statistic { //отслеживание количества созданных жителей страны чудес
        public static int counter = 0;

        public static void getAmountOfCitizens() {
            System.out.println(counter + ". Столько всего простых жителей в стране чудес");
        }

    }

    public void sing() {
        this.emotion = Emotion.sad;
        this.getEmotion();
        System.out.println(this.name + " поет песню про Рыбную Уху");
    }

    public static ArrayList<String> getCitizens_names() {
        return citizens_names;
    }

}
