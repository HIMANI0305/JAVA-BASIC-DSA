package BinaryTreeDSA;
//inorder traversal
public class TraversalQ2 {

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

  // public static void preorder(Node root) {
  // if (root == null) {
  // return;
  // }
  // System.out.print(root.data + " ");
  // preorder(root.left);
  // preorder(root.right);
  // }

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static void main(String args[]) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    Node root = BuildTree(nodes);
    // preorder(root);
    inorder(root);
  }
}
