package LinkedList;

public class LL {
  // Head node of the linked list
  Node head;
  private int size;

  // Constructor
  LL() {
    this.size = 0;
  }

  // Node class (inner class)
  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  // Add element at the beginning
  public void addFirst(String data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  // Add element at the end
  public void addLast(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = newNode;
  }

  // Print the linked list
  public void printList() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    Node currNode = head;
    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println("NULL");
  }

  // Delete the first element
  public void deleteFirst() {
    if (head == null) {
      System.out.println("The list is empty");
      return;
    }
    head = head.next;
    size--;
  }

  // Delete the last element
  public void deleteLast() {
    if (head == null) {
      System.out.println("The list is empty");
      return;
    }

    size--;

    if (head.next == null) {
      head = null;
      return;
    }

    Node secondLast = head;
    Node lastNode = head.next;

    while (lastNode.next != null) {
      secondLast = secondLast.next;
      lastNode = lastNode.next;
    }

    secondLast.next = null;
  }

  // Return size of the list
  public int getSize() {
    return size;
  }

  // Main method to test the linked list
  public static void main(String[] args) {
    LL list = new LL();
    list.addFirst("A");
    list.addFirst("is");
    list.printList();        // is -> A -> NULL

    list.addLast("list");
    list.printList();        // is -> A -> list -> NULL

    list.addFirst("This");
    list.printList();        // This -> is -> A -> list -> NULL

    list.deleteFirst();
    list.printList();        // is -> A -> list -> NULL

    list.deleteLast();
    list.printList();        // is -> A -> NULL

    System.out.println("Size: " + list.getSize());  // Size: 2

    list.addFirst("this");
    System.out.println("Size: " + list.getSize());  // Size: 3
  }
}
