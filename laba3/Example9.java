package laba3;

import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        String line = "";

        //заполняем массив случайными числами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        int min = arr[0];

        //выводим массив в консоли
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //находим минимальный элемент массива
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) line += i + ", ";
        }
        System.out.println("\nМинимальный элемент: " + min + ", Индекс: " + line);
    }
}
