package ru.geekbrains.Moiseeva.level2.lesson1.level2.lesson2;

public class MainApp {
    public static void main(String[] args) {
        Walking[] members = {
                new Human("Bob"),
                new Cat("Barsik"),
                new Robot("Kosmik")
        };
        Barrier [] barriers = {
                new Wall(350),
                new RunningTrack(7000),
                new RunningTrack( 15000)
        };
        for (Walking walking : members) {
            for (Barrier barrier : barriers){
                barrier.doIt(walking);
            } if (!walking.isOnTheDistance())
                break;
        }

    }
}
