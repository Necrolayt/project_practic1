package laba3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        String line = "";
        int min;
        int max;
        System.out.println("Введите первое число:");
        int val1 = id.nextInt();
        System.out.println("Введите второе число:");
        int val2 = id.nextInt();

        if (val1 < val2) {
            min = val1;
            max = val2;
        } else {
            min = val2;
            max = val1;
        }
        //реализация через for
        for (int i = 0; i < (max - min + 1); i++) {
            line += (min + i) + ", ";
        }
        System.out.println(line);
        line = "";
        //реализация через while
        int i = 0;
        while (i < (max - min + 1)) {
            line += (min + i) + ", ";
            i++;
        }
        System.out.println(line);
    }
}
