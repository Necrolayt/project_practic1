package laba4;

public class Example4 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
