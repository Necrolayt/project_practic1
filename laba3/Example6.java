package laba3;

import java.util.Scanner;
import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner id = new Scanner(System.in);
        boolean correct = false;
        int num;
        int size = 0;
        String line = "";

        while (correct == false) {
            System.out.println("Массив какого размера нужно создать?");
            size = id.nextInt();
            if (size < 1)
                System.out.println("Введено некорректное значение!");
            else
                correct = true;
        }
        correct = false;

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            while (correct == false) {
                num = random.nextInt(100);
                if (num % 5 == 2) {
                    nums[i] = num;
                    correct = true;
                }//if
            }//while
            correct = false;
        }//for
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
