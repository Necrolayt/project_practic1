package laba1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Сколько вам лет?");
        int age = in.nextInt();

        System.out.println("На момент 2024 года, вы родились в " + (2024 - age) + " году");
    }
}
