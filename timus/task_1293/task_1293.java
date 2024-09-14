package timus.task_1293;

import java.util.Scanner;

public class task_1293 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите колличество панелей: ");
        int panel = in.nextInt();

        System.out.println("Введите длину панели: ");
        int panel_long = in.nextInt();

        System.out.println("Введите ширину панели: ");
        int panel_height = in.nextInt();

        System.out.println("Всего для проведения работ потребуется " + ((panel*panel_long*panel_height)*2) + " нанограм сульфида");

        in.close();
    }
}
