import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class TreeTraversal {
    // Inorder Traversal (Left → Root → Right)
    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    // Preorder Traversal (Root → Left → Right)
    void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    // Postorder Traversal (Left → Right → Root)
    void postorder(Node root) {
        if (root != null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }


}


public class TreeDemo {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right = new Node(20);
        System.out.println("Tree Structure:");

        System.out.println("        " + root.data);
        System.out.println("       / \\");
        System.out.println("     " + root.left.data + "    " + root.right.data);
        System.out.println("    / \\");
        System.out.println("  " + root.left.left.data + "   " + root.left.right.data);

        TreeTraversal tt = new TreeTraversal();

        System.out.println("Inorder Traversal:");
        tt.inorder(root);

        System.out.println("\nPreorder Traversal:");
        tt.preorder(root);

        System.out.println("\nPostorder Traversal:");
        tt.postorder(root);

    }
}
