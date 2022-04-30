import java.io.*;

public class Lesson5 {

    //Строковая константа - разделитель
    static final String delimiter = ";";

    public static void main(String[] args) {
        //абсолютный путь к файлу
        String path1 = "C:\\Users\\Сергей\\Documents\\Git\\JavaLevel2\\Lesson5\\output.csv";
        //забираем данные из файла
        AppData file = read(path1);
        //сохраняем данные (в другой файл)
        save(file);
    }

    public static AppData read (String path){ //Метод обращается к указанному файлу по абсолютному пути и парсит данные на 2 массива: header и data из класса AppData
        AppData aFile = new AppData();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            try {
                //Объявляем кучу вспомогательного барахла
                int j = 0;
                String[] lines;
                String line;
                int x = getLineCount(path) - 1; //Вычитаем единицу, т.к. одна строка отводится под массив header
                int y = getColCount(path);
                int[][] metadata = new int[x][y];

                while ((line = reader.readLine()) != null) { //Пока есть непустые строки в файле
                    lines = line.split(";");           //Каждую строку расщепляем на элементы массива

                    if (j == 0) {
                        aFile.setHeader(lines);              //Самая первая строка превращается в шапку таблицы
                    } else {
                        for (int i = 0; i < lines.length; i++) {
                            metadata[j-1][i] = Integer.parseInt(lines[i]); //Последующие строки превращаем в числа и кладём в промежуточный массив
                        }
                    }
                    j++; //Хоть цикл неопределённый, но сумматор нужен
                }
                aFile.setData(metadata); //Передаем таблицу из целых чисел
                reader.close(); //Чтение завершено
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return aFile;
    }

    public static void save(AppData aFile) {
        String path2 = "C:\\Users\\Сергей\\Documents\\Git\\JavaLevel2\\Lesson5\\output_backup.csv"; //По-хорошему тут должен быть path1, но я изменил путь, чтобы проверить работу метода.
        try {
            //Создаём новую запись
            BufferedWriter writer = new BufferedWriter(new FileWriter(path2));

            //Добавляем шапку таблицы
            for (String name : aFile.getHeader()) {
                writer.write(name + delimiter);
            }
            //Добавляем массив данных
            for (int i = 0; i < aFile.getData().length; i++) {
                writer.write("\n");
                for (int j = 0; j < aFile.getData()[i].length; j++) {
                    writer.write(aFile.getData()[i][j] + delimiter);
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    Вспомогательный метод, считающий количество строк во всём файле.
    Найденное значение (с вычитанием единицы) устанавливается в качестве первой размерности
    массива данных data из класса AppData в методе read.
     */
    public static int getLineCount(String fileName) throws IOException {
        try (var lnr = new LineNumberReader(new BufferedReader(new FileReader(fileName)))) {
            while (lnr.readLine() != null) ;
            return lnr.getLineNumber();
        }
    }

    /*
    Вспомогательный метод, считающий количество столбцов во всём файле.
    Найденное значение устанавливается в качестве второй размерности
    массива данных data из класса AppData в методе read.
     */
    public static int getColCount(String fileName) throws IOException {
        try (var rdr = new BufferedReader(new FileReader(fileName))) {
            if (rdr.readLine() != null);
            return rdr.readLine().split(";").length;
        }
    }
}