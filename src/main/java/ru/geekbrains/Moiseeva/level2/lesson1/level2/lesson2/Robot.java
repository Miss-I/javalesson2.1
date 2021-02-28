package ru.geekbrains.Moiseeva.level2.lesson1.level2.lesson2;

public class Robot implements Walking{
    private String name;
    private int jumpHeigth;
    private int runLength;
    private boolean isOnDistance;

    public Robot(String name) {
        this.name = name;
        this.jumpHeigth = 150;
        this.runLength = 30000;
        this.isOnDistance = true;
    }

    @Override
    public void run(int length) {
        if (length < runLength) {
            System.out.println(name + "побежал дистанцию");
        } else {
            System.out.println(name + "Не смог пробежать");
            isOnDistance = false;
        }
    }


    @Override
    public void jump(int heigth) {
        if (heigth < jumpHeigth) {
            System.out.println(name + "перепрыгнул препядствие");
        } else {
            System.out.println(name + "Не смог перепрыгнуть");
            isOnDistance = false;
        }
    }

    @Override
    public boolean isOnTheDistance() {
        return isOnDistance;
    }
}
