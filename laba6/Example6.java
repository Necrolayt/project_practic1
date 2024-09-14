package laba6;

public class Example6 {
    public static void main(String[] args) {
        int x = 3;
        int[] arr = new int[]{3, 7, 1, 12, 8, 23};
        int[] arrNew = Someone6.arrayBilder(arr, x);

        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + " ");
        }
    }
}

class Someone6 {
    public static int[] arrayBilder(int[] arr, int x) {
        int[] arr2 = new int[arr.length];

        if (x < arr.length) {
            for (int i = 0; i < x; i++) {
                arr2[i] = arr[i];
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
        }
        return arr2;
    }
}