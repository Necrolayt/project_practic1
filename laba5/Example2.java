package laba5;

public class Example2 {
    public static void main(String[] args) {
        Someone2 obj = new Someone2();
        obj.charLiner();
    }
}

class Someone2 {
    char a = 'C';
    char b = 'V';

    public void charLiner() {
        int num;

        if (a < b) {
            num = (int) a;
            while (num <= (int) b) {
                System.out.print((char) num + " ");
                num++;
            }//while
        } else if (a > b) {
            num = (int) b;
            while (num <= (int) a) {
                System.out.print((char) num + " ");
                num++;
            }//while
        } else
            System.out.print(a);
    }
}