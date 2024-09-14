package laba3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        String fibonachi = "";
        int first = 0;
        int second = 1;
        int operate;
        int x = 0;
        System.out.println("Сколько чисел фибоначи нужно вывести?:");
        int call = id.nextInt();

        //реализация через for
        for (int i = 0; i < call; i++) {
            operate = second;
            fibonachi += second + ", ";
            second = second + first;
            first = operate;
        }
        System.out.println(fibonachi);
        fibonachi = "";
        first = 0;
        second = 1;
        //реализация через while
        while (x < call) {
            operate = second;
            fibonachi += second + ", ";
            second = second + first;
            first = operate;
            x++;
        }
        System.out.println(fibonachi);
    }
}
