class Solution {
  public Node connect(Node root) {
    if (root == null) {
      return root;
    }

    connectNexts(root);
    connect(root.right);
    connect(root.left);
    return root;
  }

  void connectNexts(Node root) {
    if (root == null) {
      return;
    }

    if (root.right != null) {
      if (root.next != null) {
        root.right.next = findNode(root.next);
      }
      if (root.left != null) {
        root.left.next = root.right;
      }
    } else {
      if (root.left != null && root.next != null) {
        root.left.next = findNode(root.next);
      }
    }
    // connectNexts(root.next);
  }

  Node findNode(Node root) {

    while (root != null) {
      if (root.left != null) {
        return root.left;
      }

      if (root.right != null) {
        return root.right;
      }

      root = root.next;
    }

    return null;
  }
}