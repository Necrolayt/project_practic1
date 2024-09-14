package laba6;

public class Example10 {
    public static void main(String[] args) {

        int[] arr = Someone10.arrayBilder(2, 6, 12, 435, 32, 0, 1, 43);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Someone10 {
    public static int[] arrayBilder(int... nums) {
        int[] array = new int[2];
        int min = nums[0];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i])
                min = nums[i];
            if (max < nums[i])
                max = nums[i];
        }
        array[0] = min;
        array[1] = max;
        return array;
    }
}
