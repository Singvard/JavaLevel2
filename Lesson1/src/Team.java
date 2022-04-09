import java.util.Arrays;

public class Team {
    private String name;
    private Member[] members;

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Team (Member[] members){
        this.members = members;
    }

    public void getInfo(Team team) {
        for (int i = 0; i < members.length; i++) {
            members[i].getRunning();
            members[i].getJumping();
            members[i].getThrowing();
        }
    }

    public void showResults() {
        for (int i = 0; i < members.length; i++) {
            if (members[i].getRunning() >= Course.getRunDist() && members[i].getJumping() >= Course.getJumpDist() && members[i].getThrowing() >= Course.getThrowDist()) {
                System.out.println("Участник №" + (i+1) + " из команды " + getName() + " прошёл дистанцию");
            };
        }
    }
}
