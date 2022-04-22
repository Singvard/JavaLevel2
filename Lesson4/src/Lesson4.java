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
        task1.printArr();
        task1.countRepeated();

        //Задание 2
        HashMap<String, String> hm= new HashMap<>();
        PhoneBook ph = new PhoneBook(hm);
        ph.add("+79991231212","Иванов");
        ph.add("+79991231234","Петров");
        ph.add("+79991234567","Сидоров");
        ph.add("+79991232121","Иванов");
        ph.add("+79991230000","Козлов");
        ph.add("+79991231221","Иванов");
        ph.add("+79991239999","Сидоров");

        ph.get("Козлов");
        ph.get("Сидоров");
        ph.get("Петров");
        ph.get("Иванов");
    }
}
