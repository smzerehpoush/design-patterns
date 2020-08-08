package behavioral.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class DFTIterator<E> implements Iterator<E> {
    private IterableNode<E> cursor;

    public DFTIterator(Node<E> cursor) {
        this.cursor = new IterableNode<>(cursor);
    }

    @Override
    public boolean hasNext() {
        if (cursor == null)
            return false;
        return hasNext(cursor.rightChild) || !cursor.seen || hasNext(cursor.leftChild);
    }

    private boolean hasNext(IterableNode<E> cursor) {
        return cursor != null && !cursor.seen;
    }

    @Override
    public E next() {
        if (cursor == null)
            throw new NoSuchElementException();
        cursor = next(cursor);
        return cursor.data;
    }

    private IterableNode<E> next(IterableNode<E> cursor) {
//        if (cursor == null)
//            throw new NoSuchElementException();
//        if (cursor.leftChild == null) {
//            if (cursor.seen) {
//                return next(cursor.parent);
//            } else {
//                cursor.seen = true;
//                return cursor;
//            }
//        } else {
//            if (cursor.leftChild.seen) {
//                cursor.leftChild.seen = true;
//                return cursor.leftChild;
//            } else
//                next(cursor.leftChild);
//        }
//        if (!cursor.seen) {
//            cursor.parent.seen = true;
//            return cursor.parent;
//        } else {
//            return next(cursor.parent);
//        }
//        if (cursor.leftChild != null) {
//            return next(cursor.leftChild);
//        } else {
//            cursor.seen
//        }
        return null;
    }

    private final class IterableNode<E> {
        private E data;
        private IterableNode<E> parent;
        private IterableNode<E> rightChild;
        private IterableNode<E> leftChild;

        private boolean seen;

        public IterableNode(Node<E> node) {
            this(node, null);
        }

        public IterableNode(Node<E> node, IterableNode<E> parent) {
            if (node == null)
                return;
            this.data = node.getData();
            this.parent = parent;
            this.leftChild = new IterableNode<>(node.getLeftChild(), this);
            this.rightChild = new IterableNode<>(node.getRightChild(), this);
            this.seen = false;
        }
    }
}
