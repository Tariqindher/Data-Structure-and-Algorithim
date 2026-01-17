
class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class Task9 {
    Node head1;
    Node head2;
    Node head3;

    public void addtoFrontL1(int data) {
        Node newNode = new Node(data);
        if (head1 == null) {
            head1 = newNode;
        } else {
            newNode.next = head1;
            head1 = newNode;
        }
    }

    public void addtoFrontL2(int data) {
        Node newNode = new Node(data);
        if (head2 == null) {
            head2 = newNode;
        } else {
            newNode.next = head2;
            head2 = newNode;
        }
    }

    public void mergeLists() {
        Node temp1 = head1;
        Node temp2 = head2;
        Node tail = null;

        while (temp1 != null && temp2 != null) {
            Node newNode;
            if (temp1.data <= temp2.data) {
                newNode = new Node(temp1.data);
                temp1 = temp1.next;
            } 
            else {
                newNode = new Node(temp2.data);
                temp2 = temp2.next;
            }

            if (head3 == null) {
                head3 = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        while (temp1 != null) {
            Node newNode = new Node(temp1.data);
            tail.next = newNode;
            tail = newNode;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            Node newNode = new Node(temp2.data);
            tail.next = newNode;
            tail = newNode;
            temp2 = temp2.next;
        }
    }

    public void displayMerged() {
        if (head3 == null) {
            System.out.println("Merged list is empty");
            return;
        }
        Node temp = head3;
        while (temp != null) {
            System.out.print(temp.data + " > ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Task9 list = new Task9();
        list.addtoFrontL1(5);
        list.addtoFrontL1(20);
        list.addtoFrontL1(15);
        list.addtoFrontL2(10);
        list.addtoFrontL2(30);
        list.addtoFrontL2(25);
        list.mergeLists();
        list.displayMerged();
    }
}
