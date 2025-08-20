package LinkedList;

public class ReverseLL {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node reverse(Node head) {
    Node prev = null;
    Node curr = head;

    while (curr != null) {
      Node next = curr.next; // store next
      curr.next = prev;      // reverse current node's pointer
      prev = curr;           // move prev one step
      curr = next;           // move curr one step
    }

    return prev; // new head
  }

  // Helper to print list
  public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);

    System.out.println("Original List:");
    printList(head);

    head = reverse(head);

    System.out.println("Reversed List:");
    printList(head);
  }
}

