package laba2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int val1 = in.nextInt();

        if (val1 % 3 == 0)
            System.out.println("Число делится на 3");
        else
            System.out.println("Число не делится на 3");

    }

}
