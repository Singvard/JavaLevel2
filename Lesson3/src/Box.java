import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {

    private float mass; // масса корзины
    public List<T> list = new ArrayList<T>();

    //вспомогательный метод, определяющий индекс последнего в массиве элемента
    protected int lastIndex(){
        return list.size()-1;
    }

    //метод добавления яблока в корзину
    public void addFruit(T fruit){
            list.add(fruit);
    }

    //метод расчёта массы корзины
    public float getWeight(){
        if (list.isEmpty()) {
            mass = 0;
        } else if (list.get(lastIndex()) instanceof Apple) {
            mass = list.size()*Apple.Weight;
        } else {
            mass = list.size()*Orange.Weight;
        }
        return mass;
    }

    //метод определяет равна ли масса текущий корзины массе указанной
    public boolean compare(Box box) {
        if (getWeight() == box.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public void fillFrom (Box<T> box) {

        if (box.list.isEmpty()) {                                                //если донорская корзина пуста
            return;                                                              //прерываемся, ибо продолжать бессмысленно
        } else if (list.isEmpty() || (list.get(0).equals(box.list.get(0)))) {    //если же целевая корзина пуста или в обеих корзинах лежат одинаковые фрукты
            list.addAll(box.list);                                               //пересыпаем содержимое
            box.list.removeAll(box.list);                                        //и чистим донорскую корзину
        } else {
            System.out.println("Нельзя смешивать яблоки и апельсины!");
        }
    }
}
