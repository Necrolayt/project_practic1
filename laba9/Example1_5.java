package laba9;
//пятый учебный пример из задания 1
public class Example1_5 {
    private static int step = 0;
    private  static int number = 8;

    public static void main(String[] args) {
        int rezult = fact(number);
        System.out.println("Число под номером " + number + " последовательности Фибоначи = " + rezult);
    }

    public static void space (int n){
        int result = number-n;
        for (int i = 0; i < result; i++) {
            System.out.print("--");
        }
        System.out.print(">");
    }

    public static int fact (int n){
        space(n);
        System.out.print(n + "\n");
        if (n==0){
            return  0;
        }
        else if (n==1){
            return 1;
        }
        else {
            return fact(n-2) + fact(n-1);
        }
    }
}
