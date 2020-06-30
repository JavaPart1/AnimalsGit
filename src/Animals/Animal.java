package Animals;

public class Animal {
    private String naam;
    private double gewicht;
    private char geslacht;
    private int leeftijd;

    public Animal(String naam, double gewicht, char geslacht, int leeftijd) {
        this.naam = naam;
        this.gewicht = gewicht;
        this.geslacht = geslacht;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public double getGewicht() {
        return gewicht;
    }

    public char getGeslacht() {
        return geslacht;
    }

    public int getLeeftijd() {
        return leeftijd;
    }
}
