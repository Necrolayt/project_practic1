package laba3;

public class Example8 {
    public static void main(String[] args) {
        char[] arr = new char[10];
        char s = 'A';
        boolean correct = false;

        for (int i = 0; i < arr.length; i++) {
            while (correct == false) {
                if (s == 'A' | s == 'E' | s == 'I')
                    s++;
                else
                    correct = true;
            }
            correct = false;
            arr[i] = s;
            s++;
        }

        System.out.println("Вывод массива на консоль");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
