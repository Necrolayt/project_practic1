package laba9;
//создание списка с "головы"
public class Example5_1 {
    public static void main(String[] args) {
        Node node0 = new Node(5,null);
        Node node1 = new Node(12,null);
        Node node2 = new Node(6,null);
        Node node3 = new Node(0,null);
        Node node4 = new Node(24,null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node ref = node0;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }


    }
}
