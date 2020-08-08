package behavioral.iterator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class BinaryTreeCollection<E> implements TreeCollection<E> {
    private Node<E> root;
    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null)
            throw new NullPointerException();
        return contains(root, o);
    }

    private boolean contains(Node<E> node, Object o) {
        if (node == null)
            return false;
        if (o.hashCode() < node.getData().hashCode()) {
            return contains(node.getLeftChild(), o);
        } else if (node.getData().hashCode() == o.hashCode()) {
            return true;
        } else {
            return contains(node.getRightChild(), o);
        }
    }

    /***
     * default iterator is Depth First Traversal
     * but you can use Breadth First Traversal
     */
    @Override
    public Iterator<E> iterator() {
        return new DFTIterator<>(root);
    }

    public Iterator<E> dftIterator() {
        return new DFTIterator<>(root);
    }

    public Iterator<E> bftIterator() {
        return new BFTIterator<>();
    }

    @Override
    public Object[] toArray() {
        if (this.size == 0)
            return new Object[]{};
        Object[] contents = new Object[this.size];
        fillContents(contents, root, this.size - 1);
        return contents;
    }

    private int fillContents(Object[] contents, Node<E> node, int index) {
        if (node == null)
            return index;
        index = fillContents(contents, node.getRightChild(), index);
        contents[index--] = node.getData();
        return fillContents(contents, node.getLeftChild(), index);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            return (T[]) Arrays.copyOf(toArray(), size, a.getClass());
        System.arraycopy(toArray(), 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

    /***
     *
     * @param e item to be added
     * @return true if added. if e exists(checking via hashCode) update value and return false.
     */
    @Override
    public boolean add(E e) {
        if (e == null)
            throw new NullPointerException();
        boolean contains = contains(e);
        if (!contains) size++;
        root = add(root, e);
        return !contains;
    }

    private Node<E> add(Node<E> node, E e) {
        if (node == null)
            return new Node<>(e);

        if (e.hashCode() < node.getData().hashCode())
            node.setLeftChild(add(node.getLeftChild(), e));
        else if (e.hashCode() == node.getData().hashCode()) {
            return new Node<>(e, node.getLeftChild(), node.getRightChild());
        } else
            node.setRightChild(add(node.getRightChild(), e));
        return node;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null)
            throw new NullPointerException();
        //not supported yet
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (c == null)
            throw new NullPointerException();
        for (Object o : c) {
            if (!contains(o))
                return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        if (c == null)
            throw new NullPointerException();
        int newItems = 0;
        for (E e : c) {
            if (add(e))
                newItems++;
        }
        return newItems > 0;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        //not supported yet
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        if (c == null)
            throw new NullPointerException();
        clear();
        for (Object o : c) {
            add((E) o);
        }
        return true;
    }

    @Override
    public void clear() {
        root = clear(root);
        size = 0;
    }

    private Node<E> clear(Node<E> node) {
        if (node != null) {
            clear(node.getRightChild());
            clear(node.getRightChild());
        }
        return null;
    }
}
