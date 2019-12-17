package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 80;
        int highestNumber = 90;


        int[] array = createNumberArray(size, lowestNumber, highestNumber);
        printArray(array);
        System.out.println("After bubble sort");
        printArray(BubbleSort(array));

    }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }

    public static void Pattern1() {
        for (int rows = 0; rows < 6; rows++) {

            for (int columns = 0; columns < 6; columns++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void Pattern2() {
        for (int rows = 1; rows <= 6; rows++) {


            for (int columns = 0; columns < 6; columns++) {


                System.out.print(rows);

            }
            System.out.println();
        }

    }

    public static void Pattern3() {
        for (int rows = 1; rows <= 6; rows++) {

            for (int columns = 1; columns <= 6; columns++) {

                System.out.print(columns);

            }
            System.out.println();
        }


    }

    public static void Pattern4() {
        for (int rows = 1; rows <= 6; rows++) {

            for (int columns = 1; columns <= rows; columns++) {


                System.out.print("*");
            }

            System.out.println();
        }


    }

    public static void Pattern5() {
        for (int rows = 1; rows <= 6; rows++) {

            for (int columns = 1; columns <= rows; columns++) {


                System.out.print(columns);
            }

            System.out.println();
        }

    }

    public static int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];


        }


        return sum;
    }

    public static int min(int[] array) {
        int min = 1;


        for (int i = 1; i > array.length; i++) {
            min += array[1];
        }

        return min;
    }

    public static int max(int[] array) {
        int max = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[1] > max) {

                max = array[1];
            }

        }

        return max;
    }

    public static int[] BubbleSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {

            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    int temp = array [j];
                    array [j] = array[i];
                    array [i] = temp;

                }
            }
        }
       return array;


    }

}
