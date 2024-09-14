package laba4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arrOne = new int[3][5];
        int[][] arrTwo = new int[5][3];
        //заполняем основной массив
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrOne[0].length; j++) {
                arrOne[i][j] = random.nextInt(50);
            }

        }
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrOne[0].length; j++) {
                arrTwo[j][i] = arrOne[i][j];
            }

        }
        System.out.println("Основной массив");
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrOne[0].length; j++) {
                System.out.print(arrOne[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Второстепенный массив");
        for (int i = 0; i < arrTwo.length; i++) {
            for (int j = 0; j < arrTwo[0].length; j++) {
                System.out.print(arrTwo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
