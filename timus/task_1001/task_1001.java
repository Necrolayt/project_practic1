package timus.task_1001;

import java.util.Scanner;

public class task_1001 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        double val1 = in.nextDouble();
        double val2 = Math.sqrt(val1);

        System.out.println("Квадратный корень числа " + val1 + " равен " + val2);

    }
}
