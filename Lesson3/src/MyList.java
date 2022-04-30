import java.util.ArrayList;

//добавлен новый метод, меняющий 2 указанных элемента массива местами

public class MyList extends ArrayList {

    //реализовал так, как если бы индексация массива начиналась с 1, а не 0.
    public void flip (int a, int b){
        add(get(a-1));
        set(a-1,get(b-1));
        set(b-1,get(size()-1));
        remove(size()-1);
    }
}
