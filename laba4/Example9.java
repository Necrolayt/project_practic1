package laba4;

import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        boolean correct = false;
        char answer = '0';
        int val = 0;

        Random random = new Random();
        int[] newAlfCode = new int[1200];
        char[] newAlfSymb = new char[1200];

        //генерация собственного алфавита
        for (int i = 0; i < newAlfCode.length; i++) {
            newAlfCode[i] = random.nextInt(1200);
            newAlfSymb[i] = (char) newAlfCode[i];
        }
        //демонстрация алфавита
        System.out.println("Демонстрация случайных символов нового алфавита: ");
        for (int i = 0; i < 10; i++) {
            val = random.nextInt(1199);
            System.out.println("Символ: " + newAlfSymb[val] + " Индекс: " + val);
        }


        System.out.println("Введите текст для шифрования:");
        String message = id.nextLine();
        System.out.println("Введите ключ:");
        int key = id.nextInt();

        char[] arrayChar = message.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
//
        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + newAlfSymb[i] + key;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        message = new String(arrayCharNew);

        System.out.println("Текст после преобразования:\n" + message);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        while (correct == false) {
            answer = id.next().charAt(0);
            if (answer == 'y')
                correct = true;
            else if (answer == 'n')
                correct = true;
            else
                System.out.println("Введите корректный ответ");
        }
        if (answer == 'n')
            System.out.println("До свидания!");
        else {
            arrayChar = message.toCharArray();
            for (int i = 0; i < arrayChar.length; i++) {
                arrayInt[i] = arrayChar[i] - newAlfSymb[i] - key;
                arrayCharNew[i] = (char) arrayInt[i];
            }
            message = new String(arrayCharNew);
            System.out.println(message);
        }
    }
}
