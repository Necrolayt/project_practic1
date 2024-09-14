package laba5;

public class Example5 {
    public static void main(String[] args) {
        Someone5 obj = new Someone5(13);
        obj.setX();
        System.out.println("Метод без аргумента х: " + obj.getX());
        obj.setX(84);
        System.out.println("Метод с аргументом: " + obj.getX());
        obj.setX(10003);
        System.out.println("Метод с аргументом >100: " + obj.getX());
    }
}

class Someone5 {
    private int x;

    Someone5(int x) {
        if (x > 100)
            this.x = 100;
        else
            this.x = x;
    }

    public void setX() {
        x = 0;
    }

    public void setX(int x) {
        if (x > 100)
            this.x = 100;
        else
            this.x = x;
    }

    public int getX() {
        return x;
    }

}
