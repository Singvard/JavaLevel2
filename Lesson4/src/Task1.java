import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Task1 {

    protected int count;
    private List<String> arr = new ArrayList<>();

    public Task1(List<String> arr) {
        this.arr = arr;
    }

    public void selectDistinct(){
        Collections.sort(arr);
        for (int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i) == arr.get(i+1)) {
                arr.remove(i);
                i =-1;
            }
        }
    }

    public void printArr(){
        System.out.println("Массив состоит из элементов: ");
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }

    public void countRepeated(){
        Collections.sort(arr);
        count = 1;
        for (int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i) == arr.get(i+1) && (i+1) != arr.size()-1) {              //Если текущей равен следующему, но ещё не конец массива
                count++;
            } else if (arr.get(i) == arr.get(i+1) && (i+1) == arr.size()-1) {       //Если текущей равен следующему и уже конец массива
                System.out.println("Элемент " + arr.get(i) + " имеет " + (count+1) + " вхождений в массив");
            } else if (arr.get(i) != arr.get(i+1) && (i+1) != arr.size()-1){        //Если текущей НЕ равен следующему, но ещё не конец массива
                System.out.println("Элемент " + arr.get(i) + " имеет " + count + " вхождений в массив");
                count = 1;
            } else if (arr.get(i) != arr.get(i+1) && (i+1) == arr.size()-1) {       //Если текущей НЕ равен следующему и уже конец конец массива
                System.out.println("Элемент " + arr.get(i) + " имеет " + count + " вхождений в массив");
                System.out.println("Элемент " + arr.get(i+1) + " имеет 1 вхождение в массив");
            }
        }
    }
}