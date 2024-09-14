package laba6;

public class Example4 {
    public static void main(String[] args) {
        int x = 10;
        Someone4.factorial(x);
    }
}

class Someone4 {
    public static void factorial(int x) {
        int substractor = 0;
        int multi = 1;

        while (substractor < x) {
            multi *= (x - substractor);
            substractor += 2;
        }
        System.out.println("Двойной факториал числа " + x + " : " + multi);

    }
}