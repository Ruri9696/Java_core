package Lesson01;

public class Athlete implements Members{

public String name;
public boolean onDistance;
public int maxRun;
public int maxSwim;

    public Athlete(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.onDistance = true;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.println(name + " пробежал кросс");
        } else {
            System.out.println(name + " не справился с кроссом");
            onDistance = false;
        }

    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.println(name + " проплыл дистанцию");
        } else {
            System.out.println(name + " не проплыл дистанцию");
            onDistance = false;
        }

    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

}
