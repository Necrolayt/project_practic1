package laba7;

public class Example3 {
    public static void main(String[] args) {
        SuperClassLab3 object1 = new SuperClassLab3(25);
        String className = object1.toString();
        System.out.println(className);

        SubClassLab3 object2 = new SubClassLab3(30, 'a');
        String subClassName = object2.toString();
        System.out.println(subClassName);

        SubClass2Lab3 object3 = new SubClass2Lab3(30, 'a', "текст");
        String subClassName2 = object3.toString();
        System.out.println(subClassName2);
    }
}

class SuperClassLab3{
    public int num;

    SuperClassLab3(int num){
        this.num = num;
    }

    public void setField(int num){
        this.num = num;
    }
    @Override
    public String toString(){
        String infoSuperl3 = "super\n" + "Class name: " + this.getClass().getSimpleName()
                + "\nnum = " + this.num + "\n";
        return infoSuperl3;
    }

}

class SubClassLab3 extends SuperClassLab3{
    public char sumb;

    SubClassLab3(int num, char sumb){
        super(num);
        this.sumb = sumb;
    }

    public void setField(int num, char sumb){
        this.num = num;
        this.sumb = sumb;
    }

    @Override
    public String toString(){
        String infoSub1l3 = "sub\n" + "Class name: " + this.getClass().getSimpleName()
                + "\nnum = " + this.num + " char = " + this.sumb + "\n";
        return infoSub1l3;
    }
}

class SubClass2Lab3 extends SubClassLab3{
    public String text;

    SubClass2Lab3(int num, char sumb, String text){
        super(num, sumb);
        this.text = text;
    }

    public void setField(int num, char sumb, String text){
        this.num = num;
        this.sumb = sumb;
        this.text = text;
    }

    @Override
    public String toString(){
        String infoSub2l3 = "sub2\n" + "Class name: " + this.getClass().getSimpleName()
                + "\nnum = " + this.num + " char = " + this.sumb + " text: " + this.text + "\n";
        return infoSub2l3;
    }
}