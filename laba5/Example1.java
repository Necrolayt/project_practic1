package laba5;

public class Example1 {
    public static void main(String[] args) {
        Someone obj = new Someone();
        obj.setChar('H');
        System.out.println("Результат работы второго метода: код символа " + obj.getNumber());
        System.out.println("Результат работы третьего метода:");
        obj.consol();
    }
}

class Someone {
    private char x;

    public void setChar(char x) {
        this.x = x;
    }

    public int getNumber() {
        return (int) x;
    }

    public void consol() {
        System.out.println("Сивол: " + x + " Код символа: " + (int) x);
    }
}
