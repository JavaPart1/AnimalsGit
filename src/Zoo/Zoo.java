package Zoo;

import Animals.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    private ArrayList<Monkey> monkeys = new ArrayList<>();
    private ArrayList<Cow> cows = new ArrayList<>();
    private ArrayList<Turtle> turtles = new ArrayList<>();
    private ArrayList<Tiger> tigers = new ArrayList<>();
    private ArrayList<Elephant> elephants = new ArrayList<>();

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
}
