package Lesson01;

public class HW01 {

    public static void main(String[] args) {

        Course c = new Course(new Obstacle[] {
                new Cross(5),
                new Pool(7)
        });
        Team team = new Team("Ракета",
                new Athlete("Василий", 4, 12),
                new Athlete("Никита", 8, 6));

        team.getTeamInfo();
        System.out.println(" ");
        System.out.println("Результаты испытаний: ");
        c.doIt(team);
        team.showResults();

    }

   }
