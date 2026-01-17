public class Q5PrintList {
    public static void main(String[] args) {
       
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        System.out.print("The linked list is: ");
        printList(head);
        System.out.print("The linked list Reverse is: ");
        printReverseList(head);

    }

    public static void printList(ListNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " "); 
        printList(node.next);  
    }
    public static void printReverseList(ListNode node) {
        if (node == null) {
            return;
        }
        printReverseList(node.next);  
        System.out.print(node.val + " "); 
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
