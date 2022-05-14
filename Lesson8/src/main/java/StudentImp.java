import java.util.List;

public class StudentImp implements Student{

    private String name;
    private List<Course> courses;

    public StudentImp(String name, List<Course> courses){
        this.name = name;
        this.courses = courses;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Course> getAllCourse() {
        return courses;
    }
}
