package Lesson01;

public class Team {
    public String teamName;
    public Members member[];

      public Team(String name,Members ... membersGiven) {
        this.teamName = name;
        this.member = membersGiven;
    }

    public void getTeamInfo() {
        System.out.println("Команда: " + this.teamName);
        for (Members member : member) {
            if (member instanceof Athlete) {
                System.out.println("Член команды: " + member.getName());
            }
        }
            }

   public void doIt(Obstacle obstacle) {
        for (Members member : member) {
            obstacle.doIt(member);
                            }
    }

    public void showResults(){
       for (Members member : member) {
           if (!member.isOnDistance()) {
               break;
           }
       }
    }
}
