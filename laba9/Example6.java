package laba9;

import java.util.HashMap;


public class Example6 {
    public static void main(String[] args) {
        int sum = 1;
        String name;
        HashMap<Integer,String> users = new HashMap<>();

        users.put(2, "Толя");
        users.put(24, "Александр");
        users.put(1, "Анастасия");
        users.put(16, "Григорий");
        users.put(9, "Роман");
        users.put(4, "Федя");
        users.put(11, "Ирина");
        users.put(0, "Галя");
        users.put(7, "Андрей");
        users.put(13, "Руслан");

        System.out.println("Наш HashMap: " + users);

        System.out.println("\nПОИСК СТРОК, ЧЕЙ КЛЮЧ БОЛЬШЕ 5");
        for (int key : users.keySet()){
            if(key==0)
                System.out.println("\nБыл найден ключ 0, вывожу строки на экран: " + users.values());
            else if(key>5)
                System.out.print(users.get(key) + " ");
        }
        System.out.println("\n\nПЕРЕМНОЖАЕМ КЛЮЧИ, ДЛИНА СТРОК КОТОРЫХ БОЛЬШЕ 5");
        for (int key : users.keySet()){
           name = users.get(key);
           if (name.length()>5){
               sum *= key;
           }
        }
        System.out.println("Произведение ключей = " + sum);
    }
}
