package Lesson01;

public class Cross extends Obstacle {
    public int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Members members) {
        members.run(length);
    }
}
