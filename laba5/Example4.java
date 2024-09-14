package laba5;

import java.math.BigDecimal;

public class Example4 {
    public static void main(String[] args) {
        Someone4 obj = new Someone4(70.19);
        System.out.println(obj.a + " " + obj.b);
    }
}

class Someone4 {
    char a;
    int b;

    Someone4(char a, int b) {
        this.a = a;
        this.b = b;
    }

    Someone4(double c) {
        String lenghtS = String.valueOf(c);
        int fullNum = (int) c;

        BigDecimal val1 = new BigDecimal(c + 0.001); //исходный тип double конвертируется в BigDecimal (для точности)
        BigDecimal val2 = val1.remainder(BigDecimal.ONE); //обрезается целая часть числа (без потери точности)
        String line = String.valueOf(val2); //переводим дробную часть числа в строку

        if (lenghtS.length() == 4)       //проверяем, какой длины было входящее число (с учётом каждого знака)
            line = line.substring(2, 3); //здесь строка обрезается по краям на нужное число позиций
        else
            line = line.substring(2, 4);

        a = (char) fullNum;
        b = Integer.parseInt(line);
    }
}