import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {

        //Задание 1
        List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("grey");
        colors.add("green");
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("grey");
        colors.add("yellow");
        colors.add("grey");
        colors.add("blue");
        colors.add("green");
        colors.add("grey");
//        colors.add("yellow");

        Task1 task1 = new Task1(colors);

        task1.printArr();
        task1.countRepeated();
        task1.selectDistinct();

        //Задание 2
        HashMap<String, ArrayList<String>> hm= new HashMap<>();
        PhoneBook ph = new PhoneBook();
        ph.add("Иванов","+79991231212");
        ph.add("Петров","+79991231234");
        ph.add("Сидоров","+79991234567");
        ph.add("Иванов","+79991232121");
        ph.add("Козлов","+79991230000");
        ph.add("Иванов","+79991231221");
        ph.add("Сидоров","+79991239999");

        ph.get("Козлов");
        ph.get("Сидоров");
        ph.get("Петрова");
        ph.get("Иванов");
    }
}
