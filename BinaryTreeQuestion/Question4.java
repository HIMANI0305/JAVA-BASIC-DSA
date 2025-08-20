package BinaryTreeQuestion;
//diameter of a tree , number of nodes in thee largest path between any 2 nodes.  Approach1 = O(N^2)
import java.util.*;

public class Question4 {

  static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static int idx = -1;

  public static Node BuildTree(int nodes[]) {
    idx++;
    if (nodes[idx] == -1) {
      return null;
    }

    Node newNode = new Node(nodes[idx]);
    newNode.left = BuildTree(nodes);
    newNode.right = BuildTree(nodes);

    return newNode;
  }

  public static void levelorder(Node root) {
    if (root == null) {
      return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while (!q.isEmpty()) {
      Node currNode = q.remove();
      if (currNode == null) {
        System.out.println();
        if (q.isEmpty()) {
          break;
        } else {
          q.add(null);
        }
      } else {
        System.out.print(currNode.data + " ");
        if (currNode.left != null) {
          q.add(currNode.left);
        }
        if (currNode.right != null) {
          q.add(currNode.right);
        }
      }
    }
  }

  // public static int sumOfNodes(Node root) {
  //   if (root == null) {
  //     return 0;
  //   }
  //   int leftSum = sumOfNodes(root.left);
  //   int rightSum = sumOfNodes(root.right);

  //   return leftSum + rightSum + root.data;
  // }

  public static int height(Node root) {
    if (root == null) {
      return 0;
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    int myHeight = Math.max(leftHeight, rightHeight) + 1;

    return myHeight;
  }

  public static int diameter(Node root) {
    if (root == null) {
      return 0;
    }
    int diam1 = diameter(root.left);
    int diam2 = diameter(root.right);
    int diam3 = height(root.left) + height(root.right) + 1;

    return Math.max(diam3, Math.max(diam1, diam2));
  }

  public static void main(String args[]) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    Node root = BuildTree(nodes);
    // System.out.println(sumOfNodes(root));
    // System.out.println(height(root));
    System.out.println(diameter(root));
  }
}
