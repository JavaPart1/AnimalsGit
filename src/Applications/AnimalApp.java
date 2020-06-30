package Applications;

import Animals.*;
import Zoo.Zoo;

public class AnimalApp {
    public static void main(String[] args) {
        // Zoo aanmaken
        Zoo parisdaiza = new Zoo();
        // Cow aanmaken 7
        Cow cowB = new Cow("Bella",340.65,'v',3);
        parisdaiza.setCow(cowB);
        Cow cowA = new Cow("Annabel",543.55,'v',4);
        parisdaiza.setCow(cowA);
        Cow cowC = new Cow("Cecille",366.85,'v',3);
        parisdaiza.setCow(cowC);
        Cow cowK = new Cow("Karin",441.62,'v',5);
        parisdaiza.setCow(cowK);
        Cow cowN = new Cow("Nicolle",323.65,'v',3);
        parisdaiza.setCow(cowN);
        Cow cowZ = new Cow("Zorro",647.25,'m',5);
        parisdaiza.setCow(cowZ);
        // Elephant aanmaken 3
        Elephant elephantP = new Elephant("Pippo",1340.65,'m',53);
        parisdaiza.setElephant(elephantP);
        Elephant elephantE = new Elephant("Elsje",1322.25,'v',53);
        parisdaiza.setElephant(elephantE);
        Elephant elephantF = new Elephant("Fluo",140.65,'m',1);
        parisdaiza.setElephant(elephantF);
        // Monkey aanmaken 5
        Monkey monkeyF = new Monkey("Flippo",40.65,'m',12);
        parisdaiza.setMonkey(monkeyF);
        Monkey monkeyT = new Monkey("Trudy",30.65,'v',12);
        parisdaiza.setMonkey(monkeyF);
        Monkey monkeyM = new Monkey("Marcel",75.75,'m',63);
        parisdaiza.setMonkey(monkeyM);
        Monkey monkeyP = new Monkey("Philomene",51.25,'v',61);
        parisdaiza.setMonkey(monkeyP);
        Monkey monkeyV = new Monkey("Venus",40.5,'v',18);
        parisdaiza.setMonkey(monkeyV);
        // Tiger aanmaken 1
        Tiger tigerT = new Tiger("Tarzan",88.65,'m',8);
        parisdaiza.setTiger(tigerT);
        // Turtle aanmaken 4
        Turtle turtleF = new Turtle("Fred",0.34,'m',2);
        parisdaiza.setTurtle(turtleF);
        Turtle turtleS = new Turtle("Spring",0.55,'v',2);
        parisdaiza.setTurtle(turtleS);
        Turtle turtleW = new Turtle("Winter",0.44,'m',2);
        parisdaiza.setTurtle(turtleW);
        Turtle turtleM = new Turtle("Moon",0.39,'m',2);
        parisdaiza.setTurtle(turtleM);
        // Printen
        System.out.println("Wat zit er in de zoo :");
        System.out.println(parisdaiza.allAnimalsInZoo());
    }
}
