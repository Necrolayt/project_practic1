package laba9.Example8_2;

import java.util.Random;

public class Example8_2 {
    static int counter = 0;
    static String line = "";

    public static void main(String[] args) {
        Node head = new Node(0, null);
        createHeadRec(head, 0);
        String s = toString(head);
        System.out.println("Метод createHeadRec был вызван " + counter + " раз.");
        System.out.println("Список: " + s);
        counter = 0;
        head.next = null;
        line = "";

        head = createTailRec(head, 8);
        s = toString(head);
        System.out.println("Метод createTailRec был вызван " + counter + " раз.");
        System.out.println("Список: " + s);

    }

    public static void createHeadRec(Node head, int x) {
        counter++;
        if (x < 6) {
            Random rand = new Random();
            Node newTail = new Node(rand.nextInt(0, 20), null);
            Node ref = head;
            while (ref.next != null) {
                ref = ref.next;
            }
            ref.next = newTail;
            createHeadRec(ref, x + 1);
        }
        Random rand = new Random();
        head.value = rand.nextInt(0, 20);
    }

    public static Node createTailRec(Node head, int x) {
        counter++;
        if (x == 0) {
            return null;
        }
        Random rand = new Random();
        head.next = createTailRec(new Node(rand.nextInt(0, 100), null), x - 1);
        return head;
    }

    public static String toString(Node head) {
        if (head.next != null) {
            head = head.next;
            toString(head);
        }
        line += head.value + " ";
        return line;
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
