package laba9;

import java.util.ArrayList;
import java.util.Scanner;

//реализация через ArrayList

public class Example7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> peoples = new ArrayList<>();
        System.out.println("Сколько человек стоит в кругу?");
        int number = sc.nextInt();
        int i = 0;
        int mod = 0;
        while (i<number){
            peoples.add("people " + (i+1));
            i++;
        }
        i = 1;
        System.out.println("Круг людей сгенерирован: " + peoples + "\n");

        while (peoples.size()!=1){
            for (int j = 0; j < peoples.size(); j++) {

                if (mod==0){      //Чтобы состязание было честным, каждый круг начинается с отсчёта то чётного, то нечётного игрока
                    if (j % 2 != 0) {                //этот блок делает так, что вычёркивается каждый чётный индекс
                        peoples.set(j, "null");
                    }
                }
                else{
                    if (j % 2 == 0) {
                        peoples.set(j, "null");  //этот блок делает так, что вычёркивается каждый нечётный индекс
                    }
                }
            }
            while (peoples.contains("null")){
                peoples.remove("null");
            }
            System.out.println("После " + i + " круга остались: " + peoples);
            i++;
            if (mod==0) mod = 1; //здесь идёт постоянное переключение с 0 на 1 и с 1 на 0, чтобы каждый круг начинал отсчёт не с одного и того же игрока
            else mod = 0;
        }
        System.out.println("Итог игры, остался только: " + peoples);
    }
}
