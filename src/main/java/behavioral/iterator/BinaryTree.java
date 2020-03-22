package behavioral.iterator;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class BinaryTree<T> {
    private Node<T> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(T data) {
        root = new Node<>(data);
    }

    public boolean delete(T data) {
        if (data == null)
            throw new NullPointerException();
        if (!contains(data))
            return false;
        return delete(root, data);
    }

    public boolean delete(Node<T> current, T data) {
        if (current == null)
            return false;
        throw new RuntimeException("Not Implemented Yet.");
    }

    public boolean add(T data) {
        if (data == null)
            throw new NullPointerException();
        if (contains(data))
            return false;
        root = add(root, data);
        return true;
    }

    private Node<T> add(Node<T> current, T data) {
        if (current == null) {
            current = new Node<>(data);
            return current;
        }
        if (data.hashCode() < current.getData().hashCode())
            current.setLeftChild(add(current.getLeftChild(), data));
        else if (data.hashCode() == current.hashCode()) {
            return current;
        } else {
            current.setRightChild(add(current.getRightChild(), data));
        }
        return current;
    }

    public boolean contains(T data) {
        if (data == null)
            throw new NullPointerException();
        return contains(root, data);
    }

    public boolean contains(Node<T> current, T data) {
        if (current == null)
            return false;
        if (data.hashCode() < current.getData().hashCode())
            return contains(current.getLeftChild(), data);
        else if (data.hashCode() == current.getData().hashCode())
            return true;
        else
            return contains(current.getRightChild(), data);
    }
}
