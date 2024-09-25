package laba9;

import java.util.Scanner;

public class Example3 {
    public static Scanner sc = new Scanner(System.in);
    public static int[] arr = new int[10];

    public static void main(String[] args) {
        System.out.println("Дан пустой массив на 10 элементов");
        int[] arrO = arrBild(0);

        System.out.println("Вывод массива на экран с помощью рекурсии");
        arrOut(0);
    }

    public static int[] arrBild (int x){
        if (x==9){
            System.out.println("Введите последний элемент");
            arr[x] = sc.nextInt();
            return arr;
        }
        else{
            System.out.println("Введите " + (x+1) + " элемент массива");
            arr[x] = sc.nextInt();
            return arrBild(x+1);
        }
    }

    public static void arrOut (int x){
        if (x==9){
            System.out.print(arr[x] + " ");
        } else {
            System.out.print(arr[x] + " ");
            arrOut(x+1);
        }
    }
}
