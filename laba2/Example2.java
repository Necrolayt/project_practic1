package laba2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, остаток от деления на 5 которого равен 2-м, а при делении на 7 остаток равен 1: ");
        int val2 = in.nextInt();

        if (val2 % 5 == 2 & val2 % 7 == 1)
            System.out.println("Это число подходит");
        else
            System.out.println("Это число не подходит");
    }
}
