package timus.task_2012;

import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Сколько задач решит Гриша за первый час (от 1 до 11 максимум)?");
        int work = in.nextInt();
        int ostatok = 5; //поскольку, решая каждую задачу за 45 минут, за оставшиеся 4 часа, их получится решить не больше 5
        if (work<1 | work>11)
            System.out.println("Введено некорректное колличество задач!");
        else if (work + ostatok < 12)
            System.out.println("No");
        else
            System.out.println("Yes");

        in.close();
    }
}
