package timus.task_1000;

import java.util.Scanner;

public class task_1000 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int val1 = in.nextInt();

        System.out.println("Введите второе число:");
        int val2 = in.nextInt();

        System.out.println("Сумма чисел равна: " + (val1+val2));
    }
}
