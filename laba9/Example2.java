package laba9;

import java.util.Scanner;

public class Example2 {
    static String num ="";
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число, которое нужно перевести в двоичный код");
        duo(scn.nextInt());
        System.out.println("Число в двоичном виде:" + num);
    }

    public static void duo (int x){
        int ostatok;
        if (x==1){
            num +=1;
        }
        else{
            ostatok = x%2;
            duo(x/2);
            num += ostatok;
        }
    }
}
