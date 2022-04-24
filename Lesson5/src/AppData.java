public class AppData {
    /*
    Класс работающий с данными для нашего csv-файла
    */

    //Шапка таблицы - массив из наименований колонок
    private String[] header;

    //Двумерный массив из целых чисел для наполнения таблицы
    private int[][] data;

    public AppData() {}

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void setHeader(final String[] header) {
        this.header = header;
    }

    public void setData(final int[][] data) {
        this.data = data;
    }
}