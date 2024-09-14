package laba7;

public class Example1 {
    public static void main(String[] args) {
        SuperClassTest superClassObject = new SuperClassTest("Передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        SubclassTest subClassObject = new SubclassTest(" Передал в конструктор подкласса ");
        String subClassName = subClassObject.toString();
        System.out.println(subClassName);

        SubclassTest subClassObject2 = new SubclassTest(" Передал в конструктор подкласса ", " два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}

class SuperClassTest {
    private String str1;

    SuperClassTest(String strEx) {
        this.str1 = strEx;
    }

    SuperClassTest() {
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super\n" + "Class name: " + this.getClass().getSimpleName()
                + "\nstr 1 = " + this.getStr1();
        return superClassNameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}

class SubclassTest extends SuperClassTest {
    private String str2;
    private String str3;

    SubclassTest(String strEx) {
        super(strEx);
    }

    SubclassTest(String strEx2, String strEx3) {
        this.str2 = strEx2;
        this.str3 = strEx3;
    }

    @Override
    public String toString() {
        String classNameAndFieldValue;
        classNameAndFieldValue = "sub\n" + "Class name: " + this.getClass().getSimpleName()
                + "\nstr 1 = " + this.getStr1() + " str 2 = " + this.str2 + " str 3 = " + this.str3;
        return classNameAndFieldValue;
    }

    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
}