package laba3;

import java.util.Random;

public class Example10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        int[] bufer = new int[10];
        int maxValue = 0;
        int maxIndex = 0;
        //заполняем массив
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        //выводим массив в консоли
        System.out.println("Массив до сортировки: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //переносим данные из одного массива в другой в обратном порядке
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > maxValue) {
                    maxValue = arr[j];
                    maxIndex = j;
                }
            }//for внутренний
            bufer[i] = maxValue;
            arr[maxIndex] = 0;
            maxValue = 0;
        }//for внешний

        for (int i = 0; i < arr.length; i++) {
            arr[i] = bufer[i];
        }
        //выводим массив в консоли
        System.out.println("\nМассив после сортировки: ");
        for (int i = 0; i < bufer.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
