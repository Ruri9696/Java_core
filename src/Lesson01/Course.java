package Lesson01;

public class Course {
    public Obstacle obstacles[];

    public Course(Obstacle ... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for (Obstacle obstacle : obstacles) {
            team.doIt(obstacle);
                }
    }
}
