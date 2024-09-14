package laba1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int val1 = in.nextInt();

        int val0 = val1 - 1;
        int val2 = val1 + 1;
        int sqr = (val0 + val1 + val2) * (val0 + val1 + val2);

        System.out.println(val0 + "\t" + val1 + "\t" + val2 + "\t" + sqr);
    }
}
