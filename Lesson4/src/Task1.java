import java.util.*;


public class Task1 {

    private List<String> arr = new ArrayList<>();

    public Task1(List<String> arr) {
        this.arr = arr;
    }

    public void selectDistinct(){
        Set<String> unique = new HashSet<>(arr);
        System.out.println("\nМассив без повторений: ");
        for(String s : unique) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void printArr(){
        System.out.println("Массив состоит из элементов: ");
        for (String s : arr){
            System.out.println(s);
        }
    }

    public void countRepeated(){

        System.out.println("\nПовторы элементов: ");

        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            } else {
                map.put(s, 1);
            }
        }
        for (Map.Entry<String,Integer> m: map.entrySet()) {
            System.out.printf("Элемент %s повторяется %s раз \n", m.getKey(), m.getValue());
        }
    }
}