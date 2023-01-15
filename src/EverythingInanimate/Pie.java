package EverythingInanimate;

import EvrythingAlive.AliveCreature;

import java.util.ArrayList;

public class Pie {
    public String name;
    static ArrayList<String> pies = new ArrayList<>();
    public Pie(String name) {
        this.name = name;
        pies.add(name);
    }
    public static class Filling { //начинка
        private final String name;
        public Filling(String name) {
            this.name = name;
        }

   }
   public void fillWithFilling() {
        Filling filling1 = new Filling("клубника");
        Filling filling2 = new Filling("черника");
        System.out.println(this.name + " содержит в себе следующие ингридиенты: " + filling1.name + ", " + filling2.name);
    }

    public static ArrayList<String> getPies() {
        return pies;
    }
}
