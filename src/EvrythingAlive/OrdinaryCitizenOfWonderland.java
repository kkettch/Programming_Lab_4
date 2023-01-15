package EvrythingAlive;

import Exceptions.CitizenAnxietyLevelIsLowException;

import Enum.*;


public class OrdinaryCitizenOfWonderland extends AliveCreature {

    int anxietyLevel;

    public OrdinaryCitizenOfWonderland(String name, Place place, int anxietyLevel) throws CitizenAnxietyLevelIsLowException {
        super(name, place);
        Statistic.counter++;

        try {
            if (anxietyLevel < 0) {
                throw new CitizenAnxietyLevelIsLowException("Уровень тревоги отрицательный");
            }
        } catch(CitizenAnxietyLevelIsLowException e) {
            System.out.println(e.getMessage());
            System.out.println("Житель не может быть создан из-за неправильного значения уровня тревоги");
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

}
