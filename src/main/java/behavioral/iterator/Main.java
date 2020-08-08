package behavioral.iterator;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    public static void main(String[] args) {
        TreeCollection<Student> studentBinaryTree = new BinaryTreeCollection<>();
        System.out.println("adding new item : " + studentBinaryTree.add(new Student(1, "Ali")));
        System.out.println("adding new item : " + studentBinaryTree.add(new Student(3, "Mohammad")));
        System.out.println("adding new item : " + studentBinaryTree.add(new Student(5, "Hasan")));
        System.out.println("adding new item : " + studentBinaryTree.add(new Student(2, "Akbar")));
        System.out.println("adding new item : " + studentBinaryTree.add(new Student(4, "Ahmad")));
        System.out.println("item exists : " + studentBinaryTree.contains(new Student(2, null)));
        System.out.println("item exists : " + studentBinaryTree.contains(new Student(4, null)));
        Object[] arr = studentBinaryTree.toArray();
        for (Object o : arr) {
            System.out.println(((Student) o).getId());
        }
    }
}
