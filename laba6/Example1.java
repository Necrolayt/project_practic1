package laba6;

public class Example1 {
    public static void main(String[] args) {
        Someone1 obj = new Someone1();
        char[] x = new char[]{'d', '2', '1', 'K', 'L'};
        char[] y = new char[]{'Q'};

        obj.getInfo();
        obj.setField('М');
        obj.getInfo();
        obj.setField("Привет");
        obj.getInfo();
        obj.setField(x);
        obj.getInfo();
        obj.setField(y);
        obj.getInfo();
    }
}

class Someone1 {
    char a;
    String text;

    public void setField(char a) {
        this.a = a;
    }

    public void setField(String text) {
        this.text = text;
    }

    public void setField(char[] x) {
        if (x.length == 1)
            a = x[0];
        else
            text = String.copyValueOf(x);
    }

    public void getInfo() {
        System.out.println("Символ: " + a + " Строка: " + text);
    }

}