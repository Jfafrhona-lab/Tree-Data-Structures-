class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void addNode(int data) {
        root = addRecursive(root, data);
    }

    Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            // value already exists
            return current;
        }

        return current;
    }


    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.addNode(8);
        tree.addNode(3);
        tree.addNode(10);
        tree.addNode(1);
        tree.addNode(6);
        tree.addNode(14);
        tree.addNode(4);
        tree.addNode(7);
        tree.addNode(13);

        System.out.println("Inorder traversal of the constructed tree is ");
        tree.inorderTraversal(tree.root);
    }
}
