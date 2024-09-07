package laba1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Какой день недели?");
        String day = in.nextLine();

        System.out.println("Какой месяц?");
        String mounth = in.nextLine();

        System.out.println("Какой день месяца?");
        int dateM = in.nextInt();

        System.out.println("Сегодня " + day + ", " + mounth + ", " + dateM);
    }
}
