package laba1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ваше имя?");
        String name = in.nextLine();

        System.out.println("Какой ваш год рождения?");
        int age = in.nextInt();

        System.out.println(name + ", вам " + (2024 - age) + " лет");
    }
}
