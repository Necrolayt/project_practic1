package laba9;

import java.util.*;

public class Example_test {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        Set<Integer> treeSet = new TreeSet<>();
        arraylist.clear();
        arrayDeque.clear();
        treeSet.clear();

//        System.out.println("Время выполнения операции добавления в начало arrayList: " + getRunningTimeListStartAdd(arraylist));
//        System.out.println("Время выполнения операции добавления в середину arrayList: " + getRunningTimeListMediumAdd(arraylist));
//        System.out.println("Время выполнения операции добавления в конец arrayList: " + getRunningTimeListEndAdd(arraylist));
//        System.out.println("Время выполнения операции добавления в начало arrayDeque: " + getRunningTimeDequeAddStart(arrayDeque));
//        System.out.println("Время выполнения операции добавления в конец arrayDeque: " + getRunningTimeDequeAddEnd(arrayDeque));
//        System.out.println("Время выполнения операции добавления treeSet (в любое место): " + getRunningTimeTreeAdd(treeSet));

//        System.out.println("Время выполнения операции удаления из начала arrayList: " + getRunningTimeListStartRemove(arraylist));
//        System.out.println("Время выполнения операции удаления из середины arrayList: " + getRunningTimeListMediumRemove(arraylist));
//        System.out.println("Время выполнения операции удаления из конца arrayList: " + getRunningTimeListEndRemove(arraylist));
//        System.out.println("Время выполнения операции удаления из начала arrayDeque: " + getRunningTimeDequeRemoveStart(arrayDeque));
//        System.out.println("Время выполнения операции удаления из конца arrayDeque: " + getRunningTimeDequeRemoveEnd(arrayDeque));
//        System.out.println("Время выполнения операции  удаления treeSet из начала: " + getRunningTimeTreeRemoveStart(treeSet));
//        System.out.println("Время выполнения операции  удаления treeSet из середины: " + getRunningTimeTreeRemoveMedium(treeSet));
//        System.out.println("Время выполнения операции  удаления treeSet из конца: " + getRunningTimeTreeRemoveEnd(treeSet));

        System.out.println("Время выполнения получения элемента по индексу arrayList: " + getRunningTimeListGetIndex(arraylist));
        System.out.println("Время выполнения получения элемента по индексу arrayDeque: " + getRunningTimeDequeGetIndex(arrayDeque));
        System.out.println("Время выполнения получения элемента по индексу treeSet: " + getRunningTimeTreeGetIndex(treeSet));
    }

    //методы для ArrayList
    private static long getRunningTimeListStartAdd (List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeListMediumAdd (List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            list.add(list.size()/2,i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeListEndAdd (List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeListStartRemove (List<Integer> list) {
        for (int i = 0; i < 500000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            list.removeFirst();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeListMediumRemove (List<Integer> list) {
        for (int i = 0; i < 500000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            list.remove(list.size()/2);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeListEndRemove (List<Integer> list) {
        for (int i = 0; i < 500000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            list.removeLast();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeListGetIndex (List<Integer> list){

        for (int i = 0; i < 500000; i++) {
            list.add(0,i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    //методы для ArrayDeque
    private static long getRunningTimeDequeAddStart (ArrayDeque<Integer> deq){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            deq.addFirst(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeDequeAddEnd (ArrayDeque<Integer> deq){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            deq.addLast(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeDequeRemoveStart (ArrayDeque<Integer> deq){
        for (int i = 0; i < 500000; i++) {
            deq.addFirst(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            deq.removeFirst();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeDequeRemoveEnd (ArrayDeque<Integer> deq){
        for (int i = 0; i < 500000; i++) {
            deq.addFirst(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            deq.removeLast();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeDequeGetIndex (ArrayDeque<Integer> deq){
        for (int i = 0; i < 500000; i++) {
            deq.addFirst(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            deq.getFirst();
            deq.removeFirst();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    //методы для TreeSet
    private static long getRunningTimeTreeAdd (Set<Integer> set){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            set.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeTreeRemoveStart (Set<Integer> set){
        for (int i = 0; i < 500000; i++) {
            set.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            set.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeTreeRemoveMedium (Set<Integer> set){
        for (int i = 0; i < 500000; i++) {
            set.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            set.remove(set.size()/2);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeTreeRemoveEnd (Set<Integer> set){
        for (int i = 0; i < 500000; i++) {
            set.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 500000; i > 0; i--) {
            set.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeTreeGetIndex (Set<Integer> set){
        for (int i = 0; i < 500000; i++) {
            set.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            set.contains(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
