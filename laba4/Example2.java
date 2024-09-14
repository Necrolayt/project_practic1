package laba4;

public class Example2 {
    public static void main(String[] args) {
        int figure = 10;

        for (int i = 0; i <= figure; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("o");
            }
            System.out.println();
        }
    }
}
