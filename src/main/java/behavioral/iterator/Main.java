package behavioral.iterator;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    public static void main(String[] args) {
        BinaryTree<Student> studentBinaryTree = new BinaryTree<>();
        System.out.println("adding new item : " + studentBinaryTree.add(new Student(1, "Ali")));
        System.out.println("adding new item : " + studentBinaryTree.add(new Student(2, "Mohammad")));
        System.out.println("adding new item : " + studentBinaryTree.add(new Student(3, "Hasan")));
        System.out.println("adding new item : " + studentBinaryTree.add(new Student(3, "Hasan")));
        System.out.println("item exists : " + studentBinaryTree.contains(new Student(1, null)));
        System.out.println("item exists : " + studentBinaryTree.contains(new Student(4, null)));

    }
}
