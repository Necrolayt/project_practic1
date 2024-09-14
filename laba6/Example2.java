package laba6;

public class Example2 {
    public static void main(String[] args) {
        Someone2.getInfo();
        Someone2.getInfo();
        Someone2.getInfo();
        Someone2.getInfo();
    }
}

class Someone2 {
    private static int call = 0;

    public static void getInfo() {
        System.out.println("Значение статической переменной: " + call);
        call++;
    }
}