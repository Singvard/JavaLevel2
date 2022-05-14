public class CourseImp implements Course{

    private String courseName;

    public CourseImp(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String courseName() {
        return courseName;
    }
}
