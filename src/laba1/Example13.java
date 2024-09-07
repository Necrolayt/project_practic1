package laba1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int val1 = in.nextInt();

        System.out.println("Введите второе число:");
        int val2 = in.nextInt();

        System.out.println("Сумма чисел " + val1 + " и " + val2 + " = " + (val1+val2));
    }
}
