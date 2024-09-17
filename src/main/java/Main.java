public class Main {
    public static void main (String [] args){
        System.out.println("Задание 1:");
        printThreeWords();
        System.out.println("Задание 2:");
        checkSumSign();
        System.out.println("Задание 3:");
        printColor();
        System.out.println("Задание 4:");
        compareNumbers();
        System.out.println("Задание 5:");
        System.out.println(amount(2,10));
        System.out.println("Задание 6:");
        positiveOrNegative(0);
        System.out.println("Задание 7:");
        System.out.println(positiveOrNegativeTrueFalse(5));
        System.out.println("Задание 8:");
        eighthTask("8 задание", 3);
        System.out.println("Задание 9:");
        System.out.println(leapYear(2024));
        System.out.println("Задание 10:");

        //10 задание

        int[] array = {1, 1, 0, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("");


        System.out.println("Задание 11:");


        //11 задание



        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i ++){
            arr[i] = i+1;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("");

        System.out.println("Задание 12:");


        //12 задание


        int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr12.length; i ++){
            if (arr12[i] < 6) {
                arr12[i] = arr12[i]*2;
            }
        }

        for (int num : arr12) {
            System.out.print(num + " ");
        }
        System.out.println("");

        System.out.println("Задание 13:");


        //13 задание


        int size = 5;
        int[][] array13 = new int[size][size];


        for (int i = 0; i < size; i++) {
            array13[i][i] = 1;
            array13[i][size - 1 - i] = 1;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array13[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Задание 14:");

        int[] result = createArray(0, 10);

        for (int value : result) {
            System.out.print(value + " ");
        }



    }

    //1 задание

    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    //2 задание

    public static void checkSumSign() {

        int a = 5;
        int b = 6;

        int sum = a + b;

        if(sum >=0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    //3 задание

    public static void printColor() {

        int value = 10;

        if(value<=0) System.out.println("Красный");
        else if (value>0&&value<=100) System.out.println("Желтый");
        else if (value>100) System.out.println("Зеленый");
    }

    // 4 задание

    public static void compareNumbers() {

        int a = 5;
        int b = 5;

        if(a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

    //5 задание

    public static boolean amount(int val1, int val2) {

        int sum = val1 + val2;

        if(sum >=10&&sum<=20) return true;
        else return false;
    }

    //6 задание


    public static void positiveOrNegative(int value) {

        if (value>=0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }


    //7 задание


    public static boolean positiveOrNegativeTrueFalse(int value) {

        if (value<0) return true;
        else return false;

    }

    //8 задание


    public static void eighthTask(String str, int value) {

        for(int i=0; i<value; i++){
            System.out.println(str);
        }

    }

    //9 задание


    public static boolean leapYear(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;

    }

    //14 задание

    public static int[] createArray(int len, int initialValue) {

        if (len < 0) {
            throw new IllegalArgumentException("Длина не может быть отрицательной");
        }

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array;
    }

}
