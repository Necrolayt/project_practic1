package laba6;

public class Example9 {
    public static void main(String[] args) {
        char[] sumb = new char[]{'2', 'u', 'v', '#', 'I', 'h'};
        Someone9.charsMirror(sumb);
    }
}

class Someone9 {
    public static void charsMirror(char[] sumb) {
        char operate;
        int substractor = 1;

        for (int i = 0; i < sumb.length / 2; i++) {
            operate = sumb[i];
            sumb[i] = sumb[sumb.length - substractor];
            sumb[sumb.length - substractor] = operate;
            substractor++;
        }
        for (int i = 0; i < sumb.length; i++) {
            System.out.print(sumb[i] + " ");
        }
    }
}
