package laba7;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("Создание объектов суперкласса \n ________________________");
        System.out.println("Создание без передачи параметров");
        SuperClassLab4 object1 = new SuperClassLab4();
        String className = object1.toString();
        System.out.println(className);
        System.out.println("Создание с передачей параметров");
        SuperClassLab4 object2 = new SuperClassLab4('g');
        className = object2.toString();
        System.out.println(className);
        System.out.println("Создание без передачи параметров снова");
        SuperClassLab4 object3 = new SuperClassLab4();
        className = object3.toString();
        System.out.println(className);

        System.out.println("Создание объектов наследника \n ________________________");
        System.out.println("Создание без передачи параметров");
        SubClassLab4 object4 = new SubClassLab4();
        className = object4.toString();
        System.out.println(className);
        System.out.println("Создание с передачей параметров");
        SubClassLab4 object5 = new SubClassLab4('а',"текст");
        className = object5.toString();
        System.out.println(className);
        System.out.println("Создание без передачи параметров снова");
        SubClassLab4 object6 = new SubClassLab4();
        className = object6.toString();
        System.out.println(className);

        System.out.println("Создание объектов наследника наследника \n ________________________");
        System.out.println("Создание без передачи параметров");
        SubClass2Lab4 object7 = new SubClass2Lab4();
        className = object7.toString();
        System.out.println(className);
        System.out.println("Создание с передачей параметров");
        SubClass2Lab4 object8 = new SubClass2Lab4('F',"новый текст", 27);
        className = object8.toString();
        System.out.println(className);
        System.out.println("Создание без передачи параметров снова");
        SubClass2Lab4 object9 = new SubClass2Lab4();
        className = object9.toString();
        System.out.println(className);


    }
}

class SuperClassLab4{
    public char sumb;
    static char copySumb = '0';

    SuperClassLab4(char sumb){
        this.sumb = sumb;
        copySumb = sumb;
    }

    SuperClassLab4(){
        sumb = copySumb;
    }

    @Override
    public String toString(){
        String infoSuperl4 = "super\n" + "Class name: " + this.getClass().getSimpleName()
                + "\nchar = " + this.sumb + "\n";
        return infoSuperl4;
    }
}

class SubClassLab4 extends SuperClassLab4{
    public String text;
    static char copySumb = '0';
    static String copyText = " ";

    SubClassLab4 (char sumb, String text){
        super(sumb);
        this.text = text;
        copySumb = sumb;
        copyText = text;
    }

    SubClassLab4(){
        sumb = copySumb;
        text = copyText;
    }

    @Override
    public String toString(){
        String infoSubl4 = "sub\n" + "Class name: " + this.getClass().getSimpleName()
                + "\nchar = " + this.sumb + " text: " + this.text +"\n";
        return infoSubl4;
    }
}

class SubClass2Lab4 extends SubClassLab4 {
    public int num;
    static char copySumb = '0';
    static String copyText = " ";
    static int copyNum = 0;

    SubClass2Lab4(char sumb, String text, int num){
        super (sumb, text);
        this.num = num;
        copySumb = sumb;
        copyText = text;
        copyNum = num;
    }

    SubClass2Lab4(){
        sumb = copySumb;
        text = copyText;
        num = copyNum;
    }

    @Override
    public String toString(){
        String infoSub2l4 = "sub2\n" + "Class name: " + this.getClass().getSimpleName()
                + "\nchar = " + this.sumb + " text: " + this.text + " int: " + this.num + "\n";
        return infoSub2l4;
    }
}