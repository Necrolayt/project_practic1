package laba6;

public class Example8 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 9};
        System.out.println("Среднее значение элементов массива: " + Someone8.mediumNum(arr));
    }
}

class Someone8 {
    public static double mediumNum(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum /= arr.length;
        return sum;
    }
}