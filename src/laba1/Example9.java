package laba1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца");
        String mounth = in.nextLine();

        System.out.println("Сколько в нём дней?");
        int days = in.nextInt();

        System.out.println("в месяце " + mounth + " " + days + " дней");
    }
}
