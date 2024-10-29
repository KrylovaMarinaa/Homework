public class Main extends Exception{
    public static void main (String [] args) {

        int sum = 0;

        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] incorrectSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"}
        };

        String[][] incorrectDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "HelloWord!!!!", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            sum = checkingTheArray(correctArray);
            System.out.println("Сумма всех элементов в массиве: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            sum = checkingTheArray(incorrectSizeArray);
            System.out.println("Сумма всех элементов в массиве: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            sum = checkingTheArray(incorrectDataArray);
            System.out.println("Сумма всех элементов в массиве: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }




    }

    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

    //Сам метод

    public static int checkingTheArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный формат данных в ячейке [" + i + "][" + j + "] : '" + array[i][j] + "'");
                }
            }
        }

        return sum;
    }




}
