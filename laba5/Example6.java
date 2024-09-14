package laba5;

public class Example6 {
    public static void main(String[] args) {
        Someone6 obj = new Someone6(3);
        System.out.println("Вызов метода с 1 аргументом:");
        obj.getValley();
        obj.setValley(41);
        obj.getValley();
        obj.setValley(35);
        obj.getValley();

        Someone6 obj2 = new Someone6(32, 76);
        System.out.println("Вызов метода с 2 аргументами:");
        obj2.getValley();
        obj2.setValley(41, 12);
        obj2.getValley();
        obj2.setValley(35, 35);
        obj2.getValley();

    }
}

class Someone6 {
    private int min;
    private int max;

    Someone6(int x) {
        max = x;
    }

    Someone6(int x, int y) {
        if (x > y) {
            max = x;
            min = y;
        } else if (x == y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }
    }

    public void setValley(int x) {
        if (min == max) {
            if (x > max)

                max = x;

            else
                min = x;
        } else if (min < max) {
            if (x > max)
                max = x;
            else
                min = x;
        }
    }

    public void setValley(int x, int y) {
        if (x > y) {
            max = x;
            min = y;
        } else if (x == y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }
    }

    public void getValley() {
        System.out.println("Min: " + min + " Max: " + max);
    }
}