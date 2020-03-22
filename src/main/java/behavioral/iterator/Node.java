package behavioral.iterator;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Node<T> {
    private T data;
    private Node<T> rightChild;
    private Node<T> leftChild;

    public Node(T data) {
        this.data = data;
        rightChild = null;
        leftChild = null;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public T getData() {
        return data;
    }
}
