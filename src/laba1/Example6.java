package laba1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String familia = in.nextLine();

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите отчество: ");
        String otchestvo = in.nextLine();

        System.out.println("Hello, " + familia + " " + name + " " + otchestvo);
        in.close();
    }
}
