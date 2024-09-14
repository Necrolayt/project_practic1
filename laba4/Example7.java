package laba4;

import java.util.Random;

public class Example7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[6][6];
        int invers = 1;
        for (int i = 0; i < arr.length; i++) {
            if (invers % 2 != 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = random.nextInt(10);
                }
            } else {
                for (int j = arr[0].length - 1; j > -1; j--) {
                    arr[i][j] = random.nextInt(10);
                }
            }
            invers++;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
