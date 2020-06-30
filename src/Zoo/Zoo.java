package Zoo;

import Animals.*;

import java.util.Arrays;

public class Zoo {
    private Monkey[] monkeys;
    private Cow[] cows;
    private Turtle[] turtles;
    private Tiger[] tigers;
    private Elephant[] elephants;

    public Monkey[] getMonkeys() {
        return monkeys;
    }

    public void setMonkeys(Monkey[] monkeys) {
        this.monkeys = monkeys;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Turtle[] getTurtles() {
        return turtles;
    }

    public void setTurtles(Turtle[] turtles) {
        this.turtles = turtles;
    }

    public Tiger[] getTigers() {
        return tigers;
    }

    public void setTigers(Tiger[] tigers) {
        this.tigers = tigers;
    }

    public Elephant[] getElephants() {
        return elephants;
    }

    public void setElephants(Elephant[] elephants) {
        this.elephants = elephants;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "monkeys=" + Arrays.toString(monkeys) +
                ", cows=" + Arrays.toString(cows) +
                ", turtles=" + Arrays.toString(turtles) +
                ", tigers=" + Arrays.toString(tigers) +
                ", elephants=" + Arrays.toString(elephants) +
                '}';
    }
}
