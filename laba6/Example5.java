package laba6;

public class Example5 {
    public static void main(String[] args) {
        int x = 8;
        Someone5.squareMulti(x);
    }
}

class Someone5 {
    public static void squareMulti(int x) {
        int substractor = 0;
        double multi;
        int sum = 0;
        while (substractor < x) {
            multi = Math.pow((x - substractor), 2);
            sum += multi;
            substractor++;
        }
        System.out.println("Cумма квадратов числа " + x + " равна: " + sum);
    }
}
