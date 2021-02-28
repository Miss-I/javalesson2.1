package ru.geekbrains.Moiseeva.level2.lesson1.level2.lesson2;

public class RunningTrack implements Barrier {
    private int length;

    public RunningTrack(int trackLength) {
        this.length = length;
    }

    @Override
    public void doIt(Walking walking) {
        walking.run(length);
    }
}
