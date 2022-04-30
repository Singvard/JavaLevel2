public class Main {

    public static void main(String[] args) {
	    Member member1Team1 = new Member();
	        member1Team1.setRunning(8140);
	        member1Team1.setJumping(260);
	        member1Team1.setThrowing(76);
        Member member2Team1 = new Member();
            member2Team1.setRunning(12012);
            member2Team1.setJumping(301);
            member2Team1.setThrowing(69);
        Member member3Team1 = new Member();
            member3Team1.setRunning(9831);
            member3Team1.setJumping(288);
            member3Team1.setThrowing(89);
        Member member4Team1 = new Member();
            member4Team1.setRunning(10156);
            member4Team1.setJumping(237);
            member4Team1.setThrowing(47);
        Member member1Team2 = new Member();
            member1Team2.setRunning(9372);
            member1Team2.setJumping(224);
            member1Team2.setThrowing(37);
        Member member2Team2 = new Member();
            member2Team2.setRunning(11754);
            member2Team2.setJumping(283);
            member2Team2.setThrowing(82);
        Member member3Team2 = new Member();
            member3Team2.setRunning(7294);
            member3Team2.setJumping(198);
            member3Team2.setThrowing(74);
        Member member4Team2 = new Member();
            member4Team2.setRunning(9981);
            member4Team2.setJumping(176);
            member4Team2.setThrowing(55);

        Member[] members1 = {member1Team1,member2Team1,member3Team1,member4Team1};
        Team team1 = new Team(members1);
        team1.setName("Чахлики");

        Member[] members2 = {member1Team2,member2Team2,member3Team2,member4Team2};
        Team team2 = new Team(members2);
        team2.setName("Дрищи");

        Course c = new Course();
        c.setRunDist(10000);
        c.setJumpDist(250);
        c.setThrowDist(60);

        c.doIt(team1);
        c.doIt(team2);

        team1.showResults();
        team2.showResults();
    }
}
