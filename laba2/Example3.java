package laba2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, которое делится на 4, и при этом не меньше 10: ");
        int val3 = in.nextInt();

        if (val3 % 4 == 0 & val3 > 10)
            System.out.println("Это число подходит");
        else
            System.out.println("Это число не подходит");

    }
}
