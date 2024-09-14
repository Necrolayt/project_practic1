package laba3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите название дня недели:");
        String day = id.nextLine();
        //реализация через switch case
        switch (day) {
            case "Понедельник":
            case "понедельник":
                System.out.println("Порядковый номер 1");
                break;
            case "Вторник":
            case "вторник":
                System.out.println("Порядковый номер 2");
                break;
            case "Среда":
            case "среда":
                System.out.println("Порядковый номер 3");
                break;
            case "Четверг":
            case "четверг":
                System.out.println("Порядковый номер 4");
                break;
            case "Пятница":
            case "пятница":
                System.out.println("Порядковый номер 5");
                break;
            case "Суббота":
            case "суббота":
                System.out.println("Порядковый номер 6");
                break;
            case "Воскресенье":
            case "воскресенье":
                System.out.println("Порядковый номер 7");
                break;
            default:
                System.out.println("Такого дня недели нет!");
                break;
        }
        //реализация через if else
        if (day.equals("Понедельник") | day.equals("понедельник"))
            System.out.println("Порядковый номер 1");
        else if (day.equals("Вторник") | day.equals("вторник"))
            System.out.println("Порядковый номер 2");
        else if (day.equals("Среда") | day.equals("среда"))
            System.out.println("Порядковый номер 3");
        else if (day.equals("Четверг") | day.equals("четверг"))
            System.out.println("Порядковый номер 4");
        else if (day.equals("Пятница") | day.equals("пятница"))
            System.out.println("Порядковый номер 5");
        else if (day.equals("Суббота") | day.equals("суббота"))
            System.out.println("Порядковый номер 6");
        else if (day.equals("Воскресенье") | day.equals("воскресенье"))
            System.out.println("Порядковый номер 7");
        else
            System.out.println("Такого дня недели нет!");
    }
}
