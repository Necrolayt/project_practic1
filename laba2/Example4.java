package laba2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое число: ");
        int val4 = in.nextInt();

        if (val4 >= 5 & val4 <= 10)
            System.out.println("Это число входит в диапазон от 5 до 10");
        else
            System.out.println("Это число не входит в диапазон от 5 до 10");

        in.close();
    }
}
