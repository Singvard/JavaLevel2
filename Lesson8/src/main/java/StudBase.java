import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudBase {

    public static void main(String[] args) {

        Course algorithms = new CourseImp("Algorithms & Complexity");
        Course architecture = new CourseImp("Architecture of Computer");
        Course graphics = new CourseImp("Computer Graphics");
        Course cryptography = new CourseImp("Cryptography");
        Course management = new CourseImp("IT management");
        Course networking = new CourseImp("Networking");
        Course programming = new CourseImp("Programming");
        Course software = new CourseImp("Software Engineering");

        Student abdul = new StudentImp("Abdul Jabbar", Arrays.asList(graphics,management));
        Student hitomi = new StudentImp("Hitomi Tanaka", Arrays.asList(architecture,cryptography,networking));
        Student jack = new StudentImp("Jack Ripper", Arrays.asList(algorithms, programming, software, networking));
        Student mbenge = new StudentImp("Mbenge Thulani", Arrays.asList(management, architecture, cryptography));
        Student vaclav = new StudentImp("Vaclav Prospal", Arrays.asList(software));

        studentCourses(Stream.of(abdul,hitomi,jack,mbenge,vaclav), algorithms)
                .forEach(student -> System.out.println(student.getName() + " посещает курс " + algorithms.courseName()));
        studentCourses(Stream.of(abdul,hitomi,jack,mbenge,vaclav), architecture)
                .forEach(student -> System.out.println(student.getName() + " посещает курс " + architecture.courseName()));
        studentCourses(Stream.of(abdul,hitomi,jack,mbenge,vaclav), graphics)
                .forEach(student -> System.out.println(student.getName() + " посещает курс " + graphics.courseName()));
        studentCourses(Stream.of(abdul,hitomi,jack,mbenge,vaclav), cryptography)
                .forEach(student -> System.out.println(student.getName() + " посещает курс " + cryptography.courseName()));
        studentCourses(Stream.of(abdul,hitomi,jack,mbenge,vaclav), management)
                .forEach(student -> System.out.println(student.getName() + " посещает курс " + management.courseName()));
        studentCourses(Stream.of(abdul,hitomi,jack,mbenge,vaclav), networking)
                .forEach(student -> System.out.println(student.getName() + " посещает курс " + networking.courseName()));
        studentCourses(Stream.of(abdul,hitomi,jack,mbenge,vaclav), programming)
                .forEach(student -> System.out.println(student.getName() + " посещает курс " + programming.courseName()));

        System.out.println();

        studentProgress(Stream.of(abdul,hitomi,jack,mbenge,vaclav))
                .forEach(student -> System.out.println(student.getName() + " - один из лучших студентов!"));

        System.out.println();

        uniqueCourse(Stream.of(abdul,hitomi,jack,mbenge,vaclav))
                .forEach(course -> System.out.println(course.courseName()));
    }

    public static List<Student> studentCourses(Stream<Student> studentStream, Course course){
        return studentStream
                .filter(student -> student.getAllCourse().contains(course))
                .collect(Collectors.toList());
    }

    public static List<Student> studentProgress(Stream<Student> studentStream){

        Comparator<Student> studentComparator = Comparator.comparingInt(student -> student.getAllCourse().size());

        return studentStream
                .sorted(studentComparator.reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static List<Course> uniqueCourse(Stream<Student> studentStream){
        return studentStream
                .map(Student::getAllCourse)
                .flatMap(courses -> courses.stream())
                .distinct()
                .collect(Collectors.toList());
    }
}
