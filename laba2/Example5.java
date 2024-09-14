package laba2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое число: ");
        long val5 = in.nextLong();

        System.out.println("Количество тысяч в данном числе: " + (val5 / 1000));

        in.close();
    }
}
