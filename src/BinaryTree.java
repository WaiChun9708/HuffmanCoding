/**
 * Created by leealvis on 23/6/2017.
 */
public class BinaryTree<T> implements BinaryTreeInterface<T> {

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(T data) {
        root = new Node(data);
    }

    public BinaryTree(T data, BinaryTree<T> left, BinaryTree<T> right) {
        root = new Node(data, left.getRoot(), right.getRoot());
    }

    public BinaryTree(Node node) {
        root = node;
    }

    public Node getRoot() {
        return root;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public T getRootData() {
        return root.getData();
    }

    @Override
    public BinaryTreeInterface<T> getLeftSubtree() {
        if (root != null && root.getLeft() != null) {
            return new BinaryTree<T>(root.getLeft());
        } else {
            return null;
        }
    }

    @Override
    public BinaryTreeInterface<T> getRightSubtree() {
        if (root != null && root.getRight() != null) {
            return new BinaryTree<T>(root.getRight());
        } else {
            return null;
        }
    }

    private class Node {
        private T data;
        private Node left;
        private Node right;

        private Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        private Node(T data) {
            this(data, null, null);
        }

        public T getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }
}
