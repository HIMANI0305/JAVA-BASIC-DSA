package LinkedList;

public class ReverseRecursive {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // Recursive reverse method
  public static Node reverseRecursive(Node head) {
    // Base case: empty list or single node
    if (head == null || head.next == null) {
      return head;
    }

    // Reverse the rest of the list
    Node newHead = reverseRecursive(head.next);

    // Adjust pointers
    head.next.next = head;
    head.next = null;

    return newHead;
  }

  // Print helper
  public static void printList(Node head) {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data + " -> ");
      curr = curr.next;
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

    head = reverseRecursive(head);

    System.out.println("Reversed List:");
    printList(head);
  }
}
