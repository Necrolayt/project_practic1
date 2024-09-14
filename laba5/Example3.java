package laba5;

public class Example3 {
    public static void main(String[] args) {
        Someone3 obj1 = new Someone3();
        Someone3 obj2 = new Someone3(10);
        Someone3 obj3 = new Someone3(20, 35);
    }
}

class Someone3 {
    int a;
    int b;

    Someone3() {

    }

    Someone3(int a) {
        this.a = a;
    }

    Someone3(int a, int b) {
        this.a = a;
        this.b = b;
    }
}