package laba3;

import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        char[] arr = new char[10];
        char sumb = 'а';

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sumb;
            sumb += 2;
        }

        System.out.println("Массив в прямом порядке:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nМассив в обратном порядке:");
        for (int i = arr.length; i > 0; i--) {
            System.out.print(arr[i - 1] + " ");
        }
    }
}
