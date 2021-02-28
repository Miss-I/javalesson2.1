package ru.geekbrains.Moiseeva.level2.lesson1.level2.lesson2;

public class Wall implements Barrier{
    private int height;

    public Wall(int wallHigh) {
        this.height = height;
    }

    @Override
    public void doIt(Walking walking) {
        walking.jump(height);
    }
}
