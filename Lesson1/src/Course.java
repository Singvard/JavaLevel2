public class Course {
    private static int runDist;
    private static int jumpDist;
    private static int throwDist;

    public Course() {}

    public void setRunDist(final int runDist) {
        this.runDist = runDist;
    }

    public static int getRunDist() {
        return runDist;
    }

    public void setJumpDist(final int jumpDist) {
        this.jumpDist = jumpDist;
    }

    public static int getJumpDist() {
        return jumpDist;
    }

    public void setThrowDist(final int throwDist) {
        this.throwDist = throwDist;
    }

    public static int getThrowDist() {
        return throwDist;
    }

    public void doIt(Team team){

    }
}