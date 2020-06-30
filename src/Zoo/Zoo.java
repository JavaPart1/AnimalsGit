package Zoo;

import Animals.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    private String name;
    private ArrayList<Monkey> monkeys = new ArrayList<>();
    private ArrayList<Cow> cows = new ArrayList<>();
    private ArrayList<Turtle> turtles = new ArrayList<>();
    private ArrayList<Tiger> tigers = new ArrayList<>();
    private ArrayList<Elephant> elephants = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setElephant(Elephant elephantx) {
        this.elephants.add(elephantx);
    }

    public void setTiger(Tiger tigerx) {
        this.tigers.add(tigerx);
    }

    public void setTurtle(Turtle turtlex) {
        this.turtles.add(turtlex);
    }

    public void setCow(Cow cowx) {
        this.cows.add(cowx);
    }

    public void setMonkey(Monkey monkeyx) {
        this.monkeys.add(monkeyx);
    }

    public ArrayList<Monkey> getMonkeys() {
        return monkeys;
    }

    public ArrayList<Cow> getCows() {
        return cows;
    }

    public ArrayList<Turtle> getTurtles() {
        return turtles;
    }

    public ArrayList<Tiger> getTigers() {
        return tigers;
    }

    public ArrayList<Elephant> getElephants() {
        return elephants;
    }

    public String allAnimalsInZoo(){
        String allAnimals;
        // Alle cows
        allAnimals = "Cows: \n";
        for (int i = 0; i < cows.size(); i++) {
            allAnimals += cows.get(i).getNaam() + " (" +
                    cows.get(i).getGeslacht() + ") weegt " +
                    cows.get(i).getGewicht() + " en is " +
                    cows.get(i).getLeeftijd() + " jaar oud.\n";

        }
        // Alle elephants
        allAnimals += "Elephants: \n";
        for (int i = 0; i < elephants.size(); i++) {
            allAnimals += elephants.get(i).getNaam() + " (" +
                    elephants.get(i).getGeslacht() + ") weegt " +
                    elephants.get(i).getGewicht() + " en is " +
                    elephants.get(i).getLeeftijd() + " jaar oud.\n";

        }
        // Alle monkeys
        allAnimals += "monkeys: \n";
        for (int i = 0; i < monkeys.size(); i++) {
            allAnimals += monkeys.get(i).getNaam() + " (" +
                    monkeys.get(i).getGeslacht() + ") weegt " +
                    monkeys.get(i).getGewicht() + " en is " +
                    monkeys.get(i).getLeeftijd() + " jaar oud.\n";

        }
        // Alle tigers
        allAnimals += "tigers: \n";
        for (int i = 0; i < tigers.size(); i++) {
            allAnimals += tigers.get(i).getNaam() + " (" +
                    tigers.get(i).getGeslacht() + ") weegt " +
                    tigers.get(i).getGewicht() + " en is " +
                    tigers.get(i).getLeeftijd() + " jaar oud.\n";

        }
        // Alle turtles
        allAnimals += "turtles: \n";
        for (int i = 0; i < turtles.size(); i++) {
            allAnimals += turtles.get(i).getNaam() + " (" +
                    turtles.get(i).getGeslacht() + ") weegt " +
                    turtles.get(i).getGewicht() + " en is " +
                    turtles.get(i).getLeeftijd() + " jaar oud.\n";

        }
        return allAnimals;

    }

    @Override
    public String toString() {
        return "Zoo{" +
                "monkeys=" + monkeys +
                ", cows=" + cows +
                ", turtles=" + turtles +
                ", tigers=" + tigers +
                ", elephants=" + elephants +
                '}';
    }
}
