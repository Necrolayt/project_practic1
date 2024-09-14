package laba6;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        int[] arr = new int[]{76, 23, 4, 18, 40};
        Someone3.numbersManager(31, 4, 7, 12, 10, 41);
        Someone3.numbersManager2(arr);
    }
}

class Someone3 {
    public static void numbersManager(int... numbers) {
        Scanner id = new Scanner(System.in);
        int var = 0;
        int pin = 0;
        boolean correct = false;
        System.out.println("Что вы хотите сделать с переданными значениями?");
        System.out.println("1.Найти наибольшее значение\t 2.Найти наименьшее значение\t 3.Найти среднее значение");
        System.out.println("Введите (1), (2) или (3) соответственно");
        while (correct == false) {
            var = id.nextInt();
            switch (var) {
                case 1:
                    correct = true;
                    break;
                case 2:
                    correct = true;
                    break;
                case 3:
                    correct = true;
                    break;
                default:
                    System.out.println("Введите корректный ответ.");
            }
        }
        if (var == 1) {
            for (int i = 0; i < numbers.length; i++) {
                if (pin < numbers[i])
                    pin = numbers[i];
            }
            System.out.println("Наибольшее значение: " + pin);
        } else if (var == 2) {
            pin = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (pin > numbers[i])
                    pin = numbers[i];
            }
            System.out.println("Наименьшее значение: " + pin);
        } else {
            Arrays.sort(numbers);
            pin = numbers.length / 2;
            System.out.println("Среднее значение: " + numbers[pin]);
        }
        var = 0;
        pin = 0;
    }

    public static void numbersManager2(int[] arr) {

        Scanner id = new Scanner(System.in);
        int var = 0;
        int pin = 0;
        boolean correct = false;
        System.out.println("Что вы хотите сделать с переданными значениями?");
        System.out.println("1.Найти наибольшее значение\t 2.Найти наименьшее значение\t 3.Найти среднее значение");
        System.out.println("Введите (1), (2) или (3) соответственно");
        while (correct == false) {
            var = id.nextInt();
            switch (var) {
                case 1:
                    correct = true;
                    break;
                case 2:
                    correct = true;
                    break;
                case 3:
                    correct = true;
                    break;
                default:
                    System.out.println("Введите корректный ответ.");
            }
        }
        if (var == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (pin < arr[i])
                    pin = arr[i];
            }
            System.out.println("Наибольшее значение: " + pin);
        } else if (var == 2) {
            pin = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (pin > arr[i])
                    pin = arr[i];
            }
            System.out.println("Наименьшее значение: " + pin);
        } else {
            Arrays.sort(arr);
            pin = arr.length / 2;
            System.out.println("Среднее значение: " + arr[pin]);
        }
        var = 0;
        pin = 0;
    }
}
