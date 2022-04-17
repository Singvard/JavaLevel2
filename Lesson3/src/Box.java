import java.util.AbstractList;
import java.util.ArrayList;

public class Box extends ArrayList {

    private float mass; // масса корзины

    //вспомогательный метод, определяющий индекс последнего в массиве элемента
    protected int lastIndex(){
        return size()-1;
    }

    //метод добавления яблока в корзину
    public void addApple(Apple apple){
        if (isEmpty() || get(lastIndex()) instanceof Apple ) {
            add(apple);
        } else {
            System.out.println("Нельзя добавлять яблоко к апельсинам!");
        }
    }

    //метод добавления апельсина в корзину
    public void addOrange(Orange orange){
        if (isEmpty() || get(lastIndex()) instanceof Orange ) {
            add(orange);
        } else {
            System.out.println("Нельзя добавлять апельсин к яблокам!");
        }
    }

    //метод расчёта массы корзины
    public float getWeight(){
        if (isEmpty()) {
            mass = 0;
        } else if (get(lastIndex()) instanceof Apple) {
            mass = size()*Apple.Weight;
        } else {
            mass = size()*Orange.Weight;
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

    public void fillFrom (Box box) {

        if (box.isEmpty()) {                                   //если донорская корзина пуста
            return;                                            //прерываемся, ибо продолжать бессмысленно
        } else if (isEmpty() || (get(0).equals(box.get(0)))) { //если же целевая корзина пуста или в обеих корзинах лежат одинаковые фрукты
            addAll(box);                                       //пересыпаем содержимое
            box.removeAll(box);                                //и чистим донорскую корзину
        } else {
            System.out.println("Нельзя смешивать яблоки и апельсины!");
        }
    }
}
