package laba3;

//import java.util.Arrays;
//import java.util.Random;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите номер дня недели:");
        int day = id.nextInt();

        switch (day) {
            case 1:
                System.out.println("Сегодня понедельник");
                break;
            case 2:
                System.out.println("Сегодня вторник");
                break;
            case 3:
                System.out.println("Сегодня среда");
                break;
            case 4:
                System.out.println("Сегодня четверг");
                break;
            case 5:
                System.out.println("Сегодня пятница");
                break;
            case 6:
                System.out.println("Сегодня суббота");
                break;
            case 7:
                System.out.println("Сегодня воскресенье");
                break;
            default:
                System.out.println("Введён некорректный день недели");
                break;
        }
    }
}
