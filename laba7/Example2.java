package laba7;

public class Example2 {
    public static void main(String[] args) {
        SuperClassLab2 obj1 = new SuperClassLab2("Супер");
        String className = obj1.toString();
        System.out.println(className + "\n");

        SubClassLab2 obj2 = new SubClassLab2(37, "подкласс");
        className = obj2.toString();
        System.out.println(className + "\n");

        System.out.println("Вызываем метод без параметров");
        obj2.setField();
        className = obj2.toString();
        System.out.println(className + "\n");

        System.out.println("Вызываем метод c числовым параметров");
        obj2.setField(104);
        className = obj2.toString();
        System.out.println(className + "\n");

        System.out.println("Вызываем метод со строковым параметром");
        obj2.setField("какая-то строка");
        className = obj2.toString();
        System.out.println(className + "\n");

        System.out.println("Вызываем метод с двумя параметрами");
        obj2.setField(86, "строка метода с двумя параметрами");
        className = obj2.toString();
        System.out.println(className + "\n");
    }
}

class SuperClassLab2{
    private String str1;

    SuperClassLab2(){

    }

    SuperClassLab2(String str1){
        this.str1 = str1;
    }

    public void setField(String str1) {
        this.str1 = str1;
    }

    public int getStringLength () {
        return str1.length();
    }

    public String getField(){
        return str1;
    }

    @Override
    public String toString() {
        String superClassValue;
        superClassValue = "super\n" + "Class name: " + this.getClass().getSimpleName()
                + "\nstr 1 = " + this.str1 + ", длина строки " + getStringLength();
        return superClassValue;
    }
}

class SubClassLab2 extends SuperClassLab2{
    public int num;

    SubClassLab2(int num, String str1) {
        super(str1);
        this.num = num;
    }

    public void setField(){
        num = 10;
    }

    public void setField(int num){
        this.num = num;
    }
    //@Override
    public void setField(String str1){
        super.setField(str1);
    }

    public void setField( int num, String str1){
        super.setField(str1);
        this.num = num;
    }

    @Override
    public String toString() {
        String subClassValue;
        subClassValue = "sub\n" + "Class name: " + this.getClass().getSimpleName()
                + "\nstr 1 = " + this.getField() + " num: " + this.num + ", длина строки " + getStringLength();
        return subClassValue;
    }
}