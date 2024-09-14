package laba3;

import java.util.Scanner;
import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner id = new Scanner(System.in);
        String line = "";
        boolean correct = false;
        int num;
        int sum = 0;
        int x = 0;
        System.out.println("Сколько чисел для сложения нужно создать?");
        int how = id.nextInt();

        //реализация для for
        for (int i = 0; i < how; i++) {
            while (correct == false) {
                num = random.nextInt(500);
                if ((num % 5 == 2) | (num % 3 == 1)) {
                    line += num;
                    sum += num;
                    correct = true;
                }//if
            }//while
            if (i < how - 1) {
                line += " + ";
            }
            correct = false;
        }//for
        System.out.println(line + " = " + sum);

        //реализация для while
        line = "";
        sum = 0;

        while (x < how) {
            while (correct == false) {
                num = random.nextInt(500);
                if ((num % 5 == 2) | (num % 3 == 1)) {
                    line += num;
                    sum += num;
                    correct = true;
                }//if
            }//while
            if (x < how - 1) {
                line += " + ";
            }
            correct = false;
            x++;
        }//while
        System.out.println(line + " = " + sum);
    }
}
