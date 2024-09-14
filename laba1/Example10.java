package laba1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Какой ваш год рождения?");
        int age = in.nextInt();

        System.out.println("На момент 2024 года, вам " + (2024 - age) + " лет");
    }
}
