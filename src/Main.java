import everythingInanimate.*;
import everythingAlive.*;
import exceptions.TooMuchCitizensException;
import enums.*;
import exceptions.WitnessIsNotReadyException;

public class Main {
    public static void main(String[] args) throws TooMuchCitizensException {
        Girl alice = new Girl("Алиса", Place.Dining) {
            public void run() {
                this.setEmotion(Emotion.anxious);
                System.out.println(this.name + " бежит, но не понимает почему. Ее эмоция: " + this.emotion);
            }
        };

        OrdinaryCitizenOfWonderland fishDelicacy = new OrdinaryCitizenOfWonderland("Рыбный деликатес", Place.Dining);
        fishDelicacy.setEmotion(Emotion.grumpy);
        fishDelicacy.getEmotion();
        OrdinaryCitizenOfWonderland griffin = new OrdinaryCitizenOfWonderland("Грифон", Place.Dining);
        griffin.setEmotion(Emotion.offended);
        griffin.getEmotion();
        fishDelicacy.sing();
        griffin.run();
        alice.run();
        alice.setPlace(Place.Court);
        alice.getPlace();

        Royalty king = new Royalty("Король", Place.Court);
        Royalty queen = new Royalty("Королева", Place.Court);
        Throne throne = new Throne("Трон");
        king.sittingOnTheThrone(throne);
        queen.sittingOnTheThrone(throne);

        Pie pie1 = new Pie("Пирожок 1");
        pie1.fillWithFilling();
        Pie pie2 = new Pie("Пирожок 2");

        alice.eat(pie1);
        alice.eat(pie2);

        Word word = new Word("Jury", true);
        alice.speak(word);

        Jury jury1 = new Jury("John", 100, Place.Court);
        Jury jury2 = new Jury("Jessica", 150, Place.Court);
        Branch branch = new Branch("branch", 1);
        Slate slate = new Slate("slate", 2);

        jury1.sitOnTheBranch(branch);
        jury2.sitOnTheBranch(branch);

        jury1.writingOnTheSlate(slate);

        WitnessToTheCrime hatter = new WitnessToTheCrime("Шляпник", Place.Court);
        hatter.putOnTheHandcuffs();
       try {
           hatter.goOutToGiveEvidence();
       } catch (WitnessIsNotReadyException e) {
           System.out.println(e.getMessage());
           System.out.println("Наручники надеты? " + hatter.isWitnesshandcuffed);
       }

        king.kill_citizen_of_wonderland(hatter);
        king.kill_citizen_of_wonderland(hatter);
    }
}