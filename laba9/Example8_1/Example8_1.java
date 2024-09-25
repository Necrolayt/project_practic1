package laba9.Example8_1;

import java.util.Random;
import java.util.Scanner;

public class Example8_1 {
    public static void main(String[] args) {

        Node head = new Node(0, null);

        createHead(head);
        System.out.println(toString(head));
        head = createTail(head);
        System.out.println(toString(head));
        head = addFirst(head);
        System.out.println(toString(head));
        addLast(head);
        System.out.println(toString(head));
        insert(head);
        System.out.println(toString(head));
        head = removeFirst(head);
        System.out.println(toString(head));
        removeLast(head);
        System.out.println(toString(head));
        remove(head);
        System.out.println(toString(head));
    }//main

    public static void createHead(Node head) {
        Random rand = new Random();
        head.next = null; //обнуление ссылки нужно, если метод будет вызван повторно, и нужно будет создать новый список
        head.value = rand.nextInt(0, 100);
        for (int i = 0; i < 6; i++) {
            Node newTail = new Node(rand.nextInt(0, 100), null);
            Node ref = head;
            while (ref.next != null) {
                ref = ref.next;
            }
            ref.next = newTail;
        }
        System.out.println("Был вызван метод createHead, список сгенерирован с головы");
    }

    public static Node createTail(Node head) {
        Random rand = new Random();
        head.next = null;
        head.value = rand.nextInt(0,100);
        for (int i = 6; i > 0; i--) {
            head = new Node(rand.nextInt(0, 100), head);
        }
        System.out.println("Был вызван метод createTail, список сгенерирован с хвоста");
        return head;
    }

    public static String toString(Node head) {
        String s = "Текущий список: ";
        Node ref = head;
        while (ref != null) {
            s += (ref.value) + " ";
            ref = ref.next;
        }
        s += "\n";
        return s;
    }

    public static Node addFirst(Node head){
        Random rand = new Random();
        int x = rand.nextInt(0,100);
        System.out.println("Был вызван метод addFirst, добавлен элемент " + x);
        head = new Node (x, head);
        Node ref = head;
        return head;
    }

    public static void addLast(Node head){
        Random rand = new Random();
        int x = rand.nextInt(0, 100);
        Node newTail = new Node(x,null);
        System.out.println("Был вызван метод addLast, добавлен элемент " + x);
        Node ref = head;
        while(ref.next != null){
            ref = ref.next;
        }
        ref.next = newTail;

    }

    public static void insert (Node head){
        Random rand = new Random();
        Scanner scn = new Scanner(System.in);
        int input =0;
        int x = rand.nextInt(0, 100);
        System.out.println("Был вызван метод insert, добавляется элемент " + x + ", введите номер индекса, куда вы хотите вставить новый элемент:");
        while (true){
            input = scn.nextInt();
            if (input>nodeLength(head) | input<1)
                System.out.println("Введено некорректное число!");
            else
                break;
        }
        Node newNode = new Node(x, null);
        Node ref = head;
        int k = 1;
        while (ref.next != null & k<input){
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
    }

    public static Node removeFirst(Node head){
        System.out.println("Был вызван метод removeFirst, удаляется первый элемент");
        Node ref = head;
        ref = ref.next;
        return ref;
    }

    public static void removeLast(Node head){
        System.out.println("Был вызван метод removeLast, удаляется последний элемент");
        Node ref = head;
        while (ref.next.next != null){
            ref = ref.next;
        }
        ref.next = null;
    }

    public static void remove(Node head){
        Scanner scn = new Scanner(System.in);
        int input =0;
        System.out.println("Был вызван метод remove, введите номер индекса, данные по которому вы хотите удалить:");
        while (true){
            input = scn.nextInt();
            if (input>nodeLength(head) | input<1)
                System.out.println("Введено некорректное число!");
            else
                break;
        }
        Node ref = head;
        int k = 1;
        while (ref.next != null & k<input){
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
    }

    //метод находит длинну односвязного списка
    public static int nodeLength(Node head){
        int elements = 0;
        Node ref = head;
        while (ref.next != null){
            ref = ref.next;
            elements++;
        }
        return elements;
    }
}

class Node {
    public int value;
    public Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
    Node() {
    }
}