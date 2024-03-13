package main.java.lab.I7.constructors.exercises;

public class Car {
 private String name;
 private String color;
 private int releaseYear;
 private int horsePower;
 private boolean secondHand;

    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHande) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHande;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", releaseYear=" + releaseYear +
                ", horsePower=" + horsePower +
                ", secondHand=" + secondHand +
                '}';
    }

    public Car(String name, String color, boolean secondHande) {
        this (name,color,-1,-1,secondHande);

    }
}
