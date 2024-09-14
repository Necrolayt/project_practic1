package timus.task_1820;

import java.util.Scanner;

public class task_1820 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите колличество заказанных стейков");
        double beaf = in.nextInt();

        System.out.println("Укажите вместимость сковороды (от 1 до 5)");
        double capacity = in.nextInt();

        if (capacity<1 | capacity >5)
            System.out.println("Некорректная вместимость сковороды!");
        else
            System.out.println(" Для приготовления " + beaf + " стейков потребуется " + ((beaf/capacity)*2) + " минут.");

        in.close();
    }
}
