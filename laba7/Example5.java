package laba7;

public class Example5 {
    public static void main(String[] args) {
        SuperClassLab5 obj1 = new SuperClassLab5("Объект-родитель");
        obj1.getInfo();
        SubClass1Lab5 obj2 = new SubClass1Lab5("Объект-наследник", 90);
        obj2.getInfo();
        SubClass2Lab5 obj3 = new SubClass2Lab5("Объект-наследник2", 'H');
        obj3.getInfo();
        System.out.println("Вызов наследника через объектную переменную суперкласса");
        SuperClassLab5 ref = obj2;
        ref.getInfo();
    }
}

class SuperClassLab5{
    private String text;

    SuperClassLab5(String text){
        this.text = text;
    }

    public void getInfo() {
        System.out.println("super\n" + "Class name: " + this.getClass().getSimpleName() + "\ntext = " + this.text + "\n");
    }

    public String getField(){
        return text;
    }
}

class SubClass1Lab5 extends SuperClassLab5{
    private int num;

    SubClass1Lab5(String text, int num){
        super(text);
        this.num = num;
    }

    @Override
    public void getInfo() {
        System.out.println("sub\n" + "Class name: " + this.getClass().getSimpleName() + "\ntext = " + getField()
                + " num: " + this.num + "\n");
    }

}

class SubClass2Lab5 extends SuperClassLab5{
    private char sumb;

    SubClass2Lab5(String text, char sumb){
        super(text);
        this.sumb = sumb;
    }

    @Override
    public void getInfo() {
        System.out.println("sub2\n" + "Class name: " + this.getClass().getSimpleName() + "\ntext = " + getField()
                + " char: " + this.sumb + "\n");
    }
}