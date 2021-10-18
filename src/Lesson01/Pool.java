package Lesson01;

public class Pool extends Obstacle {

    public int length;

    public Pool(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Members members) {
        members.swim(length);
    }

}
