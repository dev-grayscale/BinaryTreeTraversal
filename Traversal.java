/**
 * How to traverse a binary tree
 *
 * Because of their <b>recursive</b> nature, there are 3 methods of traversal, and
 * they differ only by the order of the visited elements.
 *
 * For this explanation, we'll use the following representation of a Binary Tree Node:
 *
 * public class Node {
 *   public String data;
 *   public Node left;
 *   public Node right;
 * }
 *
 * Complexity for the following implementations:
 *
 * Time Complexity: O(2^d - 1) - Only perfect binary trees will match this runtime exactly, the rest might have fewer nodes to visit
 * Space Complexity: O(d) - as during recursion that's the maximum frames that will be allocated at a time
 *
 * where <b>d</b> is the depth of the tree
 */
public class Traversal {

  /**
   * left -> root -> right
   *
   * When executed on binary search tree, it visits the nodes in ascending order
   */
  public static void inOrder(Node node) {
    if (node != null) {
      inOrder(node.left);
      System.out.println(node.data);
      inOrder(node.right);
    }
  }

  /**
   * root -> left -> right
   *
   * Always visits the root node first, then left and right
   */
  public static void preOrder(Node node) {
    if (node != null) {
      System.out.println(node.data);
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  /**
   * left -> right -> root
   *
   * Root is the last node to be visited, left first, right second.
   */
  public static void postOrder(Node node) {
    if (node != null) {
      postOrder(node.left);
      postOrder(node.right);
      System.out.println(node.data);
    }
  }
}
