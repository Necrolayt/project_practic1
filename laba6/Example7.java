package laba6;

public class Example7 {
    public static void main(String[] args) {
        char[] sumb = new char[]{'f', 'z', 'г', '3', '&'};
        int[] arr = Someone7.charBilder(sumb);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Someone7 {
    public static int[] charBilder(char[] sumb) {
        int[] nums = new int[sumb.length];
        for (int i = 0; i < sumb.length; i++) {
            nums[i] = (int) sumb[i];
        }
        return nums;
    }
}
