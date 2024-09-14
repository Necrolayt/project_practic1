package laba4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr1 = new int[5][5];
        int[][] arr2 = new int[4][4];
        int randi = random.nextInt(4);
        int randj = random.nextInt(4);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = random.nextInt(9);
            }
        }
        int i2 = 0;
        int j2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            j2 = 0;
            if (i != randi) {
                for (int j = 0; j < arr1[0].length; j++) {
                    if (j != randj) {
                        arr2[i2][j2] = arr1[i][j];
                        j2++;
                    }
                }
                i2++;
            }
        }

        System.out.println("Случайная строка - " + randi + " Случайный стобец - " + randj);
        System.out.println("Основной массив");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Массив с удалённой строкой и стобцом");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
