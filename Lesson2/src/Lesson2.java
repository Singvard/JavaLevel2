public class Lesson2 {

    public static void main(String[] args) {
        String[][] str = {{"1","2","3","4"},{"1","2","3","4"},{"-1","-2","-3","-4"},{"-1","-2","-3","-4"}};

        checkArray(str);

    }

    public static void checkArray(String[][] str) {
        try {
            checkLength(str);
        } catch (MyArraySizeException e1) {
            e1.printStackTrace();
            return;
        }

        try {
            checkData(str);
        } catch (MyArrayDataException e2) {
            e2.printStackTrace();
            return;
        }
    }

    public static void checkLength(String[][] str) throws MyArraySizeException {
        if (str.length != 4 || str[0].length != 4 || str[1].length != 4 || str[2].length != 4 || str[3].length != 4){
            System.out.println("Массив должен быть размером 4х4");
            throw new MyArraySizeException();
        } else {
            System.out.println("Размерность массива соответствует требованиям");
        }
    }

    public static void checkData(String[][] str) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (isInteger(str[i][j])) {
                    sum += Integer.parseInt(str[i][j]);
                }
                else {
                    System.out.println("Элемент в ячейке (" + (i+1) + "," + (j+1) + ") не является числом");
                    throw new MyArrayDataException();
                }
            }
        }
        System.out.println("Сумма всех элементов массив равна " + sum);
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
