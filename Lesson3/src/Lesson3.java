import java.util.ArrayList;

public class Lesson3 {

    public static void main(String[] args) {

        //Задание 1
        StringBuilder task = new StringBuilder("Задание 1");
        System.out.println(task);

        MyList list = new MyList(); //создаем массив и наполняем его примитивными типами данных
        list.add("a");
        list.add(2);
        list.add(22.3f);
        System.out.println(list); //выводим содержимое массива
        list.flip(1, 3); //меняем местами 1-й и 3-й элементы массива
        System.out.println(list); //проверяем результат


        //Задание 2
        task = new StringBuilder("\nЗадание 2");
        System.out.println(task);

        Apple apple = new Apple();
        Orange orange = new Orange();


        Box box1 = new Box(); //создаём первую корзину и наполняем её
        box1.addApple(apple);
        box1.addOrange(orange); //пытаемся добавить апельсин к яблокам, ловим предупреждение
        box1.addApple(apple);
        box1.addApple(apple);

        Box box2 = new Box(); //создаём вторую корзину и наполняем её
        box2.addOrange(orange);
        box2.addOrange(orange);
        box2.addApple(apple); //пытаемся добавить яблоко к апельсинам, ловим предупреждение

        Box box3 = new Box(); //создаём третью корзину, пока ничего с ней не делаем

        System.out.println(box1.getWeight()); //выводим массу первой корзины (с 3 яблоками)
        System.out.println(box2.getWeight()); //выводим массу второй корзины (с 2 яблоками)
        System.out.println(box3.getWeight()); //выводим массу пустой корзины

        System.out.println(box2.compare(box1)); //первая корзина должна быть равна второй, т.к. их массы одинаковы
        System.out.println(box3.compare(box1)); //первая корзина не должна быть равна третьей, т.к. их массы различаются

        box3.fillFrom(box1);
        System.out.println(box1);
        System.out.println(box3);

        Box box4 = new Box(); //создаём четвёртую корзину и дополняем в неё
        box4.addOrange(orange);

        box4.fillFrom(box2);
        System.out.println(box2);
        System.out.println(box4);

        box3.fillFrom(box4); //пытаемся пересыпать яблоки в апельсины, но получаем предупреждение
    }
}